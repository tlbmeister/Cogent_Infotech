package cogentbatch65check;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ApplicationContext ctx=new ClassPathXmlApplicationContext("cogentbatch65check/config.xml");
		Prescription p=(Prescription)ctx.getBean("prescription");
		System.out.println(p);
	}

}
