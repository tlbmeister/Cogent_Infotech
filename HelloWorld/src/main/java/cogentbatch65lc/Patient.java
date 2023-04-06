package cogentbatch65lc;

//import org.springframework.beans.factory.DisposableBean;
//import org.springframework.beans.factory.InitializingBean;
import javax.annotation.*;

//public class Patient implements InitializingBean, DisposableBean{
public class Patient{
	
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public String toString() {
		return "Patient[id="+id+"]";
	}
	
//	public void init() {
//		System.out.println("Here write the code to recover the resources. ");
//	}
	
//	public void destroy() {
//		System.out.println("Inside destroy method");
//	}
//
//	@Override
//	public void afterPropertiesSet() throws Exception {
//
//		System.out.println("Inside after property set method");
//	}
	@PostConstruct
	public void init() {
		System.out.println("hi");
	}
	@PreDestroy
	public void destroy() {
		System.out.println("bye");
	}
	
	

}
