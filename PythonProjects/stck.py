# A simple Python program for traversal of a linked list
import time
import array


# stck class
class stck:

    # Function to initialise the stck object
    def __init__(self, data):
        self.data = data  # Assign data
        self.next = None  # Initialize next as null


# Linked List class contains a stck object
class LinkedList:

    # Function to initialize head
    def __init__(self):
        self.head = None

    # This function prints contents of linked list
    # starting from head
    def printList(self):
        temp = self.head
        P = []

        while (temp):
            P.append(temp.data)
            temp = temp.next

        print(P)

        print("Stack : Last in First out: ")
        i = len(P) - 1
        R = []
        while i > -1:
            R.append(P[i])
            i -= 1
        print(R)

    # S = ''
    # temp = self.head
    # while (temp):
    #     S+= '<--' + str(temp.data)
    #     temp = temp.next
    # print("stack representation:")
    # print(S[-1])

    def insert(self, data):
        if self.head is None:
            self.head = stck(data)
        else:
            temp = self.head
            while (temp):
                s = temp
                temp = temp.next
            s.next = stck(data)

    def insertathead(self, data):

        if self.head is None:
            self.head = stck(data)
        else:
            temp = self.head
            F = stck(data)
            self.head = F
            self.head.next = temp;


    def rem(self):
        if self.head is None:
            print("stack is empty")
        else:
            temp = self.head
            V=[]
            while temp.next:
                V.append(temp.data)
                C = temp
                temp = temp.next
            print("pop perfomed",C.next.data)
            C.next = None
            print(V)
        return

# Code execution starts here
if __name__ == '__main__':
    # Start with the empty list
    llist = LinkedList()

    # llist.head = stck(1)
    # second = stck(2)
    # third = stck(3)
    #
    #
    #
    # llist.head.next = second; # Link first stck with second
    # second.next = third; # Link second stck with the third stck
    # third.next = four;
    t1 = time.time()
    llist.insert(1)
    llist.insert(20)
    data = input("enter a number: ")
    llist.insert(data)
    llist.insert(4)
    llist.insertathead(6)
    llist.insert(7)
    print("time taken", time.time() - t1)
    llist.printList()
    llist.rem()
    llist.rem()

