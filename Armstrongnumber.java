package com.JavaPractise;

public class Armstrongnumber {

	public void isArmstrongnumber(int num)
	{
		int t=num;
		int sum=0;
		int a=0;
		while(num>0)//153
		{
			a=num%10;
			sum=sum+(a*a*a);
			num=num/10;
					
		}
		
		if(t==sum)
			System.out.println("Number "+t+" is Armstrong.");
		else
			System.out.println("Number "+t+" is not Armstrong.");

	}
	
	
	
	public static void main(String[] args) {

		Armstrongnumber a=new Armstrongnumber();
		a.isArmstrongnumber(407);
		
		
		
	}

}
