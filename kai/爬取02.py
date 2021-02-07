from urllib import request
import re
url = 'https://movie.douban.com/top250'
herders={
    'User-Agent':'Mozilla/5.0 (Windows NT 6.1;WOW64) AppleWebKit/537.36 (KHTML,like GeCKO) Chrome/45.0.2454.85 Safari/537.36 115Broswer/6.0.3',
    'Referer':'https://movie.douban.com/',
    'Connection':'keep-alive'}
req = request.Request(url,headers=herders)
req = request.urlopen(req)
# type(req)
print(req.status)
# 应答的状态
con = req.read().decode('utf-8')
#使用正则匹配，找到目的数据,从可以理解为查找源，re.S有了之后就可以查找所有
rs = re.findall(r'<li>(.*?)</li>',con,re.S)  #findall 是一个查找函数
li = rs[0]
# print(li)
imginf = re.findall(r'<img(.*?)" class="">',li)
info = imginf[0]
print(info)
result = info.split(' alt=')
print(result[1])
result1 = result[1].split(' src="')
result2 = result1[1]
name=result1[0].strip()[1:-1]
# strip()方法用于移除字符串头尾指定的字符（默认为空格或换行符）或字符序列
print(name)
#开始写的是result1[0]但是好像识别不了，就换成了name,可能是没有去双引号的缘故吧
imgreq = request.urlopen(result2)
re_img = imgreq.read()
imgf = open('D:\\python爬虫\\'+ name +'.jpg','wb')
imgf.write(re_img)
imgf.close()
