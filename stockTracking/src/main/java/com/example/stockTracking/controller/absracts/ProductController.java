package com.example.stockTracking.controller.absracts;

import java.util.List;

import com.example.stockTracking.dto.DtoProduct;

public interface ProductController {

	public DtoProduct getProductById(long id);
	
	public 	List<DtoProduct> getAllProducts();
	
	public DtoProduct saveProduct(DtoProduct dtoProduct);
	
	void deleteProduct(long id);

}
