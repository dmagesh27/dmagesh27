# A simple Python program for traversal of a linked list
import time
# Node class
class Node:

	# Function to initialise the node object
	def __init__(self, data):
		self.data = data # Assign data
		self.next = None # Initialize next as null


# Linked List class contains a Node object
class LinkedList:

	# Function to initialize head
	def __init__(self):
		self.head = None

	# This function prints contents of linked list
	# starting from head
	def printList(self):
		temp = self.head
		P = ''
		while (temp):
			P+='<--'+str(temp.data)
			temp = temp.next
		print(P)

	def insert(self,data):
		if self.head is None:
			self.head=Node(data)
		else:
			temp = self.head
			while (temp):
				s = temp
				temp = temp.next
			s.next = Node(data)
	def insertathead(self,data):
		if self.head is None:
			self.head=Node(data)
		else:
			temp = self.head
			F = Node(data)
			self.head = F
			self.head.next=temp
# Code execution starts here
if __name__=='__main__':

	# Start with the empty list
	llist = LinkedList()

	# llist.head = Node(1)
	# second = Node(2)
	# third = Node(3)
	#
	#
	#
	# llist.head.next = second; # Link first node with second
	# second.next = third; # Link second node with the third node
	#third.next = four;
	t1=time.time()
	llist.insert(1)
	llist.insert(20)
	data=input("enter a number: ")
	llist.insert(data)
	llist.insert(4)
	llist.insertathead(6)
	llist.insert(7)
	print("time taken",time.time()-t1)
	llist.printList()
