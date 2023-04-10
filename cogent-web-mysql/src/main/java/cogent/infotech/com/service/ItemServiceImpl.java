package cogent.infotech.com.service;

import org.springframework.stereotype.Service;

import cogent.infotech.com.entity.Item;
import cogent.infotech.com.repository.ItemRepository;

@Service
public class ItemServiceImpl implements ItemService{
	
	ItemRepository itemRepo;

	public Item save(Item item) {
		return itemRepo.save(item);
	}
}
