package com.xworkz.tanu.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.xworkz.tanu.Dto.CrackerDto;
import com.xworkz.tanu.entity.CrackerEntity;

public interface CrackerService {
	
	boolean save(CrackerDto crackerDto);
	
	default CrackerEntity update(CrackerEntity crackerEntity) {
		return null;
	}
	
	
	void deleteById(int id);
	
	List<CrackerDto> findAll();
	
	Page<CrackerEntity> Pagination(Pageable pageable);
	
	
	

}
