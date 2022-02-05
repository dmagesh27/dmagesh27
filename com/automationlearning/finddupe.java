package com.automationlearning;

public class finddupe {
		

	public static void main(String[] args) {

		String strng= "Big black bug bit a big BLACK dog on his big black nose"; 
		
		strng=strng.toLowerCase();
		
		String words[] = strng.split(" ");
		
	
		
		int count;
		
		for(int i=0;i<words.length ;i++)
		{ count=1;
			for(int j=i+1;j<words.length;j++)
			{ 			
				if(words[i].equals(words[j]))
				{
					count++;
					words[j]="0";

				}
				}

				if(count>1&&words[i]!="0")	
				{
					System.out.println(words[i]+":"+count);
				}
					
				
			
		}
		
		
	}

}
