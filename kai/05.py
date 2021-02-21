# S = 'spam'
# for c in S:
#     print(c,end='\t')
# print()
# for c in S:
#     print(ord(c),end='\t')
#
# print()
# m=0
# for c in S:
#     m=ord(c)+m
# print(m)
#
# X=[]
# for c in S:
#     X.append(ord(c))
# print(X)
# print(list(map(ord,S)))
# print([ord(c) for c in S])
# for  i in range(100):
#     print('hello %d\n\a' % i)
D ={'a':1,'b':2,'c':3,'d':4,'f':6,'e':5}
print(D)
# keys = list(D.keys())
# keys.sort()
# # print(keys)
# for key in keys:
#     print(key , D[key])

for k in sorted(D):
    print(k, D[k])
