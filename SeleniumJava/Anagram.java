package SeleniumJava;

import java.util.Arrays;

public class Anagram {
	
	
	public static boolean Anagrame(String s1, String s2)
		{
		
		s1=s1.replaceAll("\\s", "");
		s2=s2.replaceAll("\\s", "");

		if(s1.length()==s2.length())
		{
			char a1[]=s1.toLowerCase().toCharArray();
			char a2[]=s2.toLowerCase().toCharArray();
			
			Arrays.sort(a1);
			Arrays.sort(a2);
						
			return Arrays.equals(a1, a2);
			
		}
		else
			return false;
	};
	
	
	

	public static void main(String[] args) {

		System.out.println(Anagrame("Act","ca t"));
		System.out.println(Anagrame("Lives","elvis"));
		System.out.println(Anagrame("Listen"," SIL ENT"));
		System.out.println(Anagrame("Listen","SILENTB"));
		System.out.println(Anagrame("Listen","SILENA"));



		
	}

}
