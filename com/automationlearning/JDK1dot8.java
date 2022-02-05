package com.automationlearning;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class JDK1dot8 {

	public static void main(String[] args) {

		Stream.of(1,2,3,4,5).filter(e -> e%2==0).forEach(e->System.out.println(e));
		
		
		Stream.of("Hello","Java")
			.map(e -> e +" world").forEach(System.out::println);
		
		String s[]=new String[5];
		s[2]="max";
		
		Optional<String> isnull=Optional.ofNullable(s[2]);
		
		if(isnull.isPresent())
		{
			System.out.println("value of S[2] is if "+ s[2]);

		}
		else
		{
			System.out.println("value of S[2] is null");
		}
		
		
		
		List<Integer> lst=Arrays.asList(1,2,3);
		System.out.println(lst);
		List<String> L=List.of("max","mad");
		L.stream().forEach(e->System.out.println(e));
		
		//var supports any datatype
		var x="10";
		System.out.println(x+20);
		
		var v=new HashSet<String>();
		v.add("maddy");
		v.add("maggy");
		System.out.println(v);
		
		
		//New switch case in JDK 12
		
		var n=7;
		var m=switch(n)
				{
		case 1-> "one";
		case 2-> "two";
		case 3-> "three";
		case 4-> "four";
		default -> "no matching number";
		
				};
				System.out.println(m);
		
		
		// multi line statment from JDK 15
				
				var response="""
						{
								"Name":"max",
								"Age":"23",
								"City":"NYC"
						}
				""";
				System.out.println(response);
				
				
		Employee e1=new Employee("Max", 27, "NYC");
		System.out.println(e1.Name());
		System.out.println(e1.Age());
		System.out.println(e1.City());
		
		//Instance of object
		
		Object obj=new String("Maxiee");
		if(obj instanceof String)
		{
			System.out.println(obj.toString());
		}

		
	
	}

}
