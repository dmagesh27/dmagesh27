class Node:
    def __init__(self, data=None, next=None):
        self.data=data
        self.next=next


class linkedlist:
    def __init__(self):
        self.head=None


    def insertatbeginning(self,data):
        node=Node(data,self.head)
        self.head=node

    def insertatend(self,data):
        if self.head is None:
            self.head=Node(data,None)
            return

        itr=self.head
        while itr.next:
            itr=itr.next


        itr.next=Node(data,None)

    def insertatpos(self,data):

        if self.head is None:
            node=Node(data,None)
            self.head=node
            print("inserted at position no: 1")
        itr = self.head
        S=itr.next
        itr.next=Node(data,S)

    def deletion(self,data):
        itr=self.head
       # print(self.head.data)
        while itr:
            if itr.next.data==data:
                break
            itr=itr.next
        itr.next=itr.next.next
        return


    def print(self):
        if self.head is None:
            print("Linked list is empty")
            return
        lstr=''
        itr=self.head
        count=0
        while itr:
            count+=1
            lstr+=str(itr.data)+'-->'
            itr=itr.next
       # print(self.head)
        #print(self.head.next)
        print(lstr)
        print("Length of list is : ",count)
if __name__=="__main__":
    pass
    ll=linkedlist()
    ll.insertatbeginning(10)
    ll.insertatbeginning(15)
    ll.insertatbeginning(16)
    ll.insertatpos(20)
    ll.insertatend(17)
    ll.print()
    ll.deletion(20)
    ll.print()




