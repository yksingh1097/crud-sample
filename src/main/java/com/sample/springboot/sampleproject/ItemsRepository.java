package com.sample.springboot.sampleproject;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

//@Component
public interface ItemsRepository extends /*CrudRepository<Item, String>*/JpaRepository<Item, String> {
//	@Modifying
//	@Transactional
//	@Query(value = "INSERT INTO items (name, price, brand) VALUES ((?1), (?2), (?3))", nativeQuery = true)
//	public void addItemsToDB(String name,String price,String brand);
//	
//	@Transactional
//	@Query(value =  "SELECT * FROM items WHERE id= ?1", nativeQuery = true)
//	public List<Item> getItemsFromDb(String id);
//	
//	@Transactional
//	@Query(value =  "SELECT * FROM items", nativeQuery = true)
//	public List<Item> getAllItemsFromDb();
//	
//	@Transactional
//	@Query(value =  "Delete * FROM items WHERE id= ?1", nativeQuery = true)
//	public void deleteItemFromDb(String id);
	
	
	
	
	
	@Modifying
	@Transactional
	@Query(value = "INSERT INTO items2 (iNAME, iPRICE, iBRAND) VALUES ((?1), (?2), (?3))", nativeQuery = true)
	public void addItemsToDB(String name,String price,String brand);
	
	@Transactional
	@Query(value =  "SELECT * FROM items2 WHERE id= ?1", nativeQuery = true)
	public List<Item> getItemsFromDb(int id);
	
	@Transactional
	@Query(value =  "SELECT * FROM items2", nativeQuery = true)
	public List<Item> getAllItemsFromDb();
	
	@Modifying
	@Transactional
	@Query(value =  "DELETE FROM items2 WHERE id= ?1", nativeQuery = true)
	public void deleteItemFromDb(int id);
	
	
	@Modifying
	@Transactional
	@Query(value = "UPDATE items2 SET iNAME= (?1), iPRICE= (?2), iBRAND=(?3) WHERE id= ?4", nativeQuery = true)
	public void updateItemsInDb(String name,String price,String brand, int id);
	

}
