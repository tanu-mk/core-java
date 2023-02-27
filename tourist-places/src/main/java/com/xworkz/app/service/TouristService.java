package com.xworkz.app.service;

import java.util.Set;

import javax.validation.ConstraintViolation;

import com.xworkz.app.dto.TouristPlacesDto;

public interface TouristService {
	
	Set<ConstraintViolation<TouristPlacesDto>> validateAndSave(TouristPlacesDto dto);
	
	default TouristPlacesDto findById(int id) {
		return null;
	}


}
