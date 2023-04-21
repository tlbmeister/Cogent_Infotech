package cogentbatch65.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import cogentbatch65.entity.User;
import cogentbatch65.repository.UserRepository;

@Service
public class UserService{
	
	@Autowired
	UserRepository repo;

	public User save(User user) {
		return repo.save(user);
	}
	
	public List<User> getAll(){
		  return (List<User>) repo.findAll();
	  }
	
	public void delete(User user) {
		repo.delete(user);
	}
	
	 public Optional<User> get(int itemId){
		  return repo.findById(itemId);
	  }
}
