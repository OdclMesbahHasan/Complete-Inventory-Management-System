package com.mesbah.inventoryManagementSystem.services;

import com.mesbah.inventoryManagementSystem.dtos.ProductDTO;
import com.mesbah.inventoryManagementSystem.dtos.Response;
import org.springframework.web.multipart.MultipartFile;

public interface ProductService {
    Response saveProduct(ProductDTO productDTO, MultipartFile imageFile);

    Response updateProduct(ProductDTO productDTO, MultipartFile imageFile);

    Response getAllProducts();

    Response getProductById(Long id);

    Response deleteProduct(Long id);

    Response searchProduct(String input);
}
