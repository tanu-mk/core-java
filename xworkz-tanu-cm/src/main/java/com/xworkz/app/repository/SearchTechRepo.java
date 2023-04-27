package com.xworkz.app.repository;

import java.util.List;

import com.xworkz.app.entity.TechnologyEntity;

public interface SearchTechRepo  {
	
	
	default List<TechnologyEntity> searchByTechName(String technologyName,String languange, String  version, String owner, String supportFrom, String supportTo, String licenseNo, String openSource, String osType, String userId) {
		return null;
	}
	
	default TechnologyEntity getByUser(String userId){
		return null;
	}
	
	

}
