def returnResult(n1,n2):
    num1=0
    num2=0
    
    #입력값이 있으면 int로 형변환하여 변수에 저장함
    if n1 is None:
        num1=0
    else:
        num1=int(n1)
    if n2 is None:
        num2=0
    else:
        num2=int(n2)

    '''
    print(request.args)
    num1=int(request.args.get("num1"))
    #print("num1",num1)
    num2=int(request.args.get("num2"))
    #print("num2",num2)
    '''
     
    sum=0
    if(num1<num2):
        for i in range(num1,num2):
            sum+=i
    else:
        for i in range(num1,num2,-1):
            sum+=i
    
    return sum