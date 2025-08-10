package com.example.stockTracking.service.absracts;

import java.util.List;

import com.example.stockTracking.dto.DtoStockMovement;

public interface stockMovementService {

	List<DtoStockMovement> getAllStockMovements();
	
	DtoStockMovement getStockMovementById(Long id);
	
	DtoStockMovement saveDtoStockMovement(DtoStockMovement dtoStockMovement);
	
	void deleteStockMovement(Long id);
	
	
	
}
