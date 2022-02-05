package com.automationlearning;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Dupestringhash {

	public static void main(String[] args) {

        String stri = "This is a program to find duplicate words in a string, again! a program";

        String words[]=stri.toLowerCase().split(" ");
        
        Map<String, Integer> duplicatestring = new HashMap<String,Integer>();
        
        for(String word:words)
        {
        	if(duplicatestring.containsKey(word))
        	{
        		duplicatestring.put(word, duplicatestring.get(word)+1);
          	}
        	else
        	{
        		duplicatestring.put(word, 1);

        	}
        }
        		
        	for(Map.Entry a:duplicatestring.entrySet())     
        	{
        		int val = (Integer) a.getValue();
        		if(val>1)
        		{
        		System.out.println(a);
        		}
        		
        		System.out.println(a);
        	}
        		
        		
        		
        		
        		
        		
        		
        		
        	
        }
        
	}


