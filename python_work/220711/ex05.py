a=0
a+=1
def funcA():
    print(a)

def funcLocalA(n):
    print(n)

funcA()
print(a)
funcLocalA(10)
#print(n) 지역변수


