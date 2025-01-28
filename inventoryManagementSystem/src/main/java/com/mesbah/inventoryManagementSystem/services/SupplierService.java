package com.mesbah.inventoryManagementSystem.services;


import com.mesbah.inventoryManagementSystem.dtos.Response;
import com.mesbah.inventoryManagementSystem.dtos.SupplierDTO;

public interface SupplierService {

    Response addSupplier(SupplierDTO supplierDTO);

    Response updateSupplier(Long id, SupplierDTO supplierDTO);

    Response getAllSupplier();

    Response getSupplierById(Long id);

    Response deleteSupplier(Long id);

}
