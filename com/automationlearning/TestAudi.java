package com.automationlearning;

public class TestAudi  extends Audi{
	
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("TestAudi stop");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Audi a = new Audi();
		a.start();
		a.stop();
		a.refuel();
		
		System.out.println("*****carinterface starts******");

		carinterface c= new Audi();
		c.refuel();
		
		
		System.out.println("*****TestAudi starts******");
		Audi T = new TestAudi();
		T.stop();
		T.refuel();
		
		
	}

}
