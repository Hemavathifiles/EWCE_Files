package org.tnsif.capgemini.c2tc.oopsdemo;

class Human
{
	private int age;
	private String name;
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
}
public class EncapsulationDemo {

	public static void main(String[] args) {
		Human obj=new Human();
		obj.setAge(12);
		obj.setName("Hari");
		System.out.println(obj.getAge() + " : "+ obj.getName());
		
		obj.setAge(22);
		obj.setName("Shruthi");
		System.out.println(obj.getAge() + " : "+ obj.getName());

	}

}
