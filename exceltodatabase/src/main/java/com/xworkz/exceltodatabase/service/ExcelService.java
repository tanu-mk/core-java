package com.xworkz.exceltodatabase.service;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.xworkz.exceltodatabase.entity.PersonalInfo;
import com.xworkz.exceltodatabase.helper.ExcelToDatabase;
import com.xworkz.exceltodatabase.repository.PersonalInfoRepo;

@Service
public class ExcelService {

	@Autowired
	PersonalInfoRepo repo;
	
	public void save(MultipartFile mFile) throws IOException {
		
		List<PersonalInfo> info = ExcelToDatabase.excelToDatabase(mFile.getInputStream());
		repo.saveAll(info);
		
	}
	
	public List<PersonalInfo> getAllPersonalInfo(){
		return repo.findAll();
		
	}
	
	
	
}
