from elasticsearch import Elasticsearch,helpers
import json


with open('lyrics.json' , encoding='utf-8') as file:
  objects = json.load(file)

elastic_search  = Elasticsearch()
helpers.bulk(elastic_search,objects,index="songs",doc_type='_doc')