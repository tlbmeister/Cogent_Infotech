package cogent_batch65;
import java.util.Scanner;

public class BookDAO {
	
	Scanner sc=new Scanner(System.in);
	
	public void create(Book[] arr, int i) {
		Book b=new Book();
		arr[i]=b;
		System.out.println("Enter book id: ");
		b.setBookId(sc.nextInt());
		System.out.println("Enter book name: ");
		b.setBookName(sc.next());
		System.out.println("Enter book price: ");
		b.setBookPrice(sc.nextInt());
		
	}
	
	public void read(Book[] arr) {
		for(Book b: arr) {
			if(b==null) {
				continue;
			}
			System.out.println("Book ID is: "+b.getBookId());
			System.out.println("Book name is: "+b.getBookName());
			System.out.println("Book price is: "+b.getBookPrice());
		}
		
	}
	
	public void update(Book[] arr) {
		int choice=0;
		Book b=new Book();
		System.out.println("Please enter the book ID of the book you would like to update: ");
		choice=sc.nextInt();
		for(int i=0;i<arr.length;i++) {
			if(choice==arr[i].getBookId()) {
				arr[i]=b;
				System.out.println("Enter book ID: ");
				b.setBookId(sc.nextInt());
				System.out.println("Enter book name: ");
				b.setBookName(sc.next());
				System.out.println("Enter book price: ");
				b.setBookPrice(sc.nextInt());
			}
		}
		
	}
	
	public void delete(Book[] arr) {
		int choice=0;
		System.out.println("Please enter the book ID of the book you would like to delete: ");
		choice=sc.nextInt();
		for(int i=0;i<arr.length;i++) {
			if(choice==arr[i].getBookId()) {
				arr[i]=null;
				System.out.println("Book "+choice+" has been deleted.");
			}
		}
	}

}
