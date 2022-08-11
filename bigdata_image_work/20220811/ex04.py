import cv2
import numpy as np

img=cv2.imread('20220811/gora.jpg',cv2.IMREAD_COLOR)

cv2.imshow('gora',img)
cv2.waitKey(0)

try:
    for i in range(1000):
        x=np.random.randint(0,1100,1)[0]
        endx=x+100
        y=np.random.randint(0,1100,1)[0]
        endy=y+100

        print(x,' ',endx)
        print(y,' ',endy)

        roi=img[x:endx,y:endy]
        print(roi.shape)

        x=np.random.randint(0,1100,1)[0]
        endx=x+100
        y=np.random.randint(0,1100,1)[0]
        endy=y+100

        print(x,' ',endx)
        print(y,' ',endy)

        img[x:endx,y:endy]=roi

        cv2.imshow('gora',img)
        cv2.waitKey(100)
except Exception as e:
    print(e)