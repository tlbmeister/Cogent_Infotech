package assessment1;

import java.util.Scanner;

public class ProductCRUD {
	
	Scanner sc=new Scanner(System.in);
	
	public void create(Product[] arr, int i) {
		Product p=new Product();
		
		System.out.println("Enter a product ID: ");
		p.setProductId(sc.nextInt());
		System.out.println("Enter a prodcut name: ");
		p.setProductName(sc.next());
		System.out.println("Enter a product price: ");
		p.setProductPrice(sc.nextInt());
		
		arr[i]=p;
		
		
	}
	
	public void read(Product[] arr) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==null) {
				continue;
			}
			System.out.println("Product id: "+arr[i].getProductId());
			System.out.println("Product name: "+arr[i].getProductName());
			System.out.println("Product price: "+arr[i].getProductPrice());
			System.out.println("");
		}
	}
	
	public void update(Product[] arr) {
		System.out.println("Please enter the ID of the product you would like to update: ");
		int i=sc.nextInt();
		for(Product p: arr) {
			if(p.getProductId()==i) {
				System.out.println("Enter a new product ID: ");
				p.setProductId(sc.nextInt());
				System.out.println("Enter a new product name: ");
				p.setProductName(sc.next());
				System.out.println("Enter a new product price: ");
				p.setProductPrice(sc.nextInt());
				
				System.out.println("Product successfully updated.");
				System.out.println("");
			}
		}
	}
	
	public void delete(Product[] arr) {
		System.out.println("Please enter the ID of the product you would like to delete: ");
		int i=sc.nextInt();
		
		for(int j=0;j<arr.length;j++) {
			if(arr[j].getProductId()==i) {
				arr[j]=null;
				System.out.println("Product successfully deleted.");
				System.out.println("");
			}
		}
		
	}

}
