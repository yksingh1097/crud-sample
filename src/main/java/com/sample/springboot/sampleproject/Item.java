package com.sample.springboot.sampleproject;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@Entity
//@Table(name = "items")
@Table(name = "items2")
public class Item {
	
//	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
//	@Column(name = "id")
//	private String itemId;
//	@JsonInclude(Include.NON_NULL)
//	@Column(name = "ibrand")
//	private String itemBrand;
//	@JsonInclude(Include.NON_NULL)
//	@Column(name = "iName")
//	private String itemName;
//	@JsonInclude(Include.NON_NULL)
//	@Column(name = "imfgDate")
//	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
//	private Date itemMfgDate;
//	@JsonInclude(Include.NON_NULL)
//	@Column(name = "iprice")
//	private String itemPrice;
	
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID")
	private Integer itemId;
	@JsonInclude(Include.NON_NULL)
	@Column(name = "iBRAND")
	private String itemBrand;
	@JsonInclude(Include.NON_NULL)
	@Column(name = "iNAME")
	private String itemName;
	@JsonInclude(Include.NON_NULL)
	@Column(name = "iPRICE")
	private String itemPrice;
	
	public Item() {
	}

	public Item(int itemId, String itemBrand, String itemName, Date itemMfgDate, String itemPrice) {
		super();
		this.itemId = itemId;
		this.itemBrand = itemBrand;
		this.itemName = itemName;
//		this.itemMfgDate = itemMfgDate;
		this.itemPrice = itemPrice;
	}
	
	public String getItemBrand() {
		return itemBrand;
	}
	public void setItemBrand(String itemBrand) {
		this.itemBrand = itemBrand;
	}
	public Integer getItemId() {
		return itemId;
	}
	public void setItemId(int itemId) {
		this.itemId = itemId;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
//	public Date getItemMfgDate() {
//		return itemMfgDate;
//	}
//	public void setItemMfgDate(Date itemMfgDate) {
//		this.itemMfgDate = itemMfgDate;
//	}
	public String getItemPrice() {
		return itemPrice;
	}
	public void setItemPrice(String itemPrice) {
		this.itemPrice = itemPrice;
	}
	
	

}
