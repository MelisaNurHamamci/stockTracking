package com.example.stockTracking.service.absracts;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.stockTracking.dto.DtoProduct;
import com.example.stockTracking.model.Product;

import jakarta.persistence.Id;


public interface ProductService {
	List<DtoProduct> getAllProducts();
    DtoProduct getProductById(Long id);
    DtoProduct saveProduct(DtoProduct dtoProduct);
    void deleteProduct(Long id);
}
