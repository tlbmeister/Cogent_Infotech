package cogentreact.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cogentreact.entity.User;
import cogentreact.repository.UserRepository;

@Service
public class UserService {
	@Autowired
	UserRepository repo;
	
	public User saveUser(User user) {
		return repo.save(user);
	}
	
	public List<User> getUserList(){
		return (List<User>) repo.findAll();
	}
	
	@SuppressWarnings("deprecation")
	public User getById(int id) {
		return repo.getById(id);
	}
	
	public void delete(User user) {
		repo.delete(user);
	}
	
	public User update(User user) {
		return repo.save(user);
	}
}
