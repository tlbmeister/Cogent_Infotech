package assessment1;

import java.util.Scanner;



public class ProductMain {

	public static void main(String[] args) {

		
		Scanner sc=new Scanner(System.in);
		Product[] arr=null;
		ProductCRUD crud=new ProductCRUD();
		int choice=0;
		
		do {
			System.out.println("*****Menu*****");
			System.out.println("1-Add record");
			System.out.println("2-Print record");
			System.out.println("3-Update record");
			System.out.println("4-Delete");
			System.out.println("5-Exit");
			System.out.println("Please enter your choice: ");
			choice=sc.nextInt();
			
			switch(choice) {
			case 1:
				System.out.println("How many records do you want to add?");
				int count=sc.nextInt();
				arr=new Product[count];
				for(int i=0;i<arr.length;i++) {
					crud.create(arr,i);
				}
				break;
			case 2:
				crud.read(arr);
				break;
			case 3:
				crud.update(arr);
				break;
			case 4:
				crud.delete(arr);
				break;
			case 5:
				System.exit(0);
			}
			
		}while(choice!=5);
	}

}
