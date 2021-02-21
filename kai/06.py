L = [1,2,4,8,16,32,64]
X = 5
#a
i = 0
while i <len(L):
    if 2**X == L[i]:
        print('in a',i)
        break
    i+=1
else:
    print(X,'not')
#b
for p in L :
    if 2**X == p:
        print('in b',L.index(p))
        break
else:
    print(X,'not')
#c
if 2**X in L:
    print('in c',L.index(2**X))
else:
    print(X,'not')

#d
l=[]
for i in range(6):
    l.append(2**i)
print(l)
if 2**X in l:
    print('in d',l.index(2**X))
else:
    print(X,'not')
#f
L = list(map(lambda x : 2**x,range(7)))
print(L)





