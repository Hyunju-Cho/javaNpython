class Point:
    def __init__(self,x,y):
        self.x=x
        self.y=y
    
    def __call__(self):
        print("[{},{}]".format(self.x,self.y))

class Circle:
    def __init__(self,x,y,r):
        self.x=x
        self.y=y
        self.r=r

    def __call__(self):
        infoPoint=Point(self.x,self.y)
        infoPoint()
        print("반지름 = ",self.r)

def main():
    infoCircle=Circle(2,3,4)
    infoCircle()

main()