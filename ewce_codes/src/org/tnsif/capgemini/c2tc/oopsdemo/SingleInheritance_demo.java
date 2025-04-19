package org.tnsif.capgemini.c2tc.oopsdemo;

class Animal // parent class
{
	String name="Animal";
	
	void eat()
	{
		System.out.println(name + " is eating");
	}
}
class Dog extends Animal
{
	void bark()
	{
		System.out.println("Dog is barking");
	}
}


public class SingleInheritance_demo {

	public static void main(String[] args) {
		 Dog dog=new Dog();
		 dog.eat();
		 dog.bark();
		 

	}

}
