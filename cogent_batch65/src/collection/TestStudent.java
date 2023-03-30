package collection;
import java.util.Scanner;

public class TestStudent {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		Student s=new Student();
		
		s.setNames();
		int choice;
		
		while(true) {
			System.out.println("*********Menu**********");
			System.out.println("1-Print names");
			System.out.println("2-Get name");
			System.out.println("3-Print names using keyset");
			System.out.println("4-Print size");
			System.out.println("5-Remove");
			System.out.println("6-Exit");
			choice=sc.nextInt();
			
			switch(choice) {
			case 1:
				s.printNames();
				break;
			case 2:
				System.out.println("Enter a roll number:");
				String key=sc.next();
				s.getName(key);
				break;
			case 3:
				s.printNamesKeySet();
				break;
			case 4:
				s.printSize();
				break;
			case 5:
				System.out.println("Enter a roll number: ");
				key=sc.next();
				s.remove(key);
				break;
			case 6:
				System.exit(0);
			}
		}
	}

}
