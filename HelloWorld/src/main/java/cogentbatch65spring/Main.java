package cogentbatch65spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {

		ApplicationContext context=new AnnotationConfigApplicationContext(ApplicationBean.class);
		Person p=(Person)context.getBean("person");
		System.out.println("Person id is: "+p.getId());
		System.out.println("Person name is: "+p.getName());
		System.out.println("Person age is: "+p.getAge());
		System.out.println("");
		
		Product prod=(Product)context.getBean("product");
		System.out.println("Product id is: "+prod.getId());
		System.out.println("Product name is: "+prod.getName());
		System.out.println("Product price is: "+prod.getPrice());
		System.out.println("");
		
		
	}

}
