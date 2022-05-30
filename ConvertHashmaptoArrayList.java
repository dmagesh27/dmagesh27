package com.JavaPractise;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ConvertHashmaptoArrayList {

	public static void main(String[] args) {

		HashMap<String, Integer> map=new HashMap<String, Integer>();
		map.put("Google", 10000);
		map.put("Amazon", 20000);
		map.put("Microsoft", 25000);
		map.put("Meta", 30000);
		
		map.forEach((k,v)->System.out.println(k+" : "+v));
		
		
		
		//converting them to arraylist Value
		
		System.out.println("------converting them to arraylist - Key-------");
		List<String> lstkey=new ArrayList<String>(map.keySet());
		for(String t:lstkey)
		System.out.println(t);
		
		

		
		//converting them to arraylist Value
		
		System.out.println("------converting them to arraylist - Value-------");
		List<Integer> lstval=new ArrayList<Integer>(map.values());
		for(Integer r:lstval)
		System.out.println(r);
		
		
	}

}
