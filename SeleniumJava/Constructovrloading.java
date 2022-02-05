package SeleniumJava;

public class Constructovrloading {
	
	Constructovrloading()
	{
		this(0);
		System.out.println("Hi");
	}
	
	Constructovrloading(int x)
	{
		this(0,0);
		System.out.println("Hello");
	}
	
	Constructovrloading(int x, int y)
	{
		System.out.println("How are you?");
	}
	
	public static void main(String args[])
	{
		Constructovrloading obj= new Constructovrloading();
		
	}

}
