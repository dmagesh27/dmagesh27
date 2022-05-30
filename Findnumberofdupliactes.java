package com.JavaPractise;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Findnumberofdupliactes {
	
	public void finddupe(String str)
	{
		
		HashMap<String, Integer> Hmap=new HashMap<>();
		String words[]=str.split(" ");
		for(String word:words)
		{
		
			if(Hmap.get(word)==null)
			{
				Hmap.put(word, 1);
			}
			else
				Hmap.put(word, Hmap.get(word)+1);
					
		}
		
		Set<String> Wordsinstring = Hmap.keySet();
		for(String wod:Wordsinstring)
			if(Hmap.get(wod)>1)
				System.out.println(wod+" : "+(Hmap.get(wod)));
		
		
		// ways of printing hash map
		System.out.println("ways of printing hash map");

		Hmap.forEach((Key,value)->
		{if(value>1)
				System.out.println(Key +":"+ value);
		});
	}
	
	
	
	

	public static void main(String[] args) {

		String s= "Java is Java not python but python is python";
		Findnumberofdupliactes f=new Findnumberofdupliactes();
		f.finddupe(s);
		
	}

}
