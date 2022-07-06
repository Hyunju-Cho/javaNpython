class Car:

    def __init__(self,speed):
        self.speed=speed
    
    def __call__(self):
        print("현재 속도는 {}입니다.".format(self.speed))

while 1:
    print("1. 속도입력")
    print("2. 속도출력")
    print("3. 종료")

    num=eval(input("번호를 적으세요"))
    if num==1:
        speed=eval(input("속도 적으세요"))   
        mycar=Car(speed)
    elif num==2:
        mycar() 
    else:
        quit()