package cogentbatch65.HelloWorld;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("config.xml");
		Student g=(Student)ctx.getBean("student");
		System.out.println(g);
		
		

	}

}
