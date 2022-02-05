package com.automationlearning;



public class Linklst {
	Node head;
	
	class Node
	{
		int data;
		Node next;
		
		Node(int data)
		{
			this.data=data;
			next=null;
		}
		
	}
	
public void printlst()
{
		Node n=head;
		while(n!=null)
		{
			System.out.println(n.data);
			n=n.next;
		}
			
}

	
	public static void main(String[] args) {

		Linklst ll = new Linklst();
		Node first=ll.new Node(10);
		ll.head=first;
		
		Node second=ll.new Node(20);
		first.next=second;
		
		Node third = ll.new Node(30);
		second.next=third;
		
		ll.printlst();
	
	
	
	}

}
