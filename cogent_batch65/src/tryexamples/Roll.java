package tryexamples;

import java.io.ObjectOutputStream;
import java.io.FileOutputStream;
import java.io.Serializable;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Roll implements Serializable{
	
	int age;
	int rollNumber;
	String name;
	String address;
	
	public Roll(int age,int rollNumber,String name,String address) {
		this.age=age;
		this.rollNumber=rollNumber;
		this.name=name;
		this.address=address;
	}
	
	public void print() {
		System.out.println("Age is: "+this.age);
		System.out.println("Roll Number is: "+this.rollNumber);
		System.out.println("Name is: "+this.name);
		System.out.println("Address is: "+this.address);
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int age;
		int rollNumber;
		String name;
		String address;
		
		try {
			System.out.println("Please enter a name: ");
			name=sc.next();
			System.out.println("Please enter an address: ");
			address=sc.next();
			System.out.println("Please enter an age: ");
			age=sc.nextInt();
			System.out.println("Please enter a roll number: ");
			rollNumber=sc.nextInt();
			Roll r=new Roll(age,rollNumber,name,address);
			
			System.out.println("Would you like to save this to a file?");
			System.out.println("1-Yes");
			System.out.println("2-No");
			int choice=sc.nextInt();
			
			switch(choice) {
			case 1: 
				try {
					
					FileOutputStream fos=new FileOutputStream("/Users/trav/eclipse-workspace/cogent_batch65/src/tryexamples/rolls.txt");
					ObjectOutputStream oos=new ObjectOutputStream(fos);
					oos.writeObject(r);
					fos.close();
					oos.close();
					System.out.println("The object was successfully written to the file.");
					}catch (Exception e) {
						System.out.println(e);
					}
				break;
			case 2:
				System.out.println("You have chosen not to save to a file.");
				break;
			}

		}catch (InputMismatchException e) {
			System.out.println(e);
			System.exit(0);
		}
		
		
		
		
		
	}

}
