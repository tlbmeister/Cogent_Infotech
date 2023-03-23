package cogent_batch65;
import java.util.Scanner;
public class BookTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Book b=new Book();
//		
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter a book number");
//		b.setBookNumber(sc.nextInt());
//		System.out.println("Enter a book name");
//		b.setBookName(sc.next());
//		System.out.println("Enter a book price");
//		b.setBookPrice(sc.nextInt());
//		System.out.println("Enter an author's name");
//		b.setAuthorName(sc.next());
//		
//		System.out.println("Book details:");
//		System.out.println("Book number: "+b.getBookNumber());
//		System.out.println("Book name: "+b.getBookName());
//		System.out.println("Book price: "+b.getBookPrice());
//		System.out.println("Book author name: "+b.getAuthorName());
		Scanner sc=new Scanner(System.in);
		Book[] book=new Book[5];
		
		for(int i=0;i<5;i++) {
			Book b1=new Book();
			System.out.println("Enter a book number");
			b1.setBookNumber(sc.nextInt());
			System.out.println("Enter a book name");
			b1.setBookName(sc.next());
			System.out.println("Enter a book price");
			b1.setBookPrice(sc.nextInt());
			book[i]=b1;
			
		}
		
		for(int j=0;j<book.length;j++) {
			System.out.println("Book details: ");
			System.out.println("Book number: "+book[j].getBookNumber());
			System.out.println("Book name: "+book[j].getBookNumber());
			System.out.println("Book price: "+book[j].getBookPrice());
		}
		
	}

}
