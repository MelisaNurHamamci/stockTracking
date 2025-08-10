package com.example.stockTracking.service.concretes;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.PrimitiveIterator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.hibernate.query.NativeQuery.ReturnableResultNode;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.example.stockTracking.dto.DtoProduct;
import com.example.stockTracking.model.Product;
import com.example.stockTracking.repository.ProductRepository;
import com.example.stockTracking.service.absracts.ProductService;

import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Service
public class ProductServiceIMPL implements ProductService {


	@Autowired
	private ModelMapper modelMapper;
	
	@Autowired
	private ProductRepository productRepository;
	
	@Override
	public List<DtoProduct> getAllProducts() {
		List<Product> products= productRepository.findAll();
		List<DtoProduct> dtos = products.stream().map(product -> modelMapper.map(product, DtoProduct.class)).collect(Collectors.toList());

		return dtos;
	}
	@Override
	public DtoProduct getProductById(Long id) {
		Optional<Product> optionalProduct = productRepository.findById(id);
		if (optionalProduct.isEmpty()) {
			return null;
			
		}
		else {
			DtoProduct dtoProduct= modelMapper.map(optionalProduct , DtoProduct.class);
			return dtoProduct;
		}
	}
	@Override
	public DtoProduct saveProduct(DtoProduct dtoProduct) {
		Product product=modelMapper.map(dtoProduct, Product.class);		
		Product savedProduct = productRepository.save(product);
		DtoProduct saveDtoProduct= modelMapper.map(savedProduct, DtoProduct.class);

		return saveDtoProduct;
	}
	@Override
	public void deleteProduct(Long id) {
		productRepository.getById(id);	
		
		
	}
	
}

  






