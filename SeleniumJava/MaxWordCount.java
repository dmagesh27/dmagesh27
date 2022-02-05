package SeleniumJava;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class MaxWordCount {

	public static void main(String[] args) {

		
		String path="C:\\Users\\Auto\\Documents\\test.txt";
		
		Map<String,Integer> Wordmap=new HashMap<String, Integer>();
		
		try {
			BufferedReader reader = new BufferedReader(new FileReader(path));
			
			
			try {
				
				String CurrentLine=reader.readLine();
				
				while(CurrentLine!=null)
				{
			System.out.println(CurrentLine);	
			String Words[] =CurrentLine.toLowerCase().split(" ");
			//for(int i=0;i<Words.length;i++)
//			{
//				System.out.println(Words[i]);
//
//			}
			for(String word:Words)
			{

			if(Wordmap.containsKey(word))
			{
				
				Wordmap.put(word, Wordmap.get(word)+1);
			}
			
			else
			{
				Wordmap.put(word, 1);
				
			}
			
			}
			
			CurrentLine=reader.readLine();
				}
			reader.close();
				
				
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		//System.out.println(Wordmap);
		
		Map<String,Integer> maxmap=new HashMap<String, Integer>();

		Wordmap.forEach((k,v)->System.out.println(k +" : " + v));
	//Collections.max(Wordmap.values()).forEach(e->maxmap.put(e.getKey(), e.getValue())

		Wordmap.entrySet().stream().filter(entry->entry.getValue()==Collections.max(Wordmap.values())).forEach(e->maxmap.put(e.getKey(), e.getValue()));

		System.out.println(maxmap);
		
	
		
	}

}
