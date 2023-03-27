package cogent_batch65;

public class Emp {
	int empId;
	String empName;
	String designation;
	double basic;
	final double hra;
	
	public Emp(int empId, String name, String designation, double basic) throws LowSalException{
		if(basic<500) {
			throw new LowSalException("Basic is less than 500");
		}
		this.empId=empId;
		this.empName=name;
		this.designation=designation;
		this.basic=basic;
		if(designation=="Manager") {
			this.hra=calculateHRA(1);
		}else if(designation=="Officer") {
			this.hra=calculateHRA(2);
		}else if(designation=="Clerk") {
			this.hra=calculateHRA(3);
		}else {
			this.hra=0;
		}
	}
	
	public void printDET() {
		System.out.println("Employee Details: ");
		System.out.println("Employee ID: "+this.empId);
		System.out.println("Employee Name: "+this.empName);
		System.out.println("Employee Designation: "+this.designation);
		System.out.println("Employee basic: "+this.basic);
		System.out.println("Employee HRA: "+this.hra);
		System.out.println("");
		
	}
	
	public double calculateHRA(int c) {
		if(c==1) {
			return basic*.1;
		}else if(c==2) {
			return basic*.12;
		}else if(c==3) {
			return basic*.05;
		}
		return 0;
	}
	
	public static void main(String args[]) {
		try {
		Emp e1=new Emp(1,"Joe","Manager",1000);
		e1.printDET();
		Emp e2=new Emp(2,"John","Officer",100);
		e2.printDET();
		Emp e3=new Emp(3,"Jane","Clerk",1000);
		e3.printDET();
		}catch(LowSalException e) {
			System.out.println(e.getMessage());
		}
	}

}
