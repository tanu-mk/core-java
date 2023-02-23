package com.xworkz.bigbasketapp.service;

import java.util.Collections;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.bigbasketapp.dto.BigBasketDto;
import com.xworkz.bigbasketapp.entity.BigBasketEntity;
import com.xworkz.bigbasketapp.repository.BigBasketRepository;

@Service
public class BigBasketServiceImpl implements BigBasketService {
	
	
	@Autowired
	private BigBasketRepository bigBasketRepository;
	
	
	public BigBasketServiceImpl() {
		System.out.println("Running BigBasketServiceImpl");
	}

	@Override
	public Set<ConstraintViolation<BigBasketDto>> validateAndSave(BigBasketDto dto) {
		
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator validator = factory.getValidator();
		Set<ConstraintViolation<BigBasketDto>> violations =  validator.validate(dto);
		
		if(violations != null && !violations.isEmpty()) {
			System.err.println("Violation in dto " + dto);
			return violations;
		}
		else {
			System.out.println("Violation is not there is dto, can save the data");
			
			BigBasketEntity entity = new BigBasketEntity();
			entity.setFirstName(dto.getFirstName());
			entity.setLastName(dto.getLastName());
			entity.setArea(dto.getArea());
			entity.setContactNumber(dto.getContactNumber());
			entity.setEmail(dto.getEmail());
			entity.setItemList(dto.getItemList());
			entity.setPassword(dto.getPassword());
			entity.setTakeAway(dto.getTakeAway());
			
			boolean saved = this.bigBasketRepository.save(entity);
			System.out.println("Entity Data is Saved " + saved);
			
			return Collections.emptySet();
		}
		
		
		
	}
	
	
}

