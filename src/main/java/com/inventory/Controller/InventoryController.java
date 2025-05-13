package com.inventory.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.inventory.Model.Inventory;
import com.inventory.Service.InventoryService;

@RestController
@RequestMapping("/inventory")
public class InventoryController {
	@Autowired
	private final InventoryService inventoryService;

    public InventoryController(InventoryService inventoryService) {
        this.inventoryService = inventoryService;
    }

   @PostMapping("/add")
   public ResponseEntity<Inventory> addInventory(@RequestBody Inventory inventory)
   {
    return ResponseEntity.ok(inventoryService.addInventory(inventory));
   }
   @DeleteMapping("/delete/{id}")
   public ResponseEntity<String> deleteInventory(@PathVariable Long id)
   {
	   inventoryService.deleteInventory(id);
	   return ResponseEntity.ok("Inventory delete successfully..");
   }
   @PutMapping("/update/{id}")
   public ResponseEntity<Inventory> updateInventory (@PathVariable Long id,@RequestBody Inventory inventory)
   {
	   return ResponseEntity.ok(inventoryService.updateInventory(id,inventory));
   }
   @GetMapping("/all")
   public ResponseEntity<List<Inventory>>getAllInventory()
   {
	   return ResponseEntity.ok(inventoryService.getAllInventory());
   }
   @GetMapping("{id}")
   public ResponseEntity<Inventory> getInventoryById(@PathVariable Long id)
   {
	   return ResponseEntity.ok(inventoryService.getInventoryById(id));
   }
   
}
