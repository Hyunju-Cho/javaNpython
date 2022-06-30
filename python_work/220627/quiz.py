#문제 2
def sum():
    sum=0
    for i in [1,3,5,7,9]:
        sum+=i
    print(sum)

#문제 3
def mul():
    res=1
    for i in range(1,11):
        res*=i
    print(res)

#문제 4
def mul7():
    for i in range(1,10):
        print('7*%d = %d'%(i,7*i))
    print("\n")

#문제 5
def RvsMul7():
    for i in range(1,10):
        print('7*%d = %d'%(i,7*i))
    
    print("---------------")
    
    for i in range(9,0,-1):
        print('7*%d = %d'%(i,7*i))



#문제 6
def exp(n1,n2):
    return n1**n2

#문제 7
def greet():
    count=eval(input("인사를 몇번 할까요?"))
    for i in range(0,count):
        print("반갑습니다.")


sum()
mul()
mul7()
RvsMul7()
print(exp(2,3))
greet()