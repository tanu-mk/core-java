package com.xworkz.excel.service;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.xworkz.excel.entity.Tutorial;
import com.xworkz.excel.helper.ExcelToDatabase;
import com.xworkz.excel.repository.TutorialRepo;

@Service
public class ExcelService {
	
	@Autowired
	  TutorialRepo repository;

	  public void save(MultipartFile file) {
	    try {
	      List<Tutorial> tutorials = ExcelToDatabase.excelToTutorials(file.getInputStream());
	      repository.saveAll(tutorials);
	    } catch (IOException e) {
	      throw new RuntimeException("fail to store excel data: " + e.getMessage());
	    }
	  }

	  public List<Tutorial> getAllTutorials() {
	    return repository.findAll();
	  }
	}


