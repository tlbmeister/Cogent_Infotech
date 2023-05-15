package examples;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Employee {
	
	private static int autoId=1;
	private int id;
	private String name;
	private String department;
	private int age;
	private String email;
	
	public void setEmployee(String name,String department,int age, String email) {
		if(this.id==0) {
			this.id=autoId++;
		}
		this.name=name;
		this.department=department;
		this.age=age;
		this.email=email;
	}
	public Employee(String name,String department,int age,String email) {
		this.id=autoId++;
		this.name=name;
		this.department=department;
		this.age=age;
		this.email=email;
	}
	public Employee() {
		this.id=autoId++;
	}
	
	

	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getDepartment() {
		return department;
	}



	public void setDepartment(String department) {
		this.department = department;
	}



	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		List<Employee> employee=new ArrayList<>();
		EmployeeDAO dao=new EmployeeDAO();
		int choice=0;
		
		do {
			System.out.println("*****Menu*****");
			System.out.println("1-Add Employee");
			System.out.println("2-Delete");
			System.out.println("3-Show Employees");
			System.out.println("4-Exit");
			System.out.println("Please enter your choice: ");
			choice=sc.nextInt();
			
			switch(choice) {
			case 1:
				dao.create(employee);
				break;
			case 2:
				dao.delete(employee);
				break;
			case 3:
				dao.read(employee);
				break;
			case 4:
				System.exit(0);
			}
			
		}while(choice!=4);

	}

}
