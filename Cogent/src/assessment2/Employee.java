package assessment2;

public class Employee implements Comparable<Employee>{
	int employeeNo;
	String employeeName;
	String employeeAddress;
	String employeeEmail;
	int employeeSalary;
	
	public Employee(int num, String name, String add, String email, int sal) {
		super();
		this.employeeNo=num;
		this.employeeName=name;
		this.employeeAddress=add;
		this.employeeEmail=email;
		this.employeeSalary=sal;
		
	}

	public int getEmployeeNo() {
		return employeeNo;
	}

	public void setEmployeeNo(int employeeNo) {
		this.employeeNo = employeeNo;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getEmployeeAddress() {
		return employeeAddress;
	}

	public void setEmployeeAddress(String employeeAddress) {
		this.employeeAddress = employeeAddress;
	}

	public String getEmployeeEmail() {
		return employeeEmail;
	}

	public void setEmployeeEmail(String employeeEmail) {
		this.employeeEmail = employeeEmail;
	}

	public int getEmployeeSalary() {
		return employeeSalary;
	}

	public void setEmployeeSalary(int employeeSalary) {
		this.employeeSalary = employeeSalary;
	}
	
	public int compareTo(Employee temp) {
		return this.employeeName.compareTo(temp.employeeName);
	}
	
	

}
