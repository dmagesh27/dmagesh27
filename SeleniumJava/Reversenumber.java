package SeleniumJava;


public class Reversenumber {
	int number;
	public static void rec(int number) {
		
	
		if(number<10)
		{
			System.out.print(number);
			return;
		}
		else 
		{
			System.out.print(number%10);

			rec(number/10);
	
		}
	
}
	public static void main(String[] args) {
		rec(26886734);
	}

}
