package cogent.infotech.com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cogent.infotech.com.entity.Item;
import cogent.infotech.com.service.ItemService;

@RestController
@RequestMapping("/api")
public class ItemController {
	
	@Autowired
	ItemService its;

	@PostMapping("/items")
	public Item add(@RequestBody Item item) {
		return its.save(item);
	}
}
