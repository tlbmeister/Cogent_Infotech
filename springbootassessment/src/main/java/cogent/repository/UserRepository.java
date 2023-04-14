package cogent.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import cogent.entity.User;

public interface UserRepository extends JpaRepository<User,Integer>{

	User findByUsername(String username);
}
