package com.xworkz.bigbasketapp.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;

import com.xworkz.bigbasketapp.dto.BigBasketDto;

public interface BigBasketService {
	
	Set<ConstraintViolation<BigBasketDto>> validateAndSave(BigBasketDto dto);

}
