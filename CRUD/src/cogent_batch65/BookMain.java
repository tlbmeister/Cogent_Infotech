package cogent_batch65;
import java.util.Scanner;

public class BookMain {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Book[] arr=null;
		BookDAO dao=new BookDAO();
		int choice=0;
		
		do {
			System.out.println("*****Menu*****");
			System.out.println("1-Add book");
			System.out.println("2-Print book");
			System.out.println("3-Update");
			System.out.println("4-Delete");
			System.out.println("5-Exit");
			System.out.println("Please enter your choice: ");
			choice=sc.nextInt();
			
			switch(choice) {
			case 1:
				System.out.println("How many records do you want to add.");
				int count=sc.nextInt();
				arr=new Book[count];
				for(int i=0;i<arr.length;i++) {
					dao.create(arr,i);
				}
				break;
			case 2:
				dao.read(arr);
				break;
			case 3:
				dao.update(arr);
				break;
			case 4:
				dao.delete(arr);
				break;
			case 5:
				System.exit(0);
			}
			
		}while(choice!=5);
		

	}

}
