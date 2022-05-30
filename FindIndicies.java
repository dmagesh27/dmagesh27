package com.JavaPractise;

public class FindIndicies {

	public static void main(String[] args) {

		int a[]= {2,3,4,5,6,1};//7
		
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]+a[j]==7)
					
				{
					System.out.println("first indicies: "+i);
					System.out.println("second indicies: "+j);


				}
			

					
			}
		}
			
	}

}
