package cogentbatch65innerbean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ApplicationContext ctx=new ClassPathXmlApplicationContext("cogentbatch65innerbean/config.xml");
		Employee employee1=(Employee)ctx.getBean("employee");
		//System.out.println(employee1.hashCode());
		
		Employee employee2=(Employee)ctx.getBean("employee");
		//System.out.println(employee2.hashCode());
		
		University u=(University)ctx.getBean("university");
		System.out.println(u);
	}

}
