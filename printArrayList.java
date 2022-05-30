package com.JavaPractise;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class printArrayList {

	public static void main(String[] args) {

		
		ArrayList<String> Arr =new ArrayList<String>();
		Arr.add("The");
		Arr.add("Max");
		Arr.add("Great");

		
		
		//1.using for each inside array list object
		System.out.println("------using for each inside array list object------");
		Arr.forEach(shows->{
		System.out.println(shows);
		});
		
		//2.using iterator
		System.out.println("------using iterator------");
		Iterator<String> it = Arr.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		//3.using foreach remaining in iterator
		System.out.println("------using for each remaining in iterator------");
		it = Arr.iterator();
		it.forEachRemaining(show-> {
			System.out.println(show);
			});
		
		//4.using for loop
		System.out.println("------using for loop------");

		for(int i=0;i<Arr.size();i++)
		{
			System.out.println(Arr.get(i));
			
		}
		
		//5.using new for loop
				System.out.println("------using new for loop------");

				for(String shw:Arr)
				{
					System.out.println(shw);
					
				}
		
				
		//6.using list iterator function and previous method to display from bottom to top
				System.out.println("------using list iterator function------");

			ListIterator<String> lstit=	Arr.listIterator(Arr.size());
			while(lstit.hasPrevious())
				{
					System.out.println(lstit.previous());
					
				}	
			//7. using list iterator function and hasnext and next method to display from top to bottom
			System.out.println("------using list iterator function and hasnext and next method to display from top to bottom------");

			while(lstit.hasNext())
			{
				System.out.println(lstit.next());
				
			}		
		}

}
