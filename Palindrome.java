package com.JavaPractise;

public class Palindrome {
	
	
	
public void ispalindrome(int num)//898
{
	int t=num;
	int r=0;
	int sum=0;
	while(num>0)
	{
		r=num%10;
		sum=(sum*10)+r;//1
		num=num/10;
	}
	if(sum==t)
		System.out.println("number "+t +" is palindrome");
	else
		System.out.println("number "+t +" is not palindrome");

}
	

	public static void main(String[] args) {
		
		Palindrome p = new Palindrome();
		
		p.ispalindrome(123454321);
		
		
		
	}

}
