package com.xworkz.aeroplaneapp.service;

import java.util.Collections; 
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.aeroplaneapp.dto.AeroplaneDto;
import com.xworkz.aeroplaneapp.entity.AeroplaneEntity;
import com.xworkz.aeroplaneapp.repository.AeroplaneRepository;


@Service
public class AeroplaneServiceImpl implements AeroplaneService {
	
	@Autowired
	private AeroplaneRepository aeroplaneRepository; 
	
	
	public AeroplaneServiceImpl() {
		System.out.println("Created " + this.getClass().getSimpleName());
	}
	
	
	
	@Override
	public Set<ConstraintViolation<AeroplaneDto>> validateAndSave(AeroplaneDto dto) {
		System.out.println("Running validateAndSave.....");
		
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		 Validator validator = factory.getValidator();
		Set<ConstraintViolation<AeroplaneDto>> violations = validator.validate(dto);
		
		if(violations != null && !violations.isEmpty()) {
			System.err.println("Violations in dto....." + dto);
			return violations;
		}
		else {
			System.out.println("Violation is not there in dto, can save the data.....");
			
			AeroplaneEntity entity = new AeroplaneEntity();
			entity.setCompanyName(dto.getCompanyName());
			entity.setPlaneName(dto.getPlaneName());
			entity.setType(dto.getType());
			entity.setCost(dto.getCost());
			entity.setCountry(dto.getCountry());
			
			boolean saved = this.aeroplaneRepository.save(entity);
			System.out.println(saved);
			
			return Collections.emptySet();
			
		}
		
	}
	
	
	@Override
	public AeroplaneDto findById(int id) {
		
		if(id > 0 ){
			AeroplaneEntity entity = this.aeroplaneRepository.findById(id);
			
			if(entity != null) {
				System.out.println("Entity is found in service for id " + id);
				AeroplaneDto dto = new AeroplaneDto();
				dto.setCompanyName(entity.getCompanyName());
				dto.setPlaneName(entity.getPlaneName());
				dto.setType(entity.getType());
				dto.setCost(entity.getCost());
				dto.setCountry(entity.getCountry());
				
				return dto;
			}
		}
		
		return AeroplaneService.super.findById(id);
	}

}
