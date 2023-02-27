package com.xworkz.chatsapp.service;

import java.util.Collections;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.chatsapp.dto.ChatsDto;
import com.xworkz.chatsapp.entity.ChatsEntity;
import com.xworkz.chatsapp.repository.ChatsRepository;

@Service
public class ChatsServiceImpl implements ChatsService {
	
	
	@Autowired
	private ChatsRepository chatsRepository;
	
	
	public ChatsServiceImpl() {
		System.out.println("Created " + this.getClass().getSimpleName());
	}
	

	@Override
	public Set<ConstraintViolation<ChatsDto>> validateAndSave(ChatsDto dto) {
		System.out.println("Running validateAndSave in service.....");
		
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator validator = factory.getValidator();
		Set<ConstraintViolation<ChatsDto>> violations =  validator.validate(dto);
		
		if(violations != null && !violations.isEmpty()) {
			System.out.println("Violations as errors");
			return violations;
		}
		
		else {
			
			System.out.println("Violations is not there in dto, can save the data");
		
			ChatsEntity entity = new ChatsEntity();
			entity.setShopName(dto.getShopName());
			entity.setGstin(dto.getGstin());
			entity.setType(dto.getType());
			entity.setPrice(dto.getPrice());
			entity.setChatName(dto.getChatName());
			
			boolean saved = this.chatsRepository.save(entity);
			System.out.println(saved);
			
			return Collections.emptySet();
		}
		
		
	}
	
	@Override
	public ChatsDto findById(int id) {
		
		if(id > 0 ){
			ChatsEntity entity = this.chatsRepository.findById(id);
			
			if(entity != null) {
				System.out.println("Entity is found in service for id " + id);
				ChatsDto dto = new ChatsDto();
				dto.setShopName(entity.getShopName());
				dto.setChatName(entity.getChatName());
				dto.setGstin(entity.getGstin());
				dto.setPrice(entity.getPrice());
				dto.setType(entity.getType());
				
				return dto;
			}
		}
		
		return ChatsService.super.findById(id);
	}

	
}
