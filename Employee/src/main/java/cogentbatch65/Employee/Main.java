package cogentbatch65.Employee;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {

	public static void main(String[] args) {

		
		AbstractApplicationContext aatx=new ClassPathXmlApplicationContext("config.xml");
		Employee p=(Employee)aatx.getBean("employee");
		System.out.println("Employee id: "+p.getId());
		aatx.registerShutdownHook();
	}

}
