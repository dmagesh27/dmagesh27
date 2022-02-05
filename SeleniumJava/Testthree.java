package SeleniumJava;


	 class Aon {
		public void test1(){
		System.out.println("test1");
		}
		}
		class Bon extends Aon{
		public void test2(){
		System.out.println("test2");
		}
		}
		public class Testthree{
		public static void main (String[] args){
		Aon a = new Aon();
		Aon b = new Bon();
		Bon b1 = new Bon();
		//b1.test2();
		((Bon)b).test2();
		
		}
		}

