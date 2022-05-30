package com.JavaPractise;

public class Factorial {
	
	
	//1. using for loop
	public int isfactorial(int num)
	{
		int t=1;
		if(num==0)
			return 1;
		else
		{
		for(int i=1;i<=num;i++)
		{
			t=t*i;
			
		}
		return t;
		}
	}
		
	//using recursive function
	public int isfacto(int n)
		{
		if(n==0)
			return 1;
		else
			return n*isfacto(n-1);
			
		}
		
		
	

	public static void main(String[] args) {

		
		Factorial f=new Factorial();
	System.out.println(f.isfactorial(6));
	System.out.println(f.isfactorial(0));
	System.out.println(f.isfactorial(1));


		System.out.println(f.isfacto(6));
		System.out.println(f.isfacto(0));
		System.out.println(f.isfacto(1));

	}

}
