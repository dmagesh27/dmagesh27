package com.JavaPractise;

public class StringManipulation {

	public static void main(String[] args) {

		String s="My name is the great Max";
		String s1="My name is The great Max";
		
		System.out.println(s.length());

		
			//ChatAt()
		System.out.println(s.charAt(5));
		
		// IndexOf
		
		System.out.println(s.indexOf('a'));
		
		System.out.println(s.indexOf('a', s.indexOf('a')+1));
		
		System.out.println(s.indexOf('a',s.indexOf('a', s.indexOf('a')+1)+1));

		//Str comparision
		
		System.out.println(s.equals(s1));
		
		System.out.println(s.equalsIgnoreCase(s1));
		
		//substring
		
		
		System.out.println(s.substring(2));
		
		System.out.println(s.substring(0,7));
		
		
		
		//trim
		
		String s3=" Hello World   ";
		System.out.println(s3.trim());
		
		//replace
		System.out.println(s3.replace(" ", ""));

		
		System.out.println(s3.replace('d', 's'));
		
		
		//Split
		
		String s4[]=s.split(" ");
		for(int i=0;i<s4.length;i++)
		{
			System.out.println(s4[i]);
		}
		
		
		//Concat
		
		String s5="Care";
		System.out.println(s5.concat("s"));
		
		
		//addition and concat
		
		String a1="Hello";
		String b1="World";
		int x=100;
		int y=200;
		
		System.out.println(a1+b1+x+y);
		System.out.println(x+y+a1+b1);
		System.out.println(a1+b1+(x+y));


		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

		
		
		
		
		

		
		
		
	}

}
