def doA(a):
    print(a)

def doB():
    return "doB"


doA(10)
doA([1,2,3,4,5])
doA('what?')

result=doB()
print(result)