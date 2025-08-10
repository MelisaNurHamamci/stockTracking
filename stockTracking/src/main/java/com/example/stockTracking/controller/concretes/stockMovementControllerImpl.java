package com.example.stockTracking.controller.concretes;

import java.util.List;
import com.example.stockTracking.repository.stockMovementRepository;
import com.example.stockTracking.service.absracts.stockMovementService;
import com.example.stockTracking.service.concretes.stockMovementIMPL;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

import com.example.stockTracking.controller.absracts.stockMovementController;
import com.example.stockTracking.dto.DtoStockMovement;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
@RequestMapping("/rest/api")
public class stockMovementControllerImpl implements stockMovementController  {

	@Autowired
	private stockMovementService stockMovementService;

	@GetMapping(path = "/getAllStockMovements")
	@Override
	public List<DtoStockMovement> getAllStockMovements() {
		// TODO Auto-generated method stub
		return stockMovementService.getAllStockMovements();
	}
	
	@GetMapping(path = "/getStockMovementById")
	@Override
	public DtoStockMovement getStockMovementById(Long id) {
		// TODO Auto-generated method stub
		return stockMovementService.getStockMovementById(id);
	}
	
	@PostMapping(path = "/saveDtoMovement")
	@Override
	public DtoStockMovement saveDtoStockMovement(@RequestBody DtoStockMovement request) {
		// TODO Auto-generated method stub
		return stockMovementService.saveDtoStockMovement(request);
	}
	
	@DeleteMapping(path = "/deleteStockMovement")
	@Override
	public void deleteStockMovement(Long id) {
		// TODO Auto-generated method stub
		
	}

}
