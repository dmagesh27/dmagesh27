package com.JavaPractise;

public class ClassInsideClass {
	
	

	public static void main(String[] args) {
		
		System.out.println("this is inside main");
		System.out.println(Subclass.x);
		//Subclass.show();



		
	}

}


class Subclass
{
	public static final int x=100; // with final keyword... directly 100 will be passed in the 
	//place of subclass.x  and the Subclass class will not be loaded. 
	//if the final keyword is removed static blocked  will be printed.

	static {
		System.out.println("this is static block");
	}
	public static  void show() {
		
		System.out.println("show method of Subclass");
	}

}