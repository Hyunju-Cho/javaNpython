def MH():
    sum=0
    for i in range(1,6):
        sum=sum+i
    print(sum)

def doA(msg):
    for i in range(3):
        print(msg)

def doB(num):
    print(-num)

def doC(num1,num2):
    print((num1+num2)/2)

MH()
doA("하이")
doB(-1)
doB(1)
doC(3,4)
