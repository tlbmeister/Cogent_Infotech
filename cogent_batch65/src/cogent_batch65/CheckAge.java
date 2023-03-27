package cogent_batch65;

import java.util.Scanner;

public class CheckAge {
	
	public void validateAge(int age)throws InvalidAgeException{
		if(age<=100 && age>0) {
			System.out.println("Valid age");
		}else {
			//System.out.println("Age is not valid");
			throw new InvalidAgeException("Age is not valid.");
		}
	}

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the age: ");
		int age=sc.nextInt();
		CheckAge ck=new CheckAge();

		try {
			ck.validateAge(age);
		}catch(InvalidAgeException ia) {
			
			System.out.println("Invalid age. "+ia.getMessage());
		}
		}

}
