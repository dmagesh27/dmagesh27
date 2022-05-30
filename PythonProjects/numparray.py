import time
import numpy as np
import sys

t1=time.time()
l=range(10000000)
print(sys.getsizeof(5)*len(l))
print("time took by python is : ", (time.time()-t1)*1000)

t2=time.time()
arr=np.arange(10000000)
print(arr.itemsize*arr.size)
print("time took by numpy is : ", (time.time()-t2)*1000)

