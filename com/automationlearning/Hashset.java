package com.automationlearning;

import java.util.HashSet;
import java.util.Iterator;

public class Hashset {

	public static void main(String[] args) {

		
		HashSet<String> hs=new HashSet<String>();

		hs.add("Max");
		hs.add("Raj");
		hs.add("Jo");
		System.out.println(hs);
		
		Iterator t=hs.iterator();
		
		while(t.hasNext())
		{
			System.out.println(t.next());
		}
		
		
	}

}
