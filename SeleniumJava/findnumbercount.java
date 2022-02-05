package SeleniumJava;

import java.util.HashMap;

public class findnumbercount {
	
	public static void getdigit(int number ) {
	
		HashMap<Integer, Integer> digitmap=new HashMap<Integer, Integer>();
	
	while(number!=0)
	{
		int lastdigit=number%10;
		if(digitmap.containsKey(lastdigit))
		{
			digitmap.put(lastdigit, digitmap.get(lastdigit)+1);
		}
		else
		{
			digitmap.put(lastdigit, 1);
		}
	number=number / 10;	
	
	}
	//digitmap.forEach((K,v)->System.out.println(digitmap.get(K)+":"+digitmap.get(v)));;

	digitmap.entrySet().forEach(e->System.out.println(e.getKey()+":"+e.getValue()));
	}
	public static void main(String[] args) {
		getdigit(22288523);
		
		
	}

}
