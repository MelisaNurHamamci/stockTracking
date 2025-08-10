package com.example.stockTracking.service.concretes;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.stockTracking.controller.concretes.ProductControllerImpl;
import com.example.stockTracking.dto.DtoProduct;
import com.example.stockTracking.dto.DtoStockMovement;
import com.example.stockTracking.model.Product;
import com.example.stockTracking.model.stockMovement;
import com.example.stockTracking.repository.stockMovementRepository;
import com.example.stockTracking.service.absracts.stockMovementService;

@Service
public class stockMovementIMPL implements stockMovementService {

	@Autowired
	private stockMovementRepository StockMovementRepository;
	
	@Autowired
	private ModelMapper modelMapper;

	@Override
	public List<DtoStockMovement> getAllStockMovements() {
		List<stockMovement> StockMovements=StockMovementRepository.findAll();
		List<DtoStockMovement> dtoStockMovements = StockMovements.stream()
			    .map(sm -> modelMapper.map(sm, DtoStockMovement.class))
			    .collect(Collectors.toList());

		return dtoStockMovements;
	}

	@Override
	public DtoStockMovement getStockMovementById(Long id) {
		Optional<stockMovement> optionalstockmovementOptional= StockMovementRepository.findById(id);
		if (optionalstockmovementOptional.isPresent()) {
			DtoStockMovement dtoStockMovement=modelMapper.map(optionalstockmovementOptional, DtoStockMovement.class);
			return dtoStockMovement;
		}
		
		
		return null;
	}

	@Override
	public DtoStockMovement saveDtoStockMovement(DtoStockMovement dtoStockMovement) {
		stockMovement StockMovement=modelMapper.map(dtoStockMovement, stockMovement.class);
		stockMovement saveStockMovement=StockMovementRepository.save(StockMovement);
		return dtoStockMovement;
	}

	@Override
	public void deleteStockMovement(Long id) {
		StockMovementRepository.deleteById(id);
		
	}
	
	
	
	
}
