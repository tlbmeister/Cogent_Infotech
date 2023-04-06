package cogentbatch65annotations;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("cogentbatch65annotations")

public class Main {
	
	public static void main(String[] args) {

	ConfigurableApplicationContext ctx=new AnnotationConfigApplicationContext(Main.class);
	ChatService chatService=ctx.getBean(ChatService.class);
	
	chatService.chat();
	ctx.close();
	}
}
