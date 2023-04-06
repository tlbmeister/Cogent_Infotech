package springjdbcemployeetest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cogentbatch65springjdbcemployeedao.EmployeeDAO;
import cogentbatch65springjdbcemployeedtc.Employee;

public class Test {

	public static void main(String[] args) {

		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("springjdbcemployeetest/config.xml");
		
		EmployeeDAO dao=(EmployeeDAO)ctx.getBean("employeeDAO");
		Employee emp=new Employee();
		emp.setId(1001);
		emp.setFirstName("Gyanendra");
		emp.setLastName("Singh");
		
		int i=dao.create(emp);
		if(i>0) {
			System.out.println("Object saved.");
		}
	}

}
