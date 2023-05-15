package cogentreact.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import cogentreact.entity.User;
import cogentreact.service.UserService;

@RestController
@CrossOrigin
public class UserController {
	@Autowired
	UserService service;

	@PostMapping("/adduser")
	public User saveEmployee(@RequestBody User user) {
		return service.saveUser(user);
	}

	@GetMapping("/getallusers")
	public List<User> getAllUsers() {
		return service.getUserList();
	}
	
	@DeleteMapping("/deleteuser/{id}")
	public void deleteUser(@PathVariable("id") int id) {
		User user= service.getById(id);
		service.delete(user);
	}
	
	@PutMapping("/update")
	public User updateUser(@RequestBody User user) {
		return service.update(user);
	}
}
