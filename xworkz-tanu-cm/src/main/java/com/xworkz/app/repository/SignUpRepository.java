package com.xworkz.app.repository;

import com.xworkz.app.entity.SignUpEntity;

public interface SignUpRepository {
	
	boolean save(SignUpEntity entity);
	
	
	default Long findCountByEmailAndUserAndMobile(String email, String userId, long mobile) {
		return null;
	}
	
//  for sign in	
//	default SignUpEntity findByIdAndPassword(String userId, String Password) {
//		return null;
//	}
	
	default SignUpEntity findByIdAndPassword(String userId) {
		return null;
	}
	
	
	default Long findByUser(String user) {
		return null;
	}
	
	default Long findByEmail(String email) {
		return null;
	}
	
	default Long findByMobile(Long mobile) {
		return null;
	}

	
	
	
	
}
 