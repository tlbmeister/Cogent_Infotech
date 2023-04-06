package cogentbatch65qualifier;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {

		ApplicationContext context=new ClassPathXmlApplicationContext("cogentbatch65qualifier/config.xml");
		Employee e=(Employee)context.getBean("employee");
		System.out.println(e);
		Employee e2=(Employee)context.getBean("employee");
		
	}

}
