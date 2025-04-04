package ewce_codes;



public class VariableDemo {
	int a=10; //instance variable
	void print()
	{
		String msg="hello i am local variable"; //local variable
		System.out.println(msg);
	}
	static String message="Hello i am static variable";
	
	public static void main(String[] args) {
		VariableDemo obj1=new VariableDemo();
		System.out.println("instance variable " +obj1.a);
		obj1.print();
		System.out.println(message);
		
	}

}
