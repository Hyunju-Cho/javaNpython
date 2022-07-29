import cv2

def bag():
    bag=cv2.imread('bag.png',cv2.IMREAD_GRAYSCALE)
    print(bag.shape)
    return bag

def t1():
    t1=cv2.imread('t1.png',cv2.IMREAD_GRAYSCALE)
    return t1

def p1():
    t1=cv2.imread('p1.png',cv2.IMREAD_GRAYSCALE)
    return p1
    