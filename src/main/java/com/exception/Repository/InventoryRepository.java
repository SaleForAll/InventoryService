package com.exception.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.exception.Model.Inventory;

@Repository
public interface InventoryRepository extends JpaRepository <Inventory ,Long> {
	
}
