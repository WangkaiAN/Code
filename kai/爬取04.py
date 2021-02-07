from bs4 import BeautifulSoup
# s = "<div><a href='http://www.baidu.com'>baidu</a></div>"

# print(obj)
#
# print(obj.div)
# print(obj.a.attrs)
# obj.a.get_text()
from urllib import request
import re
url = 'https://movie.douban.com/top250'
herders={
    'User-Agent':'Mozilla/5.0 (Windows NT 6.1;WOW64) AppleWebKit/537.36 (KHTML,like GeCKO) Chrome/45.0.2454.85 Safari/537.36 115Broswer/6.0.3',
    'Referer':'https://movie.douban.com/',
    'Connection':'keep-alive'}
req = request.Request(url,headers=herders)
req = request.urlopen(req)
con = req.read().decode('utf-8')
# print(con)
obj = BeautifulSoup(con,'html5lib')
# print(obj.title.string)
listdiv = obj.find_all(width="100")
for div in listdiv:
    print(div)
# listab = obj.find_all(['a','b'])
# for ab in listab:
#     print(ab)