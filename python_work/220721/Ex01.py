import sys

def doA():
    for i in [10,20,30,40,50,60,70,80,100,110,120,130,140]:
        yield i #리스트 값 각각 반환
    #yield from [10,20,30,40,50,60,70,80,100,110,120,130,140]와 동일

a=[10,20,30,40,50,60,70,80,100,110,120,130,140]
b=doA()

print(sys.getsizeof(a))
print(sys.getsizeof(b)) #메모리 차지가 적음

print(next(b))
print(next(b))
print(next(b))