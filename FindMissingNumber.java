package com.JavaPractise;

public class FindMissingNumber {

	public static void main(String[] args) {

		int num[]= {1,2,4,5,7,16};
		
		int count=1;

		for(int i=0;i<=num.length-1;i++)
		{
			if (num[i]==count)
			{
				count++;
			}
			else 
			{
				while(num[i]!=count)
				{
					System.out.println("missing num is : "+count);
					count++;
				}
				count++;
				
			}
		
				
		}
		
	}

}
