package assessment2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class EmployeeDAOIMPL implements EmployeeDAO{
	Scanner sc=new Scanner(System.in);

	public Employee create() {
		System.out.println("Please enter an employee number: ");
		int num=sc.nextInt();
		System.out.println("Please enter an employee name: ");
		String name=sc.next();
		System.out.println("Please enter an employee address: ");
		String add=sc.next();
		System.out.println("Please enter an employee email: ");
		String email=sc.next();
		System.out.println("Please enter an employee salary: ");
		int sal=sc.nextInt();
		return new Employee(num,name,add,email,sal);
	}
	
	public ArrayList<Employee> update(ArrayList<Employee> al) {
		System.out.println("Please enter an employee number: ");
		int num=sc.nextInt();
		for(Employee e:al) {
			if(e.employeeNo==num) {
				System.out.println("Please enter an employee number: ");
				e.setEmployeeNo(sc.nextInt());
				System.out.println("Please enter an employee name: ");
				e.setEmployeeName(sc.next());
				System.out.println("Please enter an employee address: ");
				e.setEmployeeAddress(sc.next());
				System.out.println("Please enter an employee email: ");
				e.setEmployeeEmail(sc.next());
				System.out.println("Please enter an employee salary: ");
				e.setEmployeeSalary(sc.nextInt());
				System.out.println("Update successful.");
				return al;
			}
		}
		System.out.println("Employee number not found. List is unchanged.");
		return al;
	}
	
	public ArrayList<Employee> delete(ArrayList<Employee> al) {
		System.out.println("Please enter an employee number: ");
		int num=sc.nextInt();
		for(Employee e:al) {
			if(e.employeeNo==num) {
				al.remove(e);
				System.out.println("Employee successfully removed.");
				return al;
			}
		}
		System.out.println("Employee not found. List is unchanged.");
		return al;
	}
	
	public void read(Employee temp) {
		System.out.println("Employee Details: ");
		System.out.println("Employee Number: "+temp.employeeNo);
		System.out.println("Employee Name: "+temp.employeeName);
		System.out.println("Employee Address: "+temp.employeeAddress);
		System.out.println("Employee Email: "+temp.employeeEmail);
		System.out.println("Employee Salary: "+temp.employeeSalary);
		System.out.println("");
	}
	
	public Employee search(ArrayList<Employee> al) {
		System.out.println("Enter employee number: ");
		int num=sc.nextInt();
		for(Employee e:al) {
			if(e.employeeNo==num) {
				return e;
			}else {
				return null;
			}
		}
		return null;
		
	}
	
	public ArrayList<Employee> sort(ArrayList<Employee> al) {
		Collections.sort(al);
		System.out.println("List sorted by name.");
		return al;
	}
	

}
