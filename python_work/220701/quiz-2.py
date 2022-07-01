def ex01():
    st=[1,2,3,4,5]
    st[1:4]=[3]
    print(st)

def ex02():
    st=[1,2,3,4,5]
    st[2:]=[3,3.5,4,5]
    print(st)

def ex03():
    st=[1,2,3,4,5]
    st[1:4]=[]
    print(st)

def ex04():
    st=[1,2,3,4,5]
    st[:]=[]
    print(st)

def ex05():
   st=[1,2,3,4,5,6,7,8,9,10]
   nt=st[::2]
   print(nt)

def ex06():
    st=[1,2,3,4,5,6,7,8,9,10]
    nt=st[1::2]
    print(nt)

#ex01()
#ex02()
#ex03()
#ex04()
#ex05()
ex06()