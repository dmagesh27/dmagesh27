import time
from multiprocessing import Pool


def calc_square(n):
    sum=0
    for x in range(1000):
        sum+=x*x
        return sum

if __name__ == '__main__':
    t1=time.time()
    p=Pool()
    res=p.map(calc_square,range(1000000))
    p.close()
    p.join()
    print("pool took time ", time.time()-t1)

    t2=time.time()
    res=[]
    for x in range(1000000):
        res.append(calc_square(x))
    print("Serial processing took ",time.time()-t2)




