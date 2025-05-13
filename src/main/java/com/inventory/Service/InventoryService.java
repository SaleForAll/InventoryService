package com.inventory.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inventory.Model.Inventory;
import com.inventory.Repository.InventoryRepository;

@Service
public class InventoryService {
	@Autowired
	private final InventoryRepository inventoryRepository;
	public InventoryService(InventoryRepository inventoryRepository) {
        this.inventoryRepository = inventoryRepository;
    }

    public Inventory addInventory(Inventory inventory)
    {
    	return inventoryRepository.save(inventory);
    }
    public void deleteInventory(Long id)
    {
    	inventoryRepository.deleteById(id);
    }
    public Inventory updateInventory(Long id, Inventory inventoryDetails)
    {
    	Inventory inventory =inventoryRepository.findById(id)
    			.orElseThrow(()->new RuntimeException("Inventory not found"));
    	inventory.setProductName(inventoryDetails.getProductName());
    	inventory.setQuantity(inventoryDetails.getQuantity());
    	inventory.setPrice(inventoryDetails.getPrice());
    	return inventoryRepository.save(inventory);
    }
    public List<Inventory> getAllInventory()
    {
    	return inventoryRepository.findAll();
    }
    public Inventory getInventoryById(Long id)
    {
    	return inventoryRepository.findById(id)
    			.orElseThrow(()-> new RuntimeException("Inventory not found"));
    }

}
