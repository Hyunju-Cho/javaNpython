def ex01():
    for i in range(3):
        for j in range(3):
            print(j+i+1,end=" ")
        print()

def add1(s):
    st=[]
    for i in range(len(s)):
        st.append(s[i]+1)
    return st

ex01()
st=[1,2,3,4,5]
addSt=add1(st)
print(addSt) 