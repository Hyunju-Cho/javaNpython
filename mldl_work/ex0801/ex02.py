import cv2

def sn1():
    sn1=cv2.imread('sn1.png',cv2.IMREAD_GRAYSCALE)
    print(sn1.shape)
    return sn1

def t1():
    t1=cv2.imread('t1.png',cv2.IMREAD_GRAYSCALE)
    return t1

def p1():
    p1=cv2.imread('p1.png',cv2.IMREAD_GRAYSCALE)
    return p1
    