package cogentbatch65autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CustomerMain {

	public static void main(String[] args) {

		
		ApplicationContext context=new ClassPathXmlApplicationContext("cogentbatch65autowiring/config.xml");
		Customer cust=(Customer)context.getBean("customer");
		Reservation res=cust.getReservation();
		
		System.out.println("**********Reservation Details*************");
		System.out.println("Reservation id: "+res.getId());
		System.out.println("Reservation time: "+res.getTime());
	}

}
