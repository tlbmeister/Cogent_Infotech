package gl.itp.hyd65.cs65.Travis;
import java.util.Scanner;

public class Create {
	
	public Book[] createBoooks(int n) {
		Scanner sc=new Scanner(System.in);
		String name;
		double price;
		Book[] b=new Book[n];
		for(int i=0;i<b.length;i++) {
			Book temp=new Book();

			System.out.println("Enter book name: ");
			name=sc.next();
			System.out.println("Enter book price: ");
			price=sc.nextDouble();
			
			temp.setBook_price(price);
			temp.setBook_title(name);
			System.out.println(i);
			b[i]=temp;
		}
		
		return b;
	}
	
	public void showBooks(Book[] b) {
		System.out.println("Book Title          Price");
		for(int i=0;i<b.length;i++) {
			System.out.println(b[i].getBook_title()+"                 "+b[i].getBook_price());
		}
	}

}
