package com.xworkz.chatsapp.service;

import java.util.Set;

import javax.validation.ConstraintViolation;

import com.xworkz.chatsapp.dto.ChatsDto;

public interface ChatsService {
	
	Set<ConstraintViolation<ChatsDto>> validateAndSave(ChatsDto dto);
	
	default ChatsDto findById(int id) {
		return null;
	}


}
