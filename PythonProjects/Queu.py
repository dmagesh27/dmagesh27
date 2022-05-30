class Node:
    def __init__(self,data=None,next=None):
        self.data=data
        self.next=next

class Queu:
     def __init__(self):
         self.head=None
         self.next=None

     def insert(self,data):
         if self.head is None:
            node=Node(data,None)
            self.head=node
            return
         else:
            itr=self.head
            while itr:
                print(self.head.data)
                itr=itr.next
            itr=Node(data,None)
            self.next=itr



     def print(self):
         itr=self.head
         if self.head is None:
             print("Queue is empty")
         Qlst=''
         while itr:
             Qlst+='<--'+str(itr.data)
             itr=itr.next
         print(Qlst)
         return

if __name__ == "__main__":
    pass
    q=Queu()
    q.print()
    q.insert(10)
    q.insert(20)
    q.print()
