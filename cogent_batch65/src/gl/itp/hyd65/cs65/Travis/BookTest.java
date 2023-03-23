package gl.itp.hyd65.cs65.Travis;
import java.util.Scanner;

public class BookTest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int count=0;
		System.out.println("Enter the number of books you would like to create: ");
		count=sc.nextInt();
		Create c=new Create();
		Book[] b=c.createBoooks(count);
		c.showBooks(b);
		
				
	}

}
