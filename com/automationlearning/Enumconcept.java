package com.automationlearning;

import java.util.EnumSet;

public class Enumconcept {
	
	enum  lang { JAVA,PHYTHON,SQL,CHSARP,DOTNET}

	public static void main(String[] args) {
		
		EnumSet<lang> first=EnumSet.allOf(lang.class);
		System.out.println(first);
		
		EnumSet<lang> second=EnumSet.of(lang.JAVA , lang.SQL);
		System.out.println(second);
		
		EnumSet<lang> third=EnumSet.allOf(lang.class);
		System.out.println(third);
		System.out.println(third.remove(lang.SQL));
		System.out.println(third);


	}

}
