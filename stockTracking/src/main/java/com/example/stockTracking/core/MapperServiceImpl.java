package com.example.stockTracking.core;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.modelmapper.spi.MatchingStrategy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.stockTracking.dto.DtoProduct;
@Service
public class MapperServiceImpl implements MapperService {

	@Autowired
	private ModelMapper modelMapper;
	
	public ModelMapper forRequest() {
		modelMapper.getConfiguration().setAmbiguityIgnored(true).setMatchingStrategy(MatchingStrategies.LOOSE);
		return modelMapper;
	}
		
	public ModelMapper forResponse() {
		modelMapper.getConfiguration().setAmbiguityIgnored(true).setMatchingStrategy(MatchingStrategies.STANDARD);
		return modelMapper;
	}
	
}
