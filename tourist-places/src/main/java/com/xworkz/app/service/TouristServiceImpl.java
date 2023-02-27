package com.xworkz.app.service;

import java.util.Collections;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.app.dto.TouristPlacesDto;
import com.xworkz.app.entity.TouristEntity;
import com.xworkz.app.repository.TouristRepo;

@Service
public class TouristServiceImpl implements TouristService {
	
	@Autowired
	private TouristRepo touristRepo;
	
	
	public TouristServiceImpl() {
		System.out.println("Created " + this.getClass().getSimpleName());
	}


	@Override
	public Set<ConstraintViolation<TouristPlacesDto>> validateAndSave(TouristPlacesDto dto) {
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator validator = factory.getValidator();
		Set<ConstraintViolation<TouristPlacesDto>> violations =  validator.validate(dto);
		
		if(violations != null && !violations.isEmpty()) {
			System.err.println("Violation in dto " + dto);
			return violations;
		}
		else {
			System.out.println("Violation is not There in dto, can Save the data");
			
			TouristEntity entity = new TouristEntity();
			entity.setDestination(dto.getDestination());
			entity.setKilometers(dto.getKilometers());
			entity.setState(dto.getState());
			entity.setFamousFor(dto.getFamousFor());
			entity.setBestTimeToVisit(dto.getBestTimeToVisit());
			
			boolean saved = this.touristRepo.save(entity);
			System.out.println("Entity Data is Saved " + saved);
			
			
			return Collections.emptySet();
		}
	
	}
	
	
	@Override
	public TouristPlacesDto findById(int id) {
		
		if(id > 0 ){
			TouristEntity entity = this.touristRepo.findById(id);
			
			if(entity != null) {
				System.out.println("Entity is found in service for id " + id);
				TouristPlacesDto dto = new TouristPlacesDto();
				dto.setDestination(entity.getDestination());
				dto.setKilometers(entity.getKilometers());
				dto.setState(entity.getState());
				dto.setFamousFor(entity.getFamousFor());
				dto.setBestTimeToVisit(entity.getBestTimeToVisit());
				
				return dto;
			}
		}
		
		return TouristService.super.findById(id);
	}
}
		
