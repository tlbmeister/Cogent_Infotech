package inheritance;
//compile time polymorphism or static binding

class Calculator{
	public void add(int a, int b) {
		int result=a+b;
		System.out.println("Sum of two integers is: "+result);
	}
	
	public void add(float a, float b) {
		float result=a+b;
		System.out.println("Sume of two floats is: "+result);
	}
	
	public void add(String a, String b) {
		String result=a+b;
		System.out.println("Concatenation of two strings is: "+result);
	}
}

public class MethodOverloadingDemo {

	public static void main(String[] args) {

		Calculator c=new Calculator();
		c.add(100, 200);
		c.add(1.25f, 2.25f);
		c.add("Gyanendra", "Singh");
	}

}
