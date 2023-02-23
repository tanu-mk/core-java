package com.xworkz.valentineapp.service;

import java.util.Collections;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.valentineapp.dto.ValentineDto;
import com.xworkz.valentineapp.entity.ValentineEntity;
import com.xworkz.valentineapp.repository.ValentineRepository;

@Service
public class ValentineServiceImpl implements ValentineService{
	
	@Autowired
	private ValentineRepository valentineRepository;
	
	
	public ValentineServiceImpl() {
		System.out.println("Running ValentineServiceImpl");
	}
	
	
	@Override
	public Set<ConstraintViolation<ValentineDto>> validateAndSave(ValentineDto dto) {
		
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator validator = factory.getValidator();
		Set<ConstraintViolation<ValentineDto>> violations =  validator.validate(dto);
		
		if(violations != null && !violations.isEmpty()) {
			System.err.println("Violation in dto " + dto);
			return violations;
		}
		else {
			System.out.println("Violation is not There in dto, can Save the data");
			
			ValentineEntity entity = new ValentineEntity();
			entity.setName(dto.getName());
			entity.setValentineName(dto.getValentineName());
			entity.setPlaces(dto.getPlace());
			entity.setGifts(dto.getGift());
			
			boolean saved = this.valentineRepository.save(entity);
			System.out.println("Entity Data is Saved " + saved);
			
			
			return Collections.emptySet();
		}
	
	}
	
	
	@Override
	public ValentineDto findById(int id) {
		
		if(id > 0 ){
			ValentineEntity entity = this.valentineRepository.findById(id);
			
			if(entity != null) {
				System.out.println("Entity is found in service for id " + id);
				ValentineDto dto = new ValentineDto();
				dto.setName(entity.getName());
				dto.setValentineName(entity.getValentineName());
				dto.setId(entity.getId());
				dto.setPlace(entity.getPlaces());
				dto.setGift(entity.getGifts());
				
				return dto;
			}
		}
		
		return ValentineService.super.findById(id);
	}
	

}
