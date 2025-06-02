package com.exception.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exception.Exception.InventoryNotFoundException;
import com.exception.Model.Inventory;
import com.exception.Repository.InventoryRepository;

@Service
public class InventoryService {
    @Autowired
    private final InventoryRepository inventoryRepository;
     public InventoryService(InventoryRepository inventoryRepository)
     {
         this.inventoryRepository=inventoryRepository;
     }
     public Inventory addInventory(Inventory inventory)
     {
         return inventoryRepository.save(inventory);
     }
     public Inventory updateInventory(Long productId, Inventory inventoryDetails) {
    	    Inventory inventory = inventoryRepository.findById(productId)
    	            .orElseThrow(() -> new InventoryNotFoundException("Inventory not found for product ID: " + productId));

    	    inventory.setAvailableStock(inventoryDetails.getAvailableStock());
    	    inventory.setReservedStock(inventoryDetails.getReservedStock());
    	    inventory.setInventoryID(inventoryDetails.getInventoryID());

    	    return inventoryRepository.save(inventory);
    	}
     public void deleteInventory(Long ProductId)
     {
         inventoryRepository.deleteById(ProductId);
     }
     public List<Inventory> getAllInventory()
     {
         return inventoryRepository.findAll();
     }
     
     
     public Inventory getInventoryById(Long productId) {
    	    return inventoryRepository.findById(productId)
    	            .orElseThrow(() -> new InventoryNotFoundException("Inventory not found for product ID: " + productId));
    	}
     
    	}

