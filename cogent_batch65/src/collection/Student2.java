package collection;

public class Student2 implements Comparable<Student2>{
	private int rollNo;
	private String name;
	
	public Student2(int rollNo, String name) {
		this.rollNo=rollNo;
		this.name=name;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String toString() {
		return "Roll Number: " + this.rollNo+" Name: "+ this.name;
		
	}
	
	public int compareTo(Student2 o) {
		return this.name.compareTo(o.name);
	}
}
