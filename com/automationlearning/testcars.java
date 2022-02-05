package com.automationlearning;

public class testcars {

	public static void main(String[] args) {

		
		BMW b=new BMW();
		b.Car();
		b.doors();
		b.Wheels();
		//b.wheels();
		System.out.println("*******Abstract class reference******");
		Abstractclassconcepts a = new BMW();
		a.Wheels();
		a.Car();
				
	
	
	}

}
