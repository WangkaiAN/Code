# # import sys
# # print(sys.platform)
# # input("9999")
# # print("%.2f | @%+04d"%(3.14159,-42))
# s='A\nB\tC'
# print(len(s))
# s1='ABC'
# print(len(s1))
# print(ord('\n'))
# s2='A\0B\0C'
# print(s2)
# print('A\0B\0C')
# print('sp\xc4m')
# import re
# m=re.match('Hello[\t]*(.*)world','Hello python world')
# print(m.group(1))
# m=[[1,2,3],
#    [4,5,6],
#    [7,8,9]]
# print(m)
# co=[row[1] for row in m]
# print(co)

# D ={'food':'Spam','quantity':4,'color':'pink'}
# print(D['food'])
# D['quantity']+=1
# print(D)

# D ={'a':1,'c':2,'b':3}
# ks =list(D.keys())
# print(ks)
# ks.sort()
# print(ks)
# for key in ks:
#     print(key,'=>',D[key])
f=open('data.txt',"w")
f.write('hello\n')
f=open(r'D:\testpython\com\test\kai\data.txt')
text=f.read()
print(text)









