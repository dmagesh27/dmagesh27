package com.automationlearning;

import java.util.AbstractMap;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Hashmaptypes {
	
	public static Map<String, Integer> mape;
	
	static {
		mape=new HashMap<String, Integer>();
		mape.put("ABC", 501);
		mape.put("XYz", 2000);
	}

	public static void main(String[] args) {

		//Ways of creating HashMap # 1
		Map<String, Integer> map1=new HashMap<String, Integer>();
		map1.put("Max", 100);
		map1.put("Tom", 200);
		System.out.println(map1.get("Max"));
		
		//Ways of creating HashMap # 2 - Static method
		
		System.out.println(mape.get("XYz"));
		
		//Ways of creating HashMap # 3 - Singleton using collection - Immutable
		Map<String, String> map2=Collections.singletonMap("Max", "Salma");
		System.out.println(map2.get("Max"));
		//map2.put("mag", "Katy");//UnsupportedOperationException
		
		
		//From JDK 8 , Ways of creating HashMap # 4 - Stream of using collection - Non-Immutable
		Map<String, String> map3=Stream.of(new String [][] {
				{"Max","Kajal"},
				{"mag","Nayan"},
		}).collect(Collectors.toMap(data->data[0], data->data[1]));
		System.out.println(map3.get("Max"));
		map3.put("John", "Single");
		System.out.println(map3.get("John"));

				
		// Ways of creating HashMap # 5 -Abstract map - Simple entry - Immutable
		Map<String, String> map4 =Stream.of(new AbstractMap.SimpleEntry<>("Max", "Superstar"))
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));	
		System.out.println(map4.get("Max"));
				
				
		
		// Ways of creating HashMap # 6 -empty map- Immutable

		Map<String, String> emptymap=Map.of();
		//emptymap.put("Max", "Jolie");//UnsupportedOperationException
		//System.out.println(emptymap.get("Max"));
		
		
		// Ways of creating HashMap # 7 -Singleton map- Immutable

		Map<String, String> singleton=Map.of("Max","Tamana");
		System.out.println(singleton.get("Max"));
		//singleton.put("Magesh", "Bhatia");//UnsupportedOperationException
		
		
	
		// Ways of creating HashMap # 8 -multiple map- Immutable

		Map<String, String> multimap=Map.of("Max","Tamananew","Magesh","Bhatia");
		System.out.println(multimap.get("Magesh"));
		//multimap.put("Magesh2", "Sameera");//UnsupportedOperationException

		
		// Ways of creating HashMap # 9 -Map.ofEntries map- Immutable

		Map<String, String> entries=Map.ofEntries(
				new AbstractMap.SimpleEntry<>("Max","Tamananew"),
				new AbstractMap.SimpleEntry<>("Maxe","Tamanana"));
		System.out.println(entries.get("Maxe"));
		//entries.put("Jack", "Rose");UnsupportedOperationException
		
		
		// Ways of creating HashMap # 10 -using Guaua Immutable. need Guava dependency package
		//Map<String, String> entries=Immutable.

		

		
		
	}

}
