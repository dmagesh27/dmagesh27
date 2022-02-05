package SeleniumJava;

public class Atwo{
	 static{System.out.println("static");}
	{ System.out.println("block");}
	public Atwo(){
	System.out.println("Atwo");
	}
	public static void main(String[] args){
	Atwo a = new Atwo();
	}
}