package org.tnsif.capgemini.c2tc.oopsdemo;

public class KIA_Car {
	
	int noCar; //properties , variable
	String model;
	String engine;
	int cost;
	int speed=100;
	
	void display()
	{
		System.out.println("This is KIA motors , Welcome to our show room");
	}
	void welcome()
	{
		System.out.println("Welcome to our KIA ");
	}
	public static void main(String[] args) {
		KIA_Car obj=new KIA_Car();
		obj.display();
		obj.welcome();
		obj.noCar=1987;
		obj.model="KIA";
		obj.engine="SmartStream";
		obj.cost=900000;
		System.out.println("Car Number " + obj.noCar);
		System.out.println("Car Model " + obj.model);
		System.out.println("Car Engine " + obj.engine);
		System.out.println("Car cost " + obj.cost);
		System.out.println("Car speed "+ obj.speed);
		
		
		


	}

}
