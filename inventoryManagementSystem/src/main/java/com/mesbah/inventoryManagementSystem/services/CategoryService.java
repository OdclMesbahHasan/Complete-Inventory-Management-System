package com.mesbah.inventoryManagementSystem.services;


import com.mesbah.inventoryManagementSystem.dtos.CategoryDTO;
import com.mesbah.inventoryManagementSystem.dtos.Response;

public interface CategoryService {

    Response createCategory(CategoryDTO categoryDTO);

    Response getAllCategories();

    Response getCategoryById(Long id);

    Response updateCategory(Long id, CategoryDTO categoryDTO);

    Response deleteCategory(Long id);
}
