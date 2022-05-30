package com.JavaPractise;

public class ReverseString {

	public static void main(String[] args) {

		String s="Selenium";
		
		// Using For loop
		int len=s.length();
		
		String word="";
		
		for (int i=len-1;i>=0;i--)
		{
			word=word+s.charAt(i);
		}

		System.out.println(word);

		
		
		//Using String Buffer
		
		StringBuffer sb=new StringBuffer(s);
		System.out.println(sb.reverse());
		
	}

}
