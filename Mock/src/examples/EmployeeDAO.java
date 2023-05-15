package examples;

import java.util.List;
import java.util.Scanner;

public class EmployeeDAO {
Scanner sc=new Scanner(System.in);
	
	public void create(List<Employee> list) {
		Employee e=new Employee();
		System.out.println("Enter employee name: ");
		e.setName(sc.next());
		System.out.println("Enter employee department: ");
		e.setDepartment(sc.next());
		System.out.println("Enter employee age: ");
		e.setAge(sc.nextInt());
		System.out.println("Enter employee email: ");
		e.setEmail(sc.next());
		list.add(e);
		
	}
	
	public void delete(List<Employee> list) {
		System.out.println("Please enter the id of the employee you wish to delete: ");
		int num=sc.nextInt();
		for(int i=0;i<list.size();i++) {
			if(num==list.get(i).getId()) {
				list.remove(i);
			}
		}
	}
	
	public void read(List<Employee> list) {
		for(Employee e: list) {
			System.out.println("Employee ID is: "+e.getId());
			System.out.println("Employee name is: "+e.getName());
			System.out.println("Employee age is: "+e.getAge());
			System.out.println("Employee department is: "+e.getDepartment());
			System.out.println("Employee email is: "+e.getEmail());

		}
		
	}
}
