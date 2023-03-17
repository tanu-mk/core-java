package com.xworkz.app.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.xworkz.app.dto.TouristPlacesDto;
import com.xworkz.app.entity.TouristEntity;
import com.xworkz.app.repository.TouristRepo;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class TouristServiceImpl implements TouristService {

	@Autowired
	private TouristRepo touristRepo;

	public TouristServiceImpl() {
		log.info("Created " + this.getClass().getSimpleName());
	}

	@Override
	public Set<ConstraintViolation<TouristPlacesDto>> validateAndSave(TouristPlacesDto dto) {
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator validator = factory.getValidator();
		Set<ConstraintViolation<TouristPlacesDto>> violations = validator.validate(dto);

		if (violations != null && !violations.isEmpty()) {
			System.err.println("Violation in dto " + dto);
			return violations;
		} else {
			log.info("Violation is not There in dto, can Save the data");

			TouristEntity entity = new TouristEntity();
			entity.setId(dto.getId());
			entity.setDestination(dto.getDestination());
			entity.setKilometers(dto.getKilometers());
			entity.setState(dto.getState());
			entity.setFamousFor(dto.getFamousFor());
			entity.setBestTimeToVisit(dto.getBestTimeToVisit());

			boolean saved = this.touristRepo.save(entity);
			log.info("Entity Data is Saved " + saved);

			return Collections.emptySet();
		}

	}

	@Override
	public TouristPlacesDto findById(int id) {

		if (id > 0) {
			TouristEntity entity = this.touristRepo.findById(id);

			if (entity != null) {
				log.info("Entity is found in service for id " + id);
				TouristPlacesDto dto = new TouristPlacesDto();
				dto.setId(entity.getId());
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

	
	@Override
	public List<TouristPlacesDto> findByDestination(String destination) {
		
		log.info("Running findByDestination in service Impl " + destination);
		
		if(destination != null && !destination.isEmpty()) {
			log.info("Destination data is valid");
			
			List<TouristEntity> entities = this.touristRepo.findByDestination(destination);
			
			List<TouristPlacesDto> listOfDto = new ArrayList<TouristPlacesDto>();
			
			for(TouristEntity entity : entities) {
				TouristPlacesDto dto = new TouristPlacesDto();
				dto.setId(entity.getId());
				dto.setDestination(entity.getDestination());
				dto.setKilometers(entity.getKilometers());
				dto.setFamousFor(entity.getFamousFor());
				dto.setState(entity.getState());
				dto.setBestTimeToVisit(entity.getBestTimeToVisit());
				
				listOfDto.add(dto);
			}
			log.info("Size of dtos " + listOfDto.size());
			log.info("size of entities " + entities.size());
			return listOfDto;
		}else {
			log.info("Destination data is invalid");
		}
		return TouristService.super.findByDestination(destination);
	}
	
	

	@Override
	public Set<ConstraintViolation<TouristPlacesDto>> validateAndUpdate(TouristPlacesDto dto) {

		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator validator = factory.getValidator();
		Set<ConstraintViolation<TouristPlacesDto>> violations = validator.validate(dto);

		if (violations != null && !violations.isEmpty()) {
			System.err.println("Violation in dto " + dto);
			return violations;
		} else {
			log.info("Violation is not There in dto, can Save the data");

			TouristEntity entity = new TouristEntity();
			entity.setId(dto.getId());
			entity.setDestination(dto.getDestination());
			entity.setKilometers(dto.getKilometers());
			entity.setState(dto.getState());
			entity.setFamousFor(dto.getFamousFor());
			entity.setBestTimeToVisit(dto.getBestTimeToVisit());

			boolean update = this.touristRepo.update(entity);
			log.info("Entity Data is Saved " + update);

			return Collections.emptySet();
		}

	}

	@Override
	public boolean delete(int id) {
		log.info("Running in delete by id in service");
		if(id>0) {
			this.touristRepo.delete(id);
		}
		return false;
	}
	
	
	
	@Override
	public List<TouristPlacesDto> findByAll() {
		log.info("findByAll in service...");
		
		List<TouristEntity> list = this.touristRepo.findByAll();
		List<TouristPlacesDto> dtos = new ArrayList<TouristPlacesDto>();
		if(list != null ) {
			for(TouristEntity entity : list) {
				TouristPlacesDto dto = new TouristPlacesDto();
				BeanUtils.copyProperties(entity, dto);
				dtos.add(dto);
			}
			log.info("size of dtos " + dtos.size());
			log.info("Size of entities " + list.size());
			return dtos;
		}
		else {
			log.info("No data found in db");
			return Collections.emptyList();
		}	
	}
	
	
	@Override
	public List<TouristPlacesDto> findByDestinationAndState(String destination, String state) {
		
		log.info("findByDestinationAndState in service...");
		
		List<TouristEntity> list = this.touristRepo.findByDestinationAndState(destination, state);
		
		List<TouristPlacesDto> dtos = new ArrayList<TouristPlacesDto>();
		if(list != null  || state != null  ) {
			for(TouristEntity entity : list) {
				TouristPlacesDto dto = new TouristPlacesDto();
				BeanUtils.copyProperties(entity, dto);
				dtos.add(dto);
			}
			log.info("size of dtos " + dtos.size());
			log.info("Size of entities " + list.size());
			return dtos;
		}
		else {
			log.info("No data found in db");
			return Collections.emptyList();
		}	
		
		
	}
}




     
