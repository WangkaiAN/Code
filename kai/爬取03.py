import re
from urllib import request
#https://movie.douban.com/top250?start=25&filter=
base_url = 'https://movie.douban.com/top250?start=%d&filter='
herders={
    'User-Agent':'Mozilla/5.0 (Windows NT 6.1;WOW64) AppleWebKit/537.36 (KHTML,like GeCKO) Chrome/45.0.2454.85 Safari/537.36 115Broswer/6.0.3',
    'Referer':'https://movie.douban.com/',
    'Connection':'keep-alive'}

class spider_douban250(object):
    def __init__(self, url = None, start = 50, step = 25, total = 250):
        self.durl = url
        self.dstart = start
        self.dstep = step
        self.dtotal = total

    def start_download(self):
        while self.dstart < self.dtotal:
            durl = self.durl%self.dstart
            print(durl)
            self.load_page(durl)
            self.dstart += self.dstep
            print(self.dstart)

    def load_page(self, url):
        print (url)
        req = request.Request(base_url, headers=herders)
        req = request.urlopen(req)
        if req.code != 200:
            return
        con = req.read().decode('utf-8')
        listli = re.findall(r'<li>(.*?)</li>', con, re.S)

        for li in listli:
            imginfo = re.findall(r'<img.*?>', li)
            if imginfo:
                imginfo = imginfo[0]
                print (imginfo)
                result = imginfo.split('alt=')[1]
                result = result.split(' src=')
                imgurl = result[1].split(' ')[0].strip()
                result[1] = imgurl
                info = [item.strip()[1:-1] for item in result]
                self.load_img(info)

    def load_img(self, info):
        imgreq = request.urlopen(info[1])
        img_c = imgreq.read()
        imgf = open('D:\\python爬虫\\' + info[0] + '.jpg', 'wb')
        imgf.write(img_c)
        imgf.close()

spider = spider_douban250(base_url, start=0, step=25, total=50)
spider.start_download()