import scrapy
import requests
from scrapy.spiders import SitemapSpider
from scrapy.http.request import Request
import re
import os

class SinhlaSongSpider(scrapy.Spider):
    name = "sinhala_songs_spider"
    allowed_domains = ["sinhalasongbook.com"]
    start_urls = ["https://sinhalasongbook.com/all-sinhala-song-lyrics-and-chords/?_page=" + str(x) for x in range(1,23)]    
    def parse(self, response):       
        for href in response.xpath("//main[contains(@id, 'genesis-content')]//div[contains(@class, 'entry-content')]//div[contains(@class, 'pt-cv-wrapper')]//h4[contains(@class, 'pt-cv-title')]/a/@href"):
            href =  href.extract()       
            yield scrapy.Request(href, callback=self.parse_lyrics_from_href)

    def parse_lyrics_from_href(self,response):
        song_page = response
        title = (song_page.xpath('//div[@class="entry-content"]/h2/text()')).get()
        title_sinhala = (song_page.xpath('//span[@class="sinTitle"]/text()')).get()

        artist_name = song_page.xpath('//div[@class="su-row"]//span[@class="entry-categories"]//a/text()').extract()
        artist_name_data = (','.join(artist_name))

        genre = song_page.xpath('//div[@class="su-row"]//span[@class="entry-tags"]//a/text()').extract()
        genre_data = (','.join(genre))
        
        writer_name = song_page.xpath('//div[@class="su-row"]//span[@class="lyrics"]//a/text()').extract()
        writer_name_data = (','.join(writer_name))
        
        music  = song_page.xpath('//div[@class="su-row"]//span[@class="music"]//a/text()').extract()
        music_data = (','.join(music))
        
        movie  = song_page.xpath('//div[@class="su-row"]//span[@class="movies"]//a/text()').extract()
        movie_data = (','.join(movie))

        views = song_page.xpath('//div[@class="tptn_counter"]/text()').extract()
        views_data = ','.join(views).replace("Visits","").replace("-","").strip()

        song_body = (song_page.xpath('//div[@class="entry-content"]//pre/text()').extract())
        song_body_split = []
        for parts in song_body:
            lines = parts.split('\n')
            for line in lines:
                song_body_split.append(line)
        
        song = ""
        chords = ""

        for line in song_body_split:
            if(re.search('[a-zA-Z]', line)):
               chords = chords + line +"\n"
            else:
                if(len(line)!=0):
                    line = line.replace('+','')
                    line = line.replace('|','')
                    line.strip()
                    song = song + line + os.linesep
                
        
        yield {
            'title': title,
            'title_sinhala': title_sinhala,
            'artist_name' : artist_name_data,
            'genre' : genre_data,
            'views': views_data,
            'writer_name' : writer_name_data,
            'music' : music_data,
            'song' : song,
            'movie' : movie_data
        }
