package com.automationlearning;

public class throwsconcept {
	
		
		
		public void Div() throws ArithmeticException
		{
			
			int i=9/0;
			
			
			
		}
		
		

		public static void main(String[] args) throws ArithmeticException {

			throwsconcept t=new throwsconcept();
			t.Div();
			System.out.println("After i divide by zero");// this will not be printed because the JVM stops
			//the execution if you use throwable.

			
			
			
			
			
		}

	}



