package com.automationlearning;

public class Audi implements carinterface {
	
	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("Audi start");
		
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("Audi stop");
	}

	@Override
	public void refuel() {
		// TODO Auto-generated method stub
		System.out.println("Audi refuel");
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
		

	}

	

}
