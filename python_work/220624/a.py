def greet():
    print("반갑습니다.")
    print("파이썬의 세계")

def greet2(name):
    print("반갑습니다.",name)
    print(name,"님은 파이썬의 세계로 오셨습니다.")

def adder(num1,num2):
    ar=num1+num2
    return ar


greet()
greet2("John")
result=adder(1,2)
print(result)
print(adder(2,3))