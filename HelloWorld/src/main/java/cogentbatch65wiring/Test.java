package cogentbatch65wiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		
		ApplicationContext context=new ClassPathXmlApplicationContext("cogentbatch65wiring/config.xml");
		Person p=(Person)context.getBean("person");
		Car car=p.getCar();
		Address add=p.getAddress();
		System.out.println("*********Address**********");
		System.out.println("House number: "+add.getHouseNo());
		System.out.println("Street: "+add.getStreet());
		System.out.println("City: "+add.getCity());
		
		System.out.println("**********Car***********");
		System.out.println("Car model: "+car.getModel());
		System.out.println("Car price: "+car.getPrice());
	}

}
