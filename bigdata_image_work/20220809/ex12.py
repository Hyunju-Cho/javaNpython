from audioop import avg


a=[1,2,3,4,5]

print(max(a))
print(min(a))
print(sum(a))
print(sum(a)/len(a))

print()
import numpy as np

npa=np.array(a)
print(np.max(npa))
print(np.min(npa))
print(np.sum(npa))
print(np.mean(npa))

npb=np.arange(16).reshape(-1,4)
print(npb)
print(np.sum(npb,axis=0))
print(np.mean(npb,axis=0))
print()
npb=np.arange(16).reshape(-1,4)
print(np.sum(npb,axis=1))
print(np.mean(npb,axis=1))