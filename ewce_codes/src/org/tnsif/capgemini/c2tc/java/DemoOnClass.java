package org.tnsif.capgemini.c2tc.java;


 class Student
{
   int id;
   String name;
	
	
	void display()

{
	System.out.println("Student information : id & Name  " +id + "  "+name);
}
}

public class DemoOnClass {

	public static void main(String[] args) {
		Student obj1 = new Student();
//		obj1.id=12;
//		obj1.name="anil";
		obj1.display();
	}

}
