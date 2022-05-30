package com.JavaPractise;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DuplicateInArray {

	public static void main(String[] args) {

		
		String names[]={"Java","Ruby","CSharp","python","Java","python","Ruba","Ruby"};
		
		//1. Using 2 for loops with O(n*n) complexity - bad practise
		for(int i=0;i<=names.length-1;i++)
		{
			for(int j=i+1;j<=names.length-1;j++)
			{
				if(names[i].equals(names[j]))
					System.out.println("duplicate in Array is : "+names[i]);
					
			}
			
		}
		
		
		
		//2. using Hashset
		Set<String> setone=new HashSet<String>();
		for(String name:names)
			if(setone.add(name)==false)
			{
				System.out.println("duplicate in HashSet is : "+name);
			}
		
		
		
		//3. using HashMap
		
		Map<String,Integer> Hmap=new HashMap<String,Integer>();
		
		for(String name:names)
		{
			Integer count=Hmap.get(name);
			if(count==null)
				Hmap.put(name, 1);
			else
				Hmap.put(name, Hmap.get(name)+1);
		}
		
		Set<Entry<String, Integer>> StoreMap=Hmap.entrySet(); 
		for(Entry<String, Integer> entry:StoreMap)
			if(entry.getValue()>1)
		System.out.println("duplicate in HashMap is : "+entry.getKey());
		
		
	}

}
