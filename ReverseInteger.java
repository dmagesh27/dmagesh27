package com.JavaPractise;

public class ReverseInteger {

	public static void main(String[] args) {
		
		int num=123;
		int rev=0;
		
		
		//using while loop
		while(num!=0)
		{
			rev=rev*10+num%10;
			num=num/10;
		}
		
		System.out.println(rev);
		
		
		//using stringBuffer
		
		int numtwo=856446;
		System.out.println(new StringBuffer(String.valueOf(numtwo)).reverse());
	}

}
