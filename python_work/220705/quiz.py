def main():
    num=int(input('정수를 하나 입력하세요\n'))
    if num>=0:
        print('입력한 값은 0이거나 0보다 큽니다.')
    else:
        print('입력한 값은 0보다 작습니다.')

def ex02():
    num=3
    print(1<num and num<5)

def ex03():
    num=12
    print(num<3 or num>10)

def ex04():
    num=4
    print(num%2==0 and num%3!=0)

def ex05():
    num=int(input('정수를 하나 입력하세요\n'))
    if num<0:
        print('입력한 값은 0보다 작습니다.')
    elif 0<=num<10:
        print('입력한 값은 0 이상 10 미만입니다.')
    elif 10<=num<20:
        print('입력한 값은 10 이상 20 미만입니다.')
    else:
        print('입력한 값은 20이상입니다.')


main()
ex02()
ex03()
ex04()
ex05()