import time
import multiprocessing


def calc_square(numbers,q):
    print("calculate square numbers")
    for n in numbers:
       q.put(n*n)
       print("inside square: ", q.get(n * n))




if __name__ == '__main__':
    arr=[5,2,3]

    q=multiprocessing.Queue()
    t1 = multiprocessing.Process(target=calc_square,args=(arr,q))


    t1.start()


    t1.join()

#calc_square(arr)
#calc_cube(arr)
    #print("done in ",time.time()-t)
    while not q.empty():
        print("outside square of res ", q.get())


