def int_div(num1,num2):
    print("몫 : {}".format(num1//num2))
    print("나머지 : {}".format(num1%num2))

def bet_sum(num1,num2):
    sum=0
    for i in range(num1+1,num2):
        sum+=i
    print(sum)

int_div(5,2)
bet_sum(1,5)