package com.example.stockTracking.controller.absracts;

import java.util.List;

import com.example.stockTracking.dto.DtoStockMovement;

public interface stockMovementController {

	public List<DtoStockMovement> getAllStockMovements();
	
	public DtoStockMovement getStockMovementById(Long id);
	
	public DtoStockMovement saveDtoStockMovement(DtoStockMovement dtoStockMovement);
	
	public void deleteStockMovement(Long id);
}
