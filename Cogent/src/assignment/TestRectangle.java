package assignment;
import java.util.Scanner;

public class TestRectangle {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int l;
		int b;
		System.out.println("Enter a length for the rectangle: ");
		l=sc.nextInt();
		System.out.println("Enter a bredth for the rectangle: ");
		b=sc.nextInt();
		Rectangle r1=new Rectangle();
		r1.setBredth(b);
		r1.setLength(l);
		
		System.out.println("Enter a length for the rectangle: ");
		l=sc.nextInt();
		System.out.println("Enter a bredth for the rectangle: ");
		b=sc.nextInt();
		Rectangle r2=new Rectangle();
		r2.setBredth(b);
		r2.setLength(l);
		
		System.out.println("Enter a length for the rectangle: ");
		l=sc.nextInt();
		System.out.println("Enter a bredth for the rectangle: ");
		b=sc.nextInt();
		Rectangle r3=new Rectangle();
		r3.setBredth(b);
		r3.setLength(l);
		
		System.out.println("Enter a length for the rectangle: ");
		l=sc.nextInt();
		System.out.println("Enter a bredth for the rectangle: ");
		b=sc.nextInt();
		Rectangle r4=new Rectangle();
		r4.setBredth(b);
		r4.setLength(l);
		
		System.out.println("Enter a length for the rectangle: ");
		l=sc.nextInt();
		System.out.println("Enter a bredth for the rectangle: ");
		b=sc.nextInt();
		Rectangle r5=new Rectangle();
		r5.setBredth(b);
		r5.setLength(l);
		
		r1.display();
		r2.display();
		r3.display();
		r4.display();
		r5.display();
		
		
		
		
	}

}
