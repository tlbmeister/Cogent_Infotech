package cogent_batch65;
import java.util.Scanner;

public class Number {
	
	int firstNumber;
	int secondNumber;
	double result;
	
	public Number(int x, int y) {
		this.firstNumber=x;
		this.secondNumber=y;
	}
	
	public void add() {
		this.result=this.firstNumber+this.secondNumber;
	}
	
	public void sub() {
		this.result=this.firstNumber-this.secondNumber;
	}
	
	public void mul() {
		this.result=this.firstNumber*this.secondNumber;
	}
	
	public void div() {
		try {
		this.result=this.firstNumber/this.secondNumber;
		}catch(ArithmeticException e) {
			throw new ArithmeticException("Division by zero is undefined.");
		}
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int first=0;
		int second=0;
		
		System.out.println("Please enter the first number: ");
		first=sc.nextInt();
		System.out.println("Please enter the second number: ");
		second=sc.nextInt();
		Number n=new Number(first,second);
		
		System.out.println("**********Menu*************");
		System.out.println("1-Add");
		System.out.println("2-Subtract");
		System.out.println("3-Multiply");
		System.out.println("4-Divide");
		System.out.println("Please select one: ");
		int choice=sc.nextInt();
		
		switch(choice) {
		case 1:
			n.add();
			System.out.println(n.result);
		case 2:
			n.sub();
			System.out.println(n.result);
		case 3:
			n.mul();
			System.out.println(n.result);
		case 4:
			n.div();
			System.out.println(n.result);
		}
		
		
			
	}

}
