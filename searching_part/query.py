from elasticsearch import Elasticsearch
from sinling import SinhalaTokenizer
from sinling import word_splitter

es  = Elasticsearch()
tokenizer = SinhalaTokenizer()
artist_name_boosters = ['ගේ', 'කීව', 'කී', 'ගායනා කරන', 'ගයන', 'ගායනා','‌ගේ', 'හඩින්', 'කියනා', 'කිව්ව', 'කිව්', 'කිව', 'ගායනය', 'ගායනා කළා', 'ගායනා කල', 'ගැයූ']
writer_name_boosters = ['ලියා', 'ලියූ', 'ලිව්ව', 'ලිව්', 'රචනා',  'ලියා ඇති', 'රචිත', 'ලියන ලද','ලියන', 'හදපු', 'පද', 'රචනය', 'හැදූ', 'හැදුව', 'ලියන', 'ලියන්න','ලීව', 'ලියපු', 'ලියා ඇත', 'ලිඛිත']
music_boosters = ["වාදනය","සංගීතය","නාද"]
movie_boosters=['චිත්‍රපට','සිනමා']
genre_boosters = ['දේවානුභාවයෙ','පැරණි', 'පොප්ස්','පොප්','පරණ','ක්ලැසික්','ක්ලැසි','ඉල්ලීම','චිත්‍රපට','නව', 'වර්ගයේ', 'අයත්', 'වර්ගයට' ,'කණ්ඩායම්','යුගල' ]
views_boosters = ['සුපිරි', 'නියම', 'ප්‍රමුඛතම','පට්ට','ඉහළම', 'ගෝල්ඩන්','හොඳ', 'හොඳම', 'එලකිරි', 'එළකිරි', 'සුප්පර්', 'සුප්රකට', 'ඉහල',  'වැඩිපුර', 'වැඩිපුරම', 'සුප්‍රකට', 'ජනප්රිය', 'ජනප්රියම', 'ජනප්‍රිය', 'ජනප්‍රියම', 'ප්‍රකට', 'ප්‍රසිද්ධ']
boosts_default = {"title_sinhala":1,"artist_name":1,"writer_name":1,"music":1,"movie":1,"genre":1,"lyrics":1}

class ElasticSearchQuery :
    def __init__(self):
        print("init")

    @classmethod
    def process_Query(self,query):
        res = self.process(query)
        # print(res)
        return res
  
    @classmethod
    def process_Query_Type(self,tokens):
        boost_params = []
        boosts = {"title_sinhala":1,"artist_name":1,"writer_name":1,"music":1,"movie":1,"genre":1,"lyrics":1}
        additional_tokens =[]
        for token in tokens:
            splits = word_splitter.split(token)
            additional_tokens.append(splits['base'])

            if(token in views_boosters or splits['affix'] in views_boosters or splits['base'] in views_boosters):
                boost_params.append("view")
            if(token in artist_name_boosters or splits['affix'] in artist_name_boosters or splits['base'] in artist_name_boosters):
                boost_params.append("artist_name")
                boosts['artist_name'] = 2
            if(token in writer_name_boosters or splits['affix'] in writer_name_boosters or splits['base'] in writer_name_boosters):
                boost_params.append("writer_name")
                boosts['writer_name'] = 2
            if(token in music_boosters or splits['affix'] in music_boosters or splits['base'] in music_boosters):
                boost_params.append("music")
                boosts['music'] = 2
            if(token in movie_boosters or splits['affix'] in movie_boosters or splits['base'] in movie_boosters):
                boost_params.append("movie")
                boosts['movie'] = 2
            if(token in genre_boosters or splits['affix'] in genre_boosters or splits['base'] in genre_boosters):
                boost_params.append("genre")
                boosts['genre'] = 2
       
        query_mod = " ".join(tokens+additional_tokens)
        return set(boost_params),boosts,query_mod
            

    @classmethod
    def process(self,query):
        tokens = tokenizer.tokenize(query)
        boosts_params,boosts,query_mod= self.process_Query_Type(tokens)
        if("view" in boosts_params and len(boosts_params)>1):
            sortByview = True
            res = es.search(index='songs',body = self.matching(query_mod,boosts,sortByview))
        elif("view" in boosts_params and len(boosts_params)==1):
            sortByview = True
            if(len(tokens) == 1):
                res = es.search(index='songs',body = self.all_matching_best(sortByview))
            else:
                res = es.search(index='songs',body = self.matching(query_mod,boosts,sortByview))
        else:
            sortByview = False
            res = es.search(index='songs',body = self.matching(query_mod,boosts,sortByview))
        return res

    def matching(query,boosts,sortByview):
        body = {
            "query":{
                "multi_match": {
                    "query": query,
                    "operator":"or",
                    "fields":[
                        "title_sinhala^"+str(boosts["title_sinhala"]),
                        "artist_name^"+str(boosts['artist_name']),
                        "music^"+str(boosts["music"]),
                        "movie^"+str(boosts["movie"]),
                        "writer_name^"+str(boosts["writer_name"]),
                        "genre^"+str(boosts["genre"]),
                        "lyrics^"+str(boosts["lyrics"])]
                } 
        }
        }
        if(sortByview):
            body["sort"] = [{"views" : {"order" : "desc"}}]
            
        body["aggs"] =  {
                "genre_agg":{
                    "terms": {
                        "field":"genre.keyword",
                        "size":10
                    }
                }
        }
        return body
    
    def all_matching_best(sortByview):
        body = {
            "query":{
                "match_all": {} 
            }
        }
        if(sortByview):
            body["sort"]=[{"views" : {"order" : "desc"}}]
        body["aggs"] =  {
                "artist_agg": {
                    "terms": {
                        "field":"artist.keyword",
                        "size":20
                    }
                },
                "genre_agg":{
                    "terms": {
                        "field":"genre.keyword",
                        "size":10
                    }
                }
            }
        return body
        
        