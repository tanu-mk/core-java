package com.xworkz.app.repository;

import java.time.LocalTime;

import com.xworkz.app.entity.SignUpEntity;

public interface SignUpRepository {
	
	boolean save(SignUpEntity entity);
	
	
	default Long findCountByEmailAndUserAndMobile(String email, String userId, long mobile) {
		return null;
	}
	
	//for lock count
	 boolean onLock(String userId, int count);
	
	
	
//  for sign in	
//	default SignUpEntity findByIdAndPassword(String userId, String Password) {
//		return null;
//	}
	
	default SignUpEntity userSignIn(String userId) {
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
	
	//reset password
	default SignUpEntity resetPassword(String email) {
		return null;
	}
	
	boolean update(SignUpEntity entity);
	
	boolean updatePassword(String userId, String password, Boolean resetPassword, LocalTime passwordChangedTime);	
	
	
}
 