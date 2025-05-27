package com.example.demo.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Inventory {
	@Column(name = "inventory_Id") 
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long InventoryID;
	@Column(name = "product_Id") 
	private Integer ProductID;
	private Integer AvailableStock;
	private Integer ReservedStock;
	public Long getInventoryID() {
		return InventoryID;
	}
	public void setInventoryID(Long inventoryID) {
		InventoryID = inventoryID;
	}
	public Integer getProductID() {
		return ProductID;
	}
	public void setProductID(Integer productID) {
		ProductID = productID;
	}
	public Integer getAvailableStock() {
		return AvailableStock;
	}
	public void setAvailableStock(Integer availableStock) {
		AvailableStock = availableStock;
	}
	public Integer getReservedStock() {
		return ReservedStock;
	}
	public void setReservedStock(Integer reservedStock) {
		ReservedStock = reservedStock;
	}
	
	

}
