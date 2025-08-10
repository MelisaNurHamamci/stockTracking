package com.example.stockTracking.controller.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.stockTracking.controller.absracts.ProductController;
import com.example.stockTracking.dto.DtoProduct;
import com.example.stockTracking.service.absracts.ProductService;
@RestController
@RequestMapping("/rest/api")
public class ProductControllerImpl implements ProductController {

	@Autowired
	private ProductService productService;
	
	@GetMapping(path = "/getProductById")
	@Override
	public DtoProduct getProductById(long id) {
		return productService.getProductById(id);
	}
	@GetMapping(path = "/getAllProducts")
	@Override
	public List<DtoProduct> getAllProducts() {
		// TODO Auto-generated method stub
		return productService.getAllProducts();
	}
	
	@PostMapping("/saveProduct")
	@Override
	public DtoProduct saveProduct(@RequestBody DtoProduct request) {
		// TODO Auto-generated method stub
		return productService.saveProduct(request);
	}
	@DeleteMapping("/deleteProduct")
	@Override
	public void deleteProduct(long id) {
		// TODO Auto-generated method stub
		
	}

	
	
}
