from posixpath import split


a="a,b,c,e,d,f,o"

a=a.replace("a","haha")
print(a)

lista=a.split(',')
print(lista)

for i in lista:
    print(i)