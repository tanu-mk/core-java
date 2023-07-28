package com.xworkz.exceltodatabase.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.xworkz.exceltodatabase.entity.PersonalInfo;
import com.xworkz.exceltodatabase.helper.ExcelToDatabase;
import com.xworkz.exceltodatabase.message.ResponeMessage;
import com.xworkz.exceltodatabase.service.ExcelService;

@Controller
@RequestMapping("/details")
public class ExcelController {
	
	
	@Autowired
	ExcelService service;

	
	 @PostMapping("/excel")
	public ResponseEntity<ResponeMessage> uploadFile(@RequestParam("file") MultipartFile mFile){
		
		String message = "";
		
		if(ExcelToDatabase.forExcelFormat(mFile)) {
			
		try {
			service.save(mFile);
			
			message = "uploaded the file successfully: "+ mFile.getOriginalFilename();
			return ResponseEntity.status(HttpStatus.OK).body(new ResponeMessage(message));
		}catch(Exception e) {
			message = "Could not upload the file: " + mFile.getOriginalFilename();
			return ResponseEntity.status(HttpStatus.EXPECTATION_FAILED).body(new ResponeMessage(message));
	}
}

	
	message = "Please upload an excel file!";
	return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new ResponeMessage(message));
	
}
	
	@GetMapping("/database")
	public ResponseEntity<List<PersonalInfo>> getAllPersonalInfo(){
		
		try {
		List<PersonalInfo> info = service.getAllPersonalInfo();
		
		if(info.isEmpty()) {
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		}
		
		return new ResponseEntity<>(info, HttpStatus.OK);
	}catch(Exception e) {
		return new ResponseEntity<> (null, HttpStatus.INTERNAL_SERVER_ERROR);
		
	}
}
	
	
	
	
}
	
	
