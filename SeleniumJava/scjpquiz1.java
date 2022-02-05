package SeleniumJava;

public class scjpquiz1 {

		 public static void main(String [] args) { 
		 int ax = 5; 
		 boolean b1 = true; 
		 boolean b2 = false; 
		 
		 if ((ax == 4) && !b2 ) 
		 System.out.print("1 "); 
		 System.out.print("2 "); 
		 if ((b2 = true) && b1 ) 
		 System.out.print("3 "); 
		 
		 //***************************
		 double d = 12.345; 
		 
		 System.out.printf("|%7.3f| \n", d);
		 
		 
		 //************************
		 StringBuilder sb1 = new StringBuilder("123"); 
		 String s1 = "123"; 
		 sb1.append("abc"); s1 = s1.concat("abc");
		 System.out.println(sb1 + " " + s1); 
		 
		 
		 
		 //****************
		 
		 
		 
		 String o = ""; z:
			 for(int x = 0; x < 3; x++) {
			 for(int y = 0; y < 2; y++) {
			 if(x==1) 
			 break; 
			 if(x==2 && y==1) 
			 break z; 
			 o = o + x + y; 
			 } 
			 } 
			 System.out.println(o); 
		 
		 
			 
			 //***********************
			 
			 int x = 0; int y = 10; 
			 do {
			 y--; ++x; 
			 } while (x < 5); 
			 System.out.print(x + "," + y);
			 
			 System.out.println();

			 
			 //********************
			 
			 
			 Integer e=0;
			 int f=5;
			 int g=f+e;
			 System.out.println(g);
			 
			 //******
			 
			 int i = 011;
			 int j = 07;
			System.out.println(i);
			System.out.println(j);
			 
		 
			
			
			//**************
			
			byte b = 6;
			b+=8;
			System.out.println(b);
			b+= 7;
			System.out.println(b);
			
			//*******
			
			String value = "abc";
			String value1=changeValue(value);
			System.out.println(value1);
			
			//************************
			scjpquiz1 sb=new scjpquiz1();
			sb.doIt("hello", 3);
			
			//*****************************
			int i1,j1=2;
			for( i1 = 2; i1 < 4; i1++)
				 for( j1 = 2; j1 < 4; j1++)
				// if(i1 < j1)
					 assert i1!=j1:i1;
			//System.out.println(i1+" "+j1);
		 } 
		 
		 
		 public int doIt(String str, Integer data)
		 {
		 String signature = "(String, Integer[])";
		 System.out.println("Overridden: " + str + " " +
		 signature);
		 return 0;
		 }

		 
		 public static String  changeValue(String a){
				a = "xyz";
				return a;
				}
		 
}
