package com.xworkz.eggapp.service;

import com.xworkz.eggapp.dto.EggDto;

public interface EggService {
	
	boolean validateAndSave(EggDto dto);

}
