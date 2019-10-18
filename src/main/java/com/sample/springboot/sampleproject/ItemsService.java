package com.sample.springboot.sampleproject;

import java.util.List;

import org.springframework.stereotype.Service;

import com.sample.springboot.sampleproject.Item;

@Service
public interface ItemsService {
	
	void addItems(Item itemsInfo);
	
	List<Item> getItems(int id);
	
	List<Item> getAllItems();
	
	void deleteItems(int id);
	
	void updateItems(Item itemsInfo, int id);
	

}
