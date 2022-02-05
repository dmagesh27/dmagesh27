package com.automationlearning;

public class primenum {
	
	public Boolean isprime(int num) {
		
		if(num<=1)
			return false;
		
		
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
				//System.out.println(i);
				return false;
		}
				return true;
	}
		public void getprime(int num)
		{
			for(int i=2; i<=num;i++ )
			{
				if(isprime(i))
				{
					System.out.println(i);
				}
			}
			
		}
	
	

	public static void main(String[] args) {

		primenum p = new primenum();
		System.out.println(p.isprime(4));
		p.getprime(20);
	}

}
