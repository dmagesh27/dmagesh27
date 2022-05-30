import time
import multiprocessing
from ctypes import Structure, c_double

def calc_square(numbers,res, val):
    print("calculate square numbers")
    val.value=b'a'
    for idx,a in enumerate(numbers):
     res[idx]=a*a
    print("inside method square of res ", res[:])


if __name__ == '__main__':
    arr=[1,2,3]
    t=time.time()
    res = multiprocessing.Array('i',3) # shared memory by Array
    val=multiprocessing.Value('c',b's') # shared memory by Value
    t1 = multiprocessing.Process(target=calc_square,args=(arr,res,val))


    t1.start()


    t1.join()

#calc_square(arr)
#calc_cube(arr)
    print("done in ",time.time()-t)
    print("outside square of res ", res[:])
    print("value of Val is : ", val.value)

