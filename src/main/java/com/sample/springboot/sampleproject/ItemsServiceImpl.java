package com.sample.springboot.sampleproject;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.handler.UserRoleAuthorizationInterceptor;

import com.sample.springboot.sampleproject.Item;

@Service
public class ItemsServiceImpl implements ItemsService{
	
	@Autowired
	ItemsRepository itemsRepository;
	
	@Override
	public void addItems(Item itemsInfo) {
		
		itemsRepository.addItemsToDB(itemsInfo.getItemName(),itemsInfo.getItemPrice(),itemsInfo.getItemBrand());
		
//		itemsRepository.save(itemsInfo);
//		return itemsRepository.findById(itemsInfo.getItemName());
	}
	
	//private List<Item> items= Arrays.asList(new Item("101","someName6","10006","someBrand6"));
	
	@Override
	public List<Item> getItems(int id) {
		List<Item> items=itemsRepository.getItemsFromDb(id);
		return items;
//		
//		return itemsRepository.findOne(id);
//		return null;
	}
	
	@Override
	public List<Item> getAllItems() {
		return itemsRepository.getAllItemsFromDb();
//		return itemsRepository.findAll();
	}
	
	@Override
	public void deleteItems(int id) {
		itemsRepository.deleteItemFromDb(id);
//		itemsRepository.delete((itemsRepository.getItemsFromDb(id)).get(0));
	}
	
	@Override
	public void updateItems(Item itemsInfo, int id) {
		itemsRepository.updateItemsInDb(itemsInfo.getItemName(),itemsInfo.getItemPrice(),itemsInfo.getItemBrand(),id);
		
	}

}
