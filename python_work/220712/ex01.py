class A:
    def __init__(self,a):
        self.a=a
    def getA(self):
        return self.a

    
for i in [A(10),A(20)]:
    print(i.getA()) 