package tryexamples;
import java.util.ArrayList;

import java.util.Scanner;

public class BookDAO {
	Scanner sc=new Scanner(System.in);
	
	
	public Book create() {
		Book b=new Book();
		System.out.println("Enter a book id: ");
		b.setBookId(sc.nextInt());
		System.out.println("Enter a book name: ");
		b.setBookName(sc.next());
		System.out.println("Enter a book price: ");
		b.setBookPrice(sc.nextInt());
		return b;
		
	}
	
	public Book update(Book b) {
		System.out.println("Enter a book id: ");
		b.setBookId(sc.nextInt());
		System.out.println("Enter a book name: ");
		b.setBookName(sc.next());
		System.out.println("Enter a book price: ");
		b.setBookPrice(sc.nextInt());
		return b;
	}
	
	public Book find(ArrayList<Book> list, int id) {
		Book b=new Book();
		for(Book i: list) {
			if(i.bookId==id) {
				b=i;
			}
		}
		return b;
	}
	
	public Book delete(ArrayList<Book> list, int id) {
		Book b=new Book();
		for(Book i: list) {
			if(i.bookId==id) {
				b=i;
			}
		}
		return b;
	}

}
