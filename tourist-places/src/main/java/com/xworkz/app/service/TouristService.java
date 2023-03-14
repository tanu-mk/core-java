package com.xworkz.app.service;

import java.util.Collections;
import java.util.List;
import java.util.Set;

import javax.validation.ConstraintViolation;

import com.xworkz.app.dto.TouristPlacesDto;

public interface TouristService {
	
	Set<ConstraintViolation<TouristPlacesDto>> validateAndSave(TouristPlacesDto dto);
	
	Set<ConstraintViolation<TouristPlacesDto>> validateAndUpdate(TouristPlacesDto dto);
	
	boolean delete(int id);
	
	default TouristPlacesDto findById(int id) {
		return null;
	}
	
	default List<TouristPlacesDto> findByDestination(String destination){
		return Collections.emptyList();
	}

	
	default List<TouristPlacesDto> findByAll(){
		return Collections.emptyList();
	}
	
	
	default List<TouristPlacesDto> findByDestinationAndState(String destination, String state){
		return Collections.emptyList();
	}
	
	
	

}
