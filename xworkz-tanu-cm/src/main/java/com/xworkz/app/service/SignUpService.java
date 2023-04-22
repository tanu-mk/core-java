package com.xworkz.app.service;

import java.util.List;
import java.util.Set;

import javax.validation.ConstraintViolation;

import com.xworkz.app.dto.SignUpDto;
import com.xworkz.app.entity.TechnologyEntity;


public interface SignUpService {

	Set<ConstraintViolation<SignUpDto>> validateAndSave(SignUpDto dto);
	
	default SignUpDto userSignIn(String userId, String password) {
		return null;
	}
	
	boolean sendMail(String email); //for sending email
	
	default Long findByUser(String user) {
		return null;
	}
	
	default Long findByEmail(String email) {
		return null;
	}

	
	default Long findByMobile(Long mobile) {
		 return null;
	 }
	
	
	default SignUpDto resetPassword(String email) {
		return null;
	}
	
	default SignUpDto updatePassword(String userId, String password, String confirmPassword) {
		return null;
	}	
	
	boolean sendMail(String email, String text);

	default SignUpDto updateProfile(String userId, String email, Long mobileNumber, String imagePath) {
		return null;
	}
	
	

	default SignUpDto addTechnology(String userId, TechnologyEntity entity) {
		return null;
	}
	
	default List<TechnologyEntity> viewTechnology(String userId){
		return null;
	}
	
	

}



