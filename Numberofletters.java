package com.JavaPractise;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class Numberofletters {

	public static void main(String[] args) {

		String test="aaabbcddddaa";
	char c[]=test.toCharArray();//o/p: a3b2c4d1
		
	
		HashMap<Character, Integer> map=new HashMap<Character, Integer>();
		
		
		//for(int i=0;i<c.length;i++)
			
			for(Character letter:c)
			{
				if(map.get(letter)==null)
					map.put(letter, 1);
				else
						map.put(letter, map.put(letter, 1)+1);
			}
			
			
			Set<Entry<Character, Integer>> Smap=map.entrySet();
			
			
			for(Entry<Character, Integer> entry:Smap)
			{
			System.out.print(entry.getKey());
			System.out.print(entry.getValue());
			}
		/*
		 * for (String tesi:test) if (map.get(test(i))==false)
		 */
	
	}

}
