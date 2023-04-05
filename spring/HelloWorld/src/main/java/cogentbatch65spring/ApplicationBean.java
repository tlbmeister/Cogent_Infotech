package cogentbatch65spring;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;

@Configuration
public class ApplicationBean {
	
	@Bean(name="person")
	public Person getPerson() {
		Person p=new Person();
		p.setId(1001);
		p.setName("Anthony");
		p.setAge(20);
		return p;
	}
	
	@Bean(name="product")
	public Product getProduct() {
		Product p=new Product();
		p.setId(4061);
		p.setName("iceberg lettuce");
		p.setPrice(2);
		return p;
	}

}
