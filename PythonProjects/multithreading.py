import time
import threading

def calc_square(numbers):
    print("calculate square numbers")
    for a in numbers:
        time.sleep(0.2)
        print("\nsquare", a*a,"\n")

def calc_cube(numbers):
    print("calculate cube numbers")
    for a in numbers:
        time.sleep(0.2)
        print("\nCube",a*a*a,"\n")
arr=[1,2,3]
t=time.time()

t1 = threading.Thread(target=calc_square,args=(arr,))
t2 = threading.Thread(target=calc_cube,args=(arr,))

t1.start()
t2.start()

t1.join()
t2.join()
#calc_square(arr)
#calc_cube(arr)
print("done in ",time.time()-t)
print("done with all my work")

