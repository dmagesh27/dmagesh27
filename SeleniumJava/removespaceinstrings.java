package SeleniumJava;


public class removespaceinstrings {

	public static void main(String[] args) {

		
		String stmt="   ..Peter Piper picked a peck of pickled peppers     ";
		String nowhitespace="";
		//System.out.println(stmt.trim());

		//System.out.println(stmt.replaceAll("\\s+", ""));
		
		for(int i=0;i<stmt.length();i++)
			if(stmt.charAt(i)!='\s' && stmt.charAt(i)!='\t')
			{
				nowhitespace=nowhitespace+stmt.charAt(i);
			}
				
		System.out.println(nowhitespace);
	}

}
