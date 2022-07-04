def ex01():
    st=[]
    st.append(1)
    st.append(2)
    st.append(3)
    print(st)

    st.remove(1)
    st.remove(2)
    st.remove(3)
    print(st)

def ex02():
    st=[]
    st.append(1)
    st.append(2)
    st.append(3)
    print(st) 

    for i in range(3):
        st.pop(-1)
    print(st)  

def ex03():
    st=[1,2,3,4]
    st[:]=[]
    print(st)

def ex04():
    st=[]
    for i in range(1,11):
        st.append(i)
    print(st)

    for i in range(1,11):
        st.remove(i)
        print(i)
    print(st)

def ex05():
    st=[]
    for i in range(1,11):
        st.append(i)
    print(st)

    for i in range(10,0,-1):
        st.remove(i)
        print(i)
    print(st)

def ex06():
    st=[1,2]
    st[2:]=[3,4,5]
    print(st)

def ex07():
    str="The Espresso Spirit"
    print(str.upper())
    print(str.lower())
    print(str)

def birth_only(ssn):
    birth=ssn.split('-')
    print(birth[0])

ex01()
ex02()
ex03()
ex04()
ex05()
ex06()
ex07()
birth_only("070609-2011xxx")
