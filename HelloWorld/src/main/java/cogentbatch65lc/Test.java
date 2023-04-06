package cogentbatch65lc;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("cogentbatch65lc/config.xml");
		Patient p=(Patient)ctx.getBean("patient");
		System.out.println(p);
		ctx.registerShutdownHook();
	}

}
