package assessment2;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		EmployeeDAOIMPL dao=new EmployeeDAOIMPL();
		Scanner sc=new Scanner(System.in);
		int choice;
		ArrayList<Employee> al=new ArrayList<>();
		
		do {
			System.out.println("**********Menu**********");
			System.out.println("1-Create employee");
			System.out.println("2-Update employee");
			System.out.println("3-Delete employee");
			System.out.println("4-Read all employees");
			System.out.println("5-Search employee");
			System.out.println("6-Sort employees by name");
			System.out.println("7-Exit");
			System.out.println("Please enter your choice: ");
			choice=sc.nextInt();
			
			
			switch(choice) {
			case 1:
				al.add(dao.create());
				break;
			case 2:
				al=dao.update(al);
				break;
			case 3:
				dao.delete(al);
				break;
			case 4:
				for(Employee e:al) {
					dao.read(e);
				}
				break;
			case 5:
				try {
					dao.read(dao.search(al));
				}catch(Exception e) {
					System.out.println("There was no employee found with that number.");
				}
				break;
			case 6:
				al=dao.sort(al);
				break;
			case 7:
				System.exit(0);
			}
			
		}while (choice!=7);
		
	}

}
