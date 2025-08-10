package com.example.stockTracking.dto;

import com.example.stockTracking.model.Product;

import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class DtoStockMovement {
	
	@ManyToOne
	private Product product;
}
