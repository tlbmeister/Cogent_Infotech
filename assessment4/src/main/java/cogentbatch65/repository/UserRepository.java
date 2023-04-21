package cogentbatch65.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import cogentbatch65.entity.User;

@Repository
public interface UserRepository extends CrudRepository<User,Integer>{

}
