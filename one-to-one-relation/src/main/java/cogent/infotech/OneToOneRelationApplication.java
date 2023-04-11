package cogent.infotech;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import cogent.infotech.entity.Employee;
import cogent.infotech.entity.Passport;
import cogent.infotech.repository.EmployeeRepository;

@SpringBootApplication
public class OneToOneRelationApplication {
	
	EmployeeRepository employeeRepository;

	public static void main(String[] args) {
		SpringApplication.run(OneToOneRelationApplication.class, args);
	}
	
	public void run() {
		Passport passport=new Passport();
		passport.setExpiry("thisdate");
		Employee employee=new Employee();
		employee.setName("ThisGuy");
		employee.setPassport(passport);
		
		employeeRepository.save(employee);
		
	}

}
