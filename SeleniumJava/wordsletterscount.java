package SeleniumJava;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class wordsletterscount {

	public static void main(String[] args) throws FileNotFoundException {

		String path="C:\\Users\\Auto\\Documents\\test.txt";
		
		
		BufferedReader reader = new BufferedReader(new FileReader(path));
		
		int charcount=0;
		int wordcount=0;
		int linecount=0;
		
			try {
				String currentline=reader.readLine();
				while(currentline!=null)
				{
				System.out.println(currentline);
				
				for(int i=0;i<currentline.length();i++)
				{
					if(currentline.charAt(i)!='\s')
						charcount=charcount+1;
					
					//if(currentline.split(currentline))
				
					
				}
				String word[]=currentline.split(" ");
				wordcount=wordcount+word.length;
				
				linecount=linecount+1;
				currentline=reader.readLine();
				


				}
				System.out.println("charcount: "+charcount);
				System.out.println("wordcount: "+wordcount);
				System.out.println("linecount: "+linecount);

				reader.close();

			} catch (IOException e) {
				
				e.printStackTrace();
			}


		}
	}


