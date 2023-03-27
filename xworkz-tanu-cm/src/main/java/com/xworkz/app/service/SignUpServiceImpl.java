package com.xworkz.app.service;

import java.time.LocalDateTime;
import java.util.Collections;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.app.dto.SignUpDto;
import com.xworkz.app.entity.SignUpEntity;
import com.xworkz.app.repository.SignUpRepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class SignUpServiceImpl implements SignUpService  {
	
	@Autowired
	private SignUpRepository signUpRepository;
	
	
	public SignUpServiceImpl() {
		log.info("Created " + this.getClass().getSimpleName());
	}
	
	

	@Override
	public Set<ConstraintViolation<SignUpDto>> validateAndSave(SignUpDto dto) {
		
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator validator = factory.getValidator();
		Set<ConstraintViolation<SignUpDto>> violations = validator.validate(dto);

		if (violations != null && !violations.isEmpty()) {
			System.err.println("Violation in dto " + dto);
			return violations;
		} else {
			log.info("Violation is not There in dto, can Save the data");

			SignUpEntity entity = new SignUpEntity();
			entity.setId(dto.getId());
			entity.setUserId(dto.getUserId());
			entity.setEmail(dto.getEmail());
			entity.setMobileNumber(dto.getMobileNumber());
			entity.setPassword(dto.getPassword());
			entity.setCreatedBy(dto.getUserId());
			entity.setCreatedDate(LocalDateTime.now());
				
			boolean saved = this.signUpRepository.save(entity);
			log.info("Entity Data is Saved " + saved);

			return Collections.emptySet();
			
		}

	}
	
}
