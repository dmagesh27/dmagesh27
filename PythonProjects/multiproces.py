import time
import multiprocessing

def calc_square(numbers):
    print("calculate square numbers")
    for a in numbers:
        #time.sleep(5)
        print("\nsquare", a*a)

def calc_cube(numbers):
    print("calculate cube numbers")
    for a in numbers:
        #time.sleep(5)
        print("\nCube",a*a*a)

if __name__ == '__main__':
    arr=[1,2,3]
    t=time.time()

    t1 = multiprocessing.Process(target=calc_square,args=(arr,))
    t2 = multiprocessing.Process(target=calc_cube,args=(arr,))

    t1.start()
    t2.start()

    t1.join()
    t2.join()
#calc_square(arr)
#calc_cube(arr)
    print("done in ",time.time()-t)
    print("done with all my work")

