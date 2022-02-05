package com.automationlearning;

class Animal{  
void eat() {
	System.out.println("eating...");}  
}  
class Doggy extends Animal  
	{
	void bark()
	{
		System.out.println("barking...");
	}  
	void eat() {
		System.out.println("eating Doggy...");}  
	 
   
public static void main(String args[]) 
{  
Doggy d=new Doggy();  
d.bark();  
d.eat(); 
Animal A=new Animal();
A.eat();
} 
}