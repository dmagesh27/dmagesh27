package com.automationlearning;

public class Me  extends Father {
	
	public void wastemoney()
	{
		System.out.println("Me waste all money");
	}

	public static void main(String[] args) {

		//Father F = new Father();
		Father.eat(); //good practise is to access the static method using classname rather than the object name. becoz static methods store in commom shared memory
		
		  Father F = new Father(); 
		  F.eat(); // this will also work fine despite of warning. but not good practise
		  
		  
		//	Father a = new Grandfather();//We cannot put object of superclass into object reference of subclass because it cannot fit into it.

		  Father G = new Me();
		   G.repeat();
		 
		   
		  Me m = new Me();
		  
		   m.wastemoney(); 
		   m.work(); 
		     
		   Grandfather gf=new Me();
		   gf.repeat();
		  
		 
	}

}
