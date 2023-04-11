package cogent.infotech.onetomanyrelationq2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import cogent.infotech.onetomanyrelationq2.entity.Course;
import cogent.infotech.onetomanyrelationq2.entity.Student;
import cogent.infotech.onetomanyrelationq2.repository.StudentRepository;

@SpringBootApplication
public class OneToManyRelationq2Application implements CommandLineRunner{
	
	@Autowired
	StudentRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(OneToManyRelationq2Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Student student=new Student("John");
		Course c1=new Course("java", 20);
		Course c2=new Course("cpp", 30);
		Course c3=new Course("spring", 10);
		
		student.getCourses().add(c1);
		student.getCourses().add(c2);
		student.getCourses().add(c3);
		repository.save(student);
	}

}
