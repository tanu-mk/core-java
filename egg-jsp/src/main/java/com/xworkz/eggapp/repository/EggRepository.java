package com.xworkz.eggapp.repository;

import com.xworkz.eggapp.dto.EggDto;

public interface EggRepository {
	
	boolean save(EggDto dto);

}
