def ex01():
    i=0
    while i<=9:
        print(i, end=' ')
        i+=1

def ex02():
    i=9
    while i>=0:
        print(i, end=' ')
        i-=1   

def ex03():
    num=0
    while 1:
        num+=1
        if(3*num/2==63):
            print(num)
            break

def ex04():
    lcm=0
    num=44
    while 1:
        if(num%6==0 and num%45==0):
            lcm=num
            print(lcm)
            break
        else:
            num+=1

def ex05():
    gcm=0
    num=42
    while 1:
        if(42%num==0 and 120%num==0):
            gcm=num
            print(gcm)
            break
        else:
            num-=1

def ex06():
    for i in range(1,10):
        if i%2!=0:
            continue
        print(7*i,end=' ')
    
def ex07():
    num=2
    while num<100:
        if(num%2!=0 and num%3!=0):
            print(num, end=' ')
        num+=1

def ex08():
    num=1
    while num<100:
        num+=1
        if (num%2==0 or num%3==0):
            continue
        else:
            print(num, end=' ')
         
def ex09():
    for i in range(2,10):
        for j in range(1,10):
            print(i*j, end=' ')
        print()

ex01()
print()
ex02()
print()
ex03()
ex04()
ex05()
ex06()
print()
ex07()
print()
ex08()
print()
ex09()