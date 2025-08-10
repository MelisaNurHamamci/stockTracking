package com.example.stockTracking.core;

import org.modelmapper.ModelMapper;

public interface MapperService {

	public ModelMapper forRequest();

	public ModelMapper forResponse();
}
