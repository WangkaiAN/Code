from urllib import request
#
# url = 'http://www.baidu.com/s?'+'wd=python'
# # req = request.urlopen(url)
# # type(req)
# # help.
# # print(req.status)
# #应答的状态
# # print(req.reason)
# print(url)
# req = request.urlopen(url)
# con = req.read()
# con.decode('utf-8')
# f = open(r'D:\python爬虫\python.html','w',encoding='utf-8')
# f.write(con.decode('utf-8'))
# f.close()

from urllib import parse
kv = {'wd':'金刚川'}
surl = parse.urlencode(kv)
url = 'http://www.baidu.com/s?'+surl
req = request.urlopen(url)
con = req.read()
con.decode('utf-8')
f = open(r'D:\python爬虫\金刚川.html','w',encoding='utf-8')
f.write(con.decode('utf-8'))
f.close()