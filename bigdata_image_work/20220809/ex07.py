import numpy as np

a=np.arange(8).reshape(-1,4)

left,right=np.split(a,[2],axis=1)

print(a)

print(right.shape)
print(left.shape)

print(left)
print(right)