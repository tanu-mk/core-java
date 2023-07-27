package com.xworkz.tanu.controller;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.xworkz.tanu.Dto.CrackerDto;
import com.xworkz.tanu.entity.CrackerEntity;
import com.xworkz.tanu.service.CrackerService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping( path = "/cracker", produces = MediaType.APPLICATION_JSON_VALUE)
public class CrackerRestController {
	
	@Autowired
	private CrackerService crackerService;
	
	//private static final Logger LOGGER = LoggerFactory.getLogger(CrackerRestController.class);
	
	public CrackerRestController() {
		System.out.println("Created " + this.getClass().getSimpleName());
	}
	
	@GetMapping
	public CrackerDto onGet(CrackerDto dto) {
		System.out.println("Running onGet in CrackerRestController");
		System.out.println("creckerDto" + dto);
		log.info("Logging services started");
		log.info("please check carefully");
		log.info("Its for debugging purpose");
		CrackerDto crackerDto = new CrackerDto(1, "Rocket", "Standard", 45D);
		return crackerDto;
	}
	
	@PostMapping
	public String onPost( @RequestBody  CrackerDto dto) {
		System.out.println("Running onGet in CrackerRestController");
		System.out.println("crackerDto" + dto);
		this.crackerService.save(dto);
		return "save success";
	}

	
	@GetMapping("/list")
	public List<CrackerDto> onList(CrackerDto dto) {
		System.out.println("Running getList in CrackerRestController");
		System.out.println("CrackerDto" + dto);
		
		List<CrackerDto> list = new ArrayList<CrackerDto>();
		list.add(new CrackerDto(2, "AtomBomb", "Ashoka", 30D));
		list.add(new CrackerDto(3,"Bijili", "Lakshmi", 20D));
		
		return list;
		
	}
	
	
	@PutMapping(value= "/modify")
	public CrackerEntity onUpdate(@RequestBody CrackerEntity entity) {
		System.out.println(entity);
		return crackerService.update(entity);	
	}
	
	
	@DeleteMapping(path = "/remove")
	public void onDelete(@RequestParam(value = "id") int id) {
		this.crackerService.deleteById(id);
	}
	
	
	@GetMapping("/findAll")
	public List<CrackerDto> findAll(){
		System.out.println("Running findAll in controller...");
		return this.crackerService.findAll();
		
	}
	
	@RequestMapping(value = "/page", method=RequestMethod.GET)
	Page<CrackerEntity> list(Pageable pageable){
		Page<CrackerEntity> page = crackerService.Pagination(pageable);
		return page;
	}
	
	
	
	
}
