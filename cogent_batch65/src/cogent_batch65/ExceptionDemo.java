package cogent_batch65;
import java.util.Scanner;

public class ExceptionDemo {

	public static void main(String[] args) {

//		Scanner sc=new Scanner(System.in);
//		System.out.println("Please enter two numbers: ");
//		int x=sc.nextInt();
//		int y=sc.nextInt();
//		try {
//			int z=x/y;
//			System.out.println(z);
//		} catch(ArithmeticException e) {
//			System.out.println("Division by zero is not allowed!!!");
//		}
		
		try {
			String input=args[0];
			System.out.println("Input is: "+input);
			int output=Integer.parseInt(input);
			System.out.println("Output is: "+output);
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			System.out.println("finally will work in both the cases");
		}
		System.out.println("This is after the try-catch");
		
	}

}
