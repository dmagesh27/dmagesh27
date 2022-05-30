package com.JavaPractise;

public class Linkdlst {

	public static class Node
	    {
		int data;
		Node next;
		}
	
	
	
	
	public static void main(String[] args) {
		
		Node Node1=new Node();
		Node Node2=new Node();
		Node Node3=new Node();
		Node Node4=new Node();
		Node1.data=10;
		Node2.data=20;
		Node3.data=30;
		Node4.data=40;
		Node1.next=Node2;
		Node2.next=Node3;
		Node3.next=Node4;
		Node4.next=null;
		
		for (int i=0;i<4;i++)
		{
			System.out.print(Node1.data+"->");
			Node1=Node1.next;
			
			
		}


		

	}

}
