package org.tnsif.capgemini.c2tc.oopsdemo;

class Animal1
{
	String name="Animal";
	
	void eat()
	{
		System.out.println(name + "is eating");
	}
}
class Dog1 extends Animal1
{
	void bark()
	{
		System.out.println("Dog is barking");
	}
}
class Mammal extends Dog1
{
	void sleep()
	{
		System.out.println("Mammal is sleeping");
	}
}

public class MultiLevel_InheritanceDemo {

	public static void main(String[] args) {
		Mammal mammal=new Mammal ();
		mammal.eat();
		mammal.bark();
		mammal.sleep();


	}

}
