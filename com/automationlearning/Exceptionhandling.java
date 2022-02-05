package com.automationlearning;

public class Exceptionhandling {
	
	
	public void Div()
	{
		try {
		int i=9/0;
		}
		catch(Throwable e)
		{
			e.printStackTrace();
		}
		
	}
	
	

	public static void main(String[] args) {

		Exceptionhandling h=new Exceptionhandling();
		h.Div();
		System.out.println("After i divide by zero"); // will be printed even after divide by zero exception occurs
		// the try and catch block will handle the exception and continue the execution

		
		
		
		
		
	}

}
