package com.sample.springboot.sampleproject;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.sample.springboot.sampleproject.Item;
import com.sample.springboot.sampleproject.ItemsService;

import io.swagger.annotations.ApiOperation;

@RestController
//@RequestMapping(value = "", produces = MediaType.APPLICATION_JSON_VALUE)
public class ItemsController {
	
	@Autowired
	ItemsService itemsService;
	
	@ApiOperation("Get Items")
	@GetMapping("/getItems/{id}")
	@ResponseBody
	public List<Item> getItems(@PathVariable int id)
	{
		List<Item> response = itemsService.getItems(id);
		return response;
			
	}
	
	@ApiOperation("Get All Items")
	@GetMapping(value = "/getAllItems", produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public List<Item> getAllItems()
	{
		List<Item> response = itemsService.getAllItems();
		return response;
			
	}
	
	@ApiOperation("add items")
	@PostMapping(value = "/addItems", consumes = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public void addItems(@RequestBody Item itemInfo)
	{
		itemsService.addItems(itemInfo);
	
	}
	
	@ApiOperation("delete items")
	@DeleteMapping("/deleteItems/{id}")
	@ResponseBody
	public void deleteItems(@PathVariable int id)
	{
		itemsService.deleteItems(id);
	
	}
	
	
	@ApiOperation("Update item")
	@PutMapping("/updateItems/{id}")
	@ResponseBody
	public void updateItems(@RequestBody Item itemInfo,@PathVariable int id)
	{
		itemsService.updateItems(itemInfo,id);
	
	}
	
	
	@ApiOperation("return hello")
	@RequestMapping("/hi")
	@ResponseBody
	public String hi()
	{
		return "hello";
		
	}
	

}
