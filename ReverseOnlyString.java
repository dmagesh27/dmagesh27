package com.JavaPractise;

public class ReverseOnlyString {

	public static void main(String[] args) {

		String s="test12pop90java989pyt";
		
		String s2[]=s.split("[0-9]");
		
		//System.out.println(s2[0].length());
	
		
		  for(int i=0;i<s2.length;i++) 
		  { 
			  for(int j=s2[i].length()-1;j>=0;j--) 
			  {
				  System.out.println(s2[i].charAt(j)); 
			  } 
			  
		  }
		 
		
		/*
		 * for (int i=0;i<words.;i++)
		 * 
		 * {
		 * 
		 * if(word)
		 * 
		 * 
		 * }
		 */
		 
	}

}
