package collection;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Collection;
import java.util.Set;

public class Student {
	Scanner sc=new Scanner(System.in);
	private HashMap<String,String> empNames= new HashMap<>();
	
	public void setNames() {
		int choice;
		do {
		System.out.println("Enter a student rollno: ");
		String key=sc.next();
		System.out.println("Enter a student name: ");
		String value=sc.next();
		empNames.put(key, value);
		System.out.println("Enter another Student?");
		System.out.println("1-Yes");
		System.out.println("2-No");
		choice=sc.nextInt();
		}while(choice==1);
		
	}
	
	public void printNames() {
		Collection<String> names=empNames.values();
		System.out.println(names);
	}
	
	public void getName(String key) {
		System.out.println(empNames.get(key));
	}
	
	public void printSize() {
		System.out.println("The size of the hash map is: "+empNames.size());
	}
	
	public void printNamesKeySet() {
		Set<String> set=empNames.keySet();
		for(String s:set) {
			System.out.println(empNames.get(s));
		}
		
	}
	
	public void remove(String key) {
		empNames.remove(key);
	}
}
