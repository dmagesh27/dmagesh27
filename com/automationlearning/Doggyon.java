package com.automationlearning;


class Animalon{  
void eat() {
	System.out.println("eating...");}  
}  
class Doggyon extends Animalon 
	{
	void bark()
	{
		System.out.println("barking...");
	}  
	void eat() {
		System.out.println("eating Doggy...");}  
	 
   
public static void main(String args[]) 
{  
Doggyon d=new Doggyon();  
d.bark();  
d.eat(); 
Animalon A=new Animalon();
A.eat();


} 
}