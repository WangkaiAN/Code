from urllib import request
import re
from bs4 import BeautifulSoup
url = 'https://y.qq.com/n/yqq/song/001z4tFZ2VvIoX.html'
herders={
    'User-Agent':'Mozilla/5.0 (Windows NT 6.1;WOW64) AppleWebKit/537.36 (KHTML,like GeCKO) Chrome/45.0.2454.85 Safari/537.36 115Broswer/6.0.3',
    'Referer':'https://y.qq.com/n/yqq/song/001z4tFZ2VvIoX.html',
    'Connection':'keep-alive'}
req = request.Request(url,headers=herders)
# req = request.urlopen(req)
# con = req.read().decode('utf-8')
# print(req.status)
# obj = BeautifulSoup(con,'html5lib')
# va = obj.find('div',class_='songlist__songname')
# # vb = va.find('a',class_='')
# print(va)
# vc = vb.get('href')
# url1 = 'http:'+vc
# print(url1)
#跳转第一次
req = request.Request(url,headers=herders)
req1 = request.urlopen(req)
print(req1.status)
con = req1.read().decode('utf-8')
obj = BeautifulSoup(con,'html5lib')
va = obj.find('div',class_='data__actions')
# print(va)
vb = va.find('a',class_='mod_btn_green js_all_play')
# print(vb)
vc = vb.get('href')
# print(vc)
url = 'http:'+vc
print(url)
#第二次跳转
req = request.Request(url,headers=herders)
req1 = request.urlopen(req)
print(req1.status)
con = req1.read().decode('utf-8')
obj = BeautifulSoup(con,'html5lib')
# rs = re.findall(r'<audio(.*?)</audio>',con,re.S)
# print(rs)
vd = obj.find_all('script',type='text/javascript')
print(vd)
