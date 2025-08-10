package com.example.stockTracking.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class DtoProduct {
	
	private String name;
	
	private int quantitiy;
	
	private double price;
}
