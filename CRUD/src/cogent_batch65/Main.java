package cogent_batch65;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		Person person[]=null;
		PersonDAO dao=new PersonDAO();
		int choice=0;
		do {
			
			System.out.println("*****Menu*****");
			System.out.println("1-Add person");
			System.out.println("2-Print person");
			System.out.println("3-Exit");
			System.out.println("Please enter your choice: ");
			choice=sc.nextInt();
			
			switch(choice) {
			case 1:
				System.out.println("How many records do you want to add.");
				int count=sc.nextInt();
				person=new Person[count];
				for(int i=0;i<person.length;i++) {
					dao.create(person,i);
				}
				break;
			case 2:
				dao.read(person);
				break;
			case 3:
				System.exit(0);
			}
			
		}while(choice!=3);
	}

}
