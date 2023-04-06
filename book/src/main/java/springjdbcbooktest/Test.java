package springjdbcbooktest;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import springjdbcbookdao.BookDAO;
import springjdbcbookdto.Book;

public class Test {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ApplicationContext ctx = new ClassPathXmlApplicationContext("springjdbcbooktest/config.xml");
		BookDAO dao=(BookDAO)ctx.getBean("bookDAO");
		int choice;
		
		do {
			System.out.println("*********Menu**********");
			System.out.println("1-Create Book");
			System.out.println("2-Read single book");
			System.out.println("3-Read all books");
			System.out.println("4-Update Book");
			System.out.println("5-Delete Book");
			System.out.println("6-Exit");
			System.out.println("Please enter your choice");
			choice=sc.nextInt();
			
			switch(choice) {
			case 1:
				Book b=new Book();
				System.out.println("Create book selected.");
				System.out.println("Enter a book id: ");
				int id=sc.nextInt();
				System.out.println("Enter a book name:");
				String name=sc.next();
				System.out.println("Enter a book price: ");
				int price=sc.nextInt();
				b.setId(id);
				b.setName(name);
				b.setPrice(price);
				dao.create(b);
				break;
			case 2:
				System.out.println("Read single book selected.");
				System.out.println("Enter a book id: ");
				int readId=sc.nextInt();
				System.out.println(dao.read(readId));
				break;
			case 3:
				System.out.println("Read all books selected.");
				System.out.println(dao.read());
				break;
			case 4:
				Book updateBook=new Book();
				System.out.println("Update book selected.");
				System.out.println("Enter the id of the book to be updated: ");
				int updateId=sc.nextInt();
				System.out.println("Enter the new book name: ");
				String updateName=sc.next();
				System.out.println("Enter the new book price: ");
				int updatePrice=sc.nextInt();
				updateBook.setId(updateId);
				updateBook.setName(updateName);
				updateBook.setPrice(updatePrice);
				dao.update(updateBook);
				break;
			case 5:
				System.out.println("Delete book selected.");
				System.out.println("Enter a book id: ");
				int deleteId=sc.nextInt();
				dao.delete(deleteId);
				break;
			case 6:
				System.exit(0);
				break;
			}
		}while(choice!=6);
		
		
		


	}

}
