package com.automationlearning;

import java.util.Scanner;

public class palindromword {
	
	
	public static void palinword(String inputstring)
	{
		String myStr = inputstring;
		String result1="";
		String result2="";

		for(int i=0;i<myStr.length();i++)
		{
		char result = myStr.charAt(i);
		result1=result+result1;
		}
		System.out.println(result1);

		
		for(int i=myStr.length()-1;i>=0;i--)
		{
		char result = myStr.charAt(i);
		result2=result+result2;
		}
		System.out.println(result2);

		
		if(result1.equals(result2))
		{
			System.out.println("Word "+myStr+" is a palindrome");
	
		}
		else
			System.out.println("Word "+myStr+" is NOT a palindrome");

			
		
		}
		
		
	

	public static void main(String[] args) {

		 Scanner sc = new Scanner(System.in);
		 
	      System.out.println("Enter a string:");
	     String str = sc.nextLine();
		palinword(str);
		sc.close();
		
	}

}
