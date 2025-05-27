package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Model.Inventory;

@Repository
public interface InventoryRepository extends JpaRepository <Inventory ,Long> {


}