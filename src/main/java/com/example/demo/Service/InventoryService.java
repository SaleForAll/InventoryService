package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.Inventory;
import com.example.demo.Repository.InventoryRepository;

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
     public Inventory updateInventory(Long ProductId,Inventory inventoryDetails)
     {
         Inventory inventory=inventoryRepository.findById(ProductId)
                 .orElseThrow(()->new RuntimeException("ProductID not found"));
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
     public Inventory getInventoryById(Long ProductID)
     {
         return inventoryRepository.findById(ProductID)
                 .orElseThrow(()->new RuntimeException("ProductId not found"));
     }
}