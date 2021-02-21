# print("wan")
# print(a)
# i=1
# while (i<10):
#     j=1
#     while j<=i:
#         print("%d*%d=%d"%(j,i,j*i),end='\t')
#         if(j==i):
#             print()
#         j+=1
#     i+=1
# for i in range (1,10):
#     print(i,end='\t')
# for i in range(1,10):
#     for j in range(1,i+1):
#         print("%d*%d=%d"%(j,i,j*i),end='\t')
#         if j==i:
#             print()
# a=int(input("请输入行数："))
# for i in range (1,a+1):
#     for j in range(1,i+1):
#         print("*",end='\t')
#         if j==i:
#             print()
#
# a=int(input("请输入行数："))
# for i in range (0,a+1):
#     for j in range (0,a-1-i):
#         print("@",end='\t')
#     for j in range (0,2*i+1):
#         print("*",end='\t')
#         if j==i:
#           print()
a =int(input("输入行数："))
i=1
j=1
while True:
    for b in range(0,int(a-(i*2-1)/2)):
        print(" ",end='')
    for c in range (0,(i*2-1)):
        print("*",end='')
    print()
    j+=1
    if(c<=a/2-1):
        i+=1
    else:
        i-=1
    if j==a:
        break

