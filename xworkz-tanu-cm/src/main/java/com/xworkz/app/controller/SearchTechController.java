package com.xworkz.app.controller;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.xworkz.app.entity.TechnologyEntity;
import com.xworkz.app.service.SearchTechService;

import lombok.extern.slf4j.Slf4j;

@Controller
@RequestMapping("/")
@Slf4j
public class SearchTechController {
	
	@Autowired
	private SearchTechService searchTechService;
	
	
	@GetMapping("/techName")
	public String searchByTechName(Model model, @RequestParam String technologyName,@RequestParam String languange, @RequestParam String  version, @RequestParam String owner, @RequestParam String supportFrom, @RequestParam String supportTo, @RequestParam String licenseNo, @RequestParam String openSource, @RequestParam String osType, @RequestParam String userId) {
		List<TechnologyEntity> list = this.searchTechService.searchByTechName(technologyName, languange, version, owner, supportFrom, supportTo, licenseNo, openSource, osType,  userId);
		model.addAttribute("viewTech", list);
		return "ViewTechnology";
	}
	
	
	
	
	
	
	
	

}
