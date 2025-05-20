package com.example.demo.Controller;

import com.example.demo.Model.Inventory;
import com.example.demo.Service.InventoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/inventory")
public class InventoryController {
    @Autowired
    private final InventoryService inventoryService;

    public InventoryController(InventoryService inventoryService){
        this.inventoryService=inventoryService;
    }
    @PostMapping("/add")
        public ResponseEntity<Inventory> addInventory(@RequestBody Inventory inventory)
        {
            return ResponseEntity.ok(inventoryService.addInventory(inventory));
        }
        @GetMapping("/all")
    public ResponseEntity<List<Inventory>> getAllInventory()
        {
            return ResponseEntity.ok(inventoryService.getAllInventory());
        }
        @GetMapping("/{ProductID}")
    public ResponseEntity<Inventory>getInventoryById(@PathVariable Long ProductID)
        {
            return ResponseEntity.ok(inventoryService.getInventoryById(ProductID));
        }
        @PutMapping("/update/{ProductID}")
    public ResponseEntity<Inventory>updateInventory(@PathVariable Long ProductID ,@RequestBody Inventory inventory)
        {
            return ResponseEntity.ok(inventoryService.updateInventory(ProductID,inventory));
        }
        @DeleteMapping("/delete/{ProductID}")

            public ResponseEntity<String>deleteInventory(@PathVariable Long ProductID) {
        return ResponseEntity.ok("Delete the product Successfully");

        }

}
