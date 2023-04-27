package com.xworkz.app.service;

import java.util.List;

import com.xworkz.app.entity.TechnologyEntity;

public interface SearchTechService {
	
	default List<TechnologyEntity> searchByTechName(String technologyName, String languange, String  version, String owner, String supportFrom, String supportTo, String licenseNo, String openSource, String osType, String userId) {
		return null;
	}

}
