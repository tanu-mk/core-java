package com.xworkz.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.app.entity.SignUpEntity;
import com.xworkz.app.entity.TechnologyEntity;
import com.xworkz.app.repository.SearchTechRepo;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class SearchTechServiceImpl implements SearchTechService  {
	
	@Autowired
	private SearchTechRepo searchTechRepo;
	
	
	@Override
	public List<TechnologyEntity> searchByTechName(String technologyName, String languange, String  version, String owner, String supportFrom, String supportTo, String licenseNo, String openSource, String osType, String userId) {
		TechnologyEntity entity = this.searchTechRepo.getByUser(userId);
		List<TechnologyEntity> list = searchTechRepo.searchByTechName(technologyName, languange, version, owner, supportFrom, supportTo, licenseNo, openSource, osType, userId);
		log.info("Search List" + list);
		return list;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
