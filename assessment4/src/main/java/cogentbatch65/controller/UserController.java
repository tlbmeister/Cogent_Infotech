package cogentbatch65.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import cogentbatch65.entity.User;
import cogentbatch65.service.UserService;

@CrossOrigin(origins="http://localhost:4200")
@RestController
@RequestMapping("api/")
public class UserController {

	@Autowired
	UserService uss;
	
	@GetMapping("/users")
	public List<User> getUsers(){
		List<User> items = uss.getAll();
		return items;	}
	
	@DeleteMapping("/users")
	public void delete(@RequestParam(value="id") Integer id) {
		Optional<User> i = uss.get(id);
		uss.delete(i.get());
		
	}
	
	@PostMapping("/items")
	public User add(@RequestBody User user) {
		return uss.save(user);
	}
	
	@PutMapping("/items")
	public User edit(@RequestBody User user) {
		return uss.save(user);
	}
}