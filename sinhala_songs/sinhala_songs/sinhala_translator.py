import json
from googletrans import Translator
import re
import os

translator=Translator()

with open('song_output.json' , encoding='utf-8') as f:
  objects = json.load(f)

formatted_list= []


def generate_title_to_sinhala(title,title_sinhala):
  if(title_sinhala == None):
        tra=translator.translate (title.split('|')[1],dest='si').text
        return tra
  else:
        return title_sinhala

def generate_title_to_singlish(title):
  if(title == None):
    return None
  else:
    return title.strip().split('|')[0]

def convert_to_sinhala(text):     
  if(text==None):
        return None
  else:
        tra=translator.translate(text,dest="si").text 
        return tra


def format_song(song,id):
  obj = {
    "id": id,
    "title_singlish" :  generate_title_to_singlish(song['title']),
    "title_sinhala" : generate_title_to_sinhala(song['title'],song['title_sinhala']),
    "artist_name" :  convert_to_sinhala(song['artist_name']),
    "genre" : convert_to_sinhala(song['genre']),
    "writer_name" : convert_to_sinhala(song['writer_name']),
    "music" : convert_to_sinhala(song['music']),
    "movie" : convert_to_sinhala(song['movie']),
    "views" : int(song['views'].replace(",","")),
    "lyrics" : song['song'].strip()
  }
  return obj

c = 0
for song in objects:
    c +=1  
    if(song['title'] == None or len(song['title'].split('|'))==1):
        c -=1 
        continue
    obj = format_song(song,c) 
    print(obj)
    formatted_list.append(obj)
    

with open('sinhala_song_lyrics.json' ,'w', encoding='utf-8') as outf:
  json.dump(formatted_list,outf,indent=4,ensure_ascii=False)