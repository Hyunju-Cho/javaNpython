def ex01():
    st=[1,2,3,4]
    for i in st:
        print(i)

def ex02():
    st=[1,2,3,4]   
    for i in range(-4,0,1):
        print(st[i])

def ex03():
    st=[1,2,3,4]
    for i in st:
        print(i+1)

def ex04():
    st=[1,2,3,4,5,6,7,8,9,10]
    for i in st:
        print(i+1)

def ex05():
    st=[1,2,3,4,5,6]
    st[0],st[5]=st[5],st[0]
    print(st)

ex01()
ex02()
ex03()
ex04()
ex05()