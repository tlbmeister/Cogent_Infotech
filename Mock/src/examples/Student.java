package examples;

public class Student {
	int rollNo;
	String name;
	String address;
	String email;
	
	public Student(int rollNo,String name,String address, String email) {
		this.rollNo=rollNo;
		this.name=name;
		this.address=address;
		this.email=email;
	}
	
	public Student() {
		
	}
	
	public void printDetails() {
		System.out.println("Roll No: "+rollNo+" Name: "+name+" Address: "+address+" Email: "+this.email+"\n");
	}
	
	public static void main(String[] args) {
		Student s=new Student(1,"Joe","DC","joe@email.com");
		s.printDetails();
		Student s2=new Student(2,"Jane","NY","jane@email.com");
		s2.printDetails();
	}
}
