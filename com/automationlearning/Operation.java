package com.automationlearning;

class Operation{  
	 int data=50;  
	  
	 public void change(int data){  
		 
	 data=data+100;//changes will be in the local variable only 
	 System.out.println("after change "+data); 
	 return;
	 }  
	     
	 public static void main(String args[]){  
	   Operation op=new Operation();  
	  
	   System.out.println("before change "+op.data);  
	   op.change(500);  
	   System.out.println("after change "+op.data);  
	  
	 }  
	}  
