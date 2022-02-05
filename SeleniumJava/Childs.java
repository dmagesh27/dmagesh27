package SeleniumJava;

public class Childs extends Parents {
	
	public static void foo( ) {System.out.println("Foo in Child");}
	public void bar( ) {System.out.println("Bar in Child");}

	public static void main(String[] args) {
		Parents p=new Childs();
		Childs c=new Childs();
		Parents.foo();
		p.bar();
		
		Childs.foo();
		c.bar();
			}

}
