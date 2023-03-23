package inheritance;

class FatherC{
	int pAge=50;
	
	public void display() {
		System.out.println("Parent age is: "+pAge);
	}
}

class Child extends FatherC{
	int cAge=25;
	
	public void display() {
		super.display();
		System.out.println("Child age is: "+cAge);
	}
}

public class SuperDemo {

	public static void main(String[] args) {
		Child ch=new Child();
		ch.display();
	}

}
