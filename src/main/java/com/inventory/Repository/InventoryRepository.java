package com.inventory.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.inventory.Model.Inventory;
@Repository
public interface InventoryRepository extends JpaRepository<Inventory ,Long>{

}
