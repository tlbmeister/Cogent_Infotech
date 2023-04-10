package cogent.infotech.com.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import cogent.infotech.com.entity.Item;

@Repository
public interface ItemRepository extends CrudRepository<Item,Integer>{

}
