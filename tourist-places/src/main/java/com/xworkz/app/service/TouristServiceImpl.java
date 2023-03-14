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
		Set<ConstraintViolation<TouristPlacesDto>> violations = validator.validate(dto);

		if (violations != null && !violations.isEmpty()) {
			System.err.println("Violation in dto " + dto);
			return violations;
		} else {
			System.out.println("Violation is not There in dto, can Save the data");

			TouristEntity entity = new TouristEntity();
			entity.setId(dto.getId());
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

		if (id > 0) {
			TouristEntity entity = this.touristRepo.findById(id);

			if (entity != null) {
				System.out.println("Entity is found in service for id " + id);
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
		
		System.out.println("Running findByDestination in service Impl " + destination);
		
		if(destination != null && !destination.isEmpty()) {
			System.out.println("Destination data is valid");
			
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
			System.out.println("Size of dtos " + listOfDto.size());
			System.out.println("size of entities " + entities.size());
			return listOfDto;
		}else {
			System.out.println("Destination data is invalid");
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
			System.out.println("Violation is not There in dto, can Save the data");

			TouristEntity entity = new TouristEntity();
			entity.setId(dto.getId());
			entity.setDestination(dto.getDestination());
			entity.setKilometers(dto.getKilometers());
			entity.setState(dto.getState());
			entity.setFamousFor(dto.getFamousFor());
			entity.setBestTimeToVisit(dto.getBestTimeToVisit());

			boolean update = this.touristRepo.update(entity);
			System.out.println("Entity Data is Saved " + update);

			return Collections.emptySet();
		}

	}

	@Override
	public boolean delete(int id) {
		System.out.println("Running in delete by id in service");
		if(id>0) {
			this.touristRepo.delete(id);
		}
		return false;
	}
	
	
	
	@Override
	public List<TouristPlacesDto> findByAll() {
		System.out.println("findByAll in service...");
		
		List<TouristEntity> list = this.touristRepo.findByAll();
		List<TouristPlacesDto> dtos = new ArrayList<TouristPlacesDto>();
		if(list != null && list.isEmpty()) {
			for(TouristEntity entity : list) {
				TouristPlacesDto dto = new TouristPlacesDto();
				BeanUtils.copyProperties(entity, dto);
				dtos.add(dto);
			}
			System.out.println("size of dtos " + dtos.size());
			System.out.println("Size of entities " + list.size());
			return dtos;
		}
		else {
			System.out.println("No data found in db");
			return Collections.emptyList();
		}	
	}
	
	
	@Override
	public List<TouristPlacesDto> findByDestinationAndState(String destination, String state) {
		
		System.out.println("findByDestinationAndState in service...");
		
		List<TouristEntity> list = this.touristRepo.findByDestinationAndState(destination, state);
		
		List<TouristPlacesDto> dtos = new ArrayList<TouristPlacesDto>();
		if(list != null && list.isEmpty() || state != null && state.isEmpty() ) {
			for(TouristEntity entity : list) {
				TouristPlacesDto dto = new TouristPlacesDto();
				BeanUtils.copyProperties(entity, dto);
				dtos.add(dto);
			}
			System.out.println("size of dtos " + dtos.size());
			System.out.println("Size of entities " + list.size());
			return dtos;
		}
		else {
			System.out.println("No data found in db");
			return Collections.emptyList();
		}	
		
		
	}
}




     
