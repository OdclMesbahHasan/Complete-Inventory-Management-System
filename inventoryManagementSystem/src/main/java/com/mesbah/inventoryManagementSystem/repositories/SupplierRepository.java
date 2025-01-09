package com.mesbah.inventoryManagementSystem.repositories;

import com.mesbah.inventoryManagementSystem.models.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SupplierRepository extends JpaRepository<Supplier, Long> {
}
