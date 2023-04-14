package cogent;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import cogent.entity.User;
import cogent.repository.UserRepository;

@SpringBootApplication
public class SpringbootassessmentApplication {
	
	@Autowired
	UserRepository repository;
	 @PostConstruct
	    public void initUsers() {
	        List<User> users = Stream.of(
	                new User(101, "Musa", "pwd", "admin"),
	                new User(102, "user1", "pwd", "user")
	        ).collect(Collectors.toList());
	        repository.saveAll(users);
	    }

	public static void main(String[] args) {
		SpringApplication.run(SpringbootassessmentApplication.class, args);
	}

}
