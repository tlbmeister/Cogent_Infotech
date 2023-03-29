package tryexamples;

import java.util.Scanner;
import java.util.ArrayList;

public class BookMain {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArrayList<Book> list=new ArrayList<>();
		BookDAO bd=new BookDAO();

		while(true) {
			System.out.println("*********Menu***********");
			System.out.println("1-Add book");
			System.out.println("2-Update book");
			System.out.println("3-Find book");
			System.out.println("4-Delete book");
			System.out.println("5-Exit");
			int choice=sc.nextInt();
			
			switch(choice) {
			case 1:
				list.add(bd.create());
				break;
			case 2:
				Book temp=new Book();
				System.out.println("Which book would you like to replace?");
				temp.bookId=sc.nextInt();
				for(Book b: list) {
					if(b.bookId==temp.bookId) {
						temp=b;
					}
				}
				int index=list.indexOf(temp);
				list.set(index,bd.update(temp));
				break;
			case 3:
				System.out.println("Which book would you like to find?");
				index=sc.nextInt();
				
				System.out.println("The book with id of "+index+" is at index "+list.indexOf(bd.find(list, index))+" of the list.");
				
				break;
			case 4:
				System.out.println("Which book would you like to delete?");
				index=sc.nextInt();
				list.remove(bd.delete(list, index));
				break;
			case 5:
				System.exit(0);
			}
			
		}
	}

}
