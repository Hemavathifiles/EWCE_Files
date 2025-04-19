package org.tnsif.capgemini.c2tc.oopsdemo;

class Animal2
{
	void eat()
	{
		System.out.println("Animal is eating");
	}
}
class Dog3 extends Animal2
{
	void bark()
	{
		System.out.println("Dog is barking");
	}
}

class Cat3 extends Animal2
{
	void moew()
	{
		System.out.println("Cat is meowing");
	}
}
public class Hierarchical_Demo {

	public static void main(String[] args) {
		Dog3 dog=new Dog3();
		Cat3 cat=new Cat3();
		
		dog.bark();
		cat.moew();

	}

}
