package cogentreact;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import cogentreact.entity.User;
import cogentreact.repository.UserRepository;

@SpringBootApplication
public class ReactApplication implements WebMvcConfigurer{

	public static void main(String[] args) {
		SpringApplication.run(ReactApplication.class, args);
	}
	
	@Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**").allowedMethods("GET", "POST", "PUT", "PATCH", "DELETE", "OPTIONS")
                .allowedHeaders("*")
                .allowedOrigins("http://localhost:3000","http://localhost:8080");
        WebMvcConfigurer.super.addCorsMappings(registry);
    }
	
	@Autowired
	UserRepository repo;
	
	@PostConstruct
    public void initUsers() {
        List<User> users = Stream.of(
                new User("Gyanendra", "Singh", "gystec@email.com"),
                new User("fName1", "lName1", "1name@email.com"),
                new User("fName2", "lName2", "2name@email.com")
        ).collect(Collectors.toList());
        repo.saveAll(users);
	}

}
