package com.automationlearning;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Map.Entry;
import java.util.Set;

public class Hashtbl {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Hashtable<Integer, String> ht = new Hashtable<Integer, String>();
		ht.put(1, "max");
		ht.put(2, "Raj");
		ht.put(3, "Pri");
		//Hashtable does cannot contain null key or null value
		//ht.put(null, null);
		
		Hashtable<Integer, String> ht1 = new Hashtable<Integer, String>();
		
		ht1=(Hashtable<Integer, String>)ht.clone();
		
		System.out.println("Ht values"+ht);
		System.out.println("Ht1 values"+ht1);

		//	clearing a hashtable 
		ht.clear();
		System.out.println("Ht values"+ht);
		System.out.println("Ht1 values"+ht1);
		
		//	Containsvalue 
		if(ht1.containsValue("abci"))
		{
		System.out.println("value is present");
		}
				
		
		//	Enumneration 
		System.out.println("value printed using Enumeration");
		Enumeration<String> e = ht1.elements();
		while(e.hasMoreElements())
		{
			System.out.println(e.nextElement());
		}
		
		//		Set Entry 
			System.out.println("value printed using SEt Entry");
		Set<Entry<Integer, String>> s=ht1.entrySet();
		System.out.println(s);
		
		
		
		// check values are equal
		Hashtable<Integer, String> ht2=new Hashtable<Integer, String>();
		ht2=(Hashtable<Integer, String>)ht1.clone();
		if(ht1.equals(ht2))
			System.out.println("value matched");
		else
			System.out.println("value not matched");

		
		// get values from key
		System.out.println("Values from Key: "+ht1.get(1));

		
		// get Hashcode values 
		System.out.println("Hashcode value of ht1 is : "+ht1.hashCode());

		
		
		
		
		
		
		
		
			
	}

}
