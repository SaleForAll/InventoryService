package com.example.demo.Model;

<<<<<<< HEAD
import jakarta.persistence.Column;
=======
>>>>>>> d04117694797f4435faff63dcaa2f44a333b3dd2
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Inventory {
<<<<<<< HEAD
	@Column(name = "inventory_Id") 
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long InventoryID;
	@Column(name = "product_Id") 
	private Integer ProductID;
=======
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long InventoryID;
	private Long ProductID;
>>>>>>> d04117694797f4435faff63dcaa2f44a333b3dd2
	private Integer AvailableStock;
	private Integer ReservedStock;
	public Long getInventoryID() {
		return InventoryID;
	}
	public void setInventoryID(Long inventoryID) {
		InventoryID = inventoryID;
	}
<<<<<<< HEAD
	public Integer getProductID() {
		return ProductID;
	}
	public void setProductID(Integer productID) {
=======
	public Long getProductID() {
		return ProductID;
	}
	public void setProductID(Long productID) {
>>>>>>> d04117694797f4435faff63dcaa2f44a333b3dd2
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
