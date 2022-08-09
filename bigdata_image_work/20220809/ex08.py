import numpy as np
import matplotlib.pyplot as plt

img2=np.random.randint(0,235,size=512*512*3).reshape(-1,512,3)
print(img2.shape)

img2[100:200,200:300]=[255,0,0]
plt.imshow(img2,cmap="gray_r")
plt.show()