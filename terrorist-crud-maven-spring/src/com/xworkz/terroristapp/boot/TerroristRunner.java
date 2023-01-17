package com.xworkz.terroristapp.boot;

import com.xworkz.terroristapp.DTO.TerroristDTO;
import com.xworkz.terroristapp.service.TerroristService;
import com.xworkz.terroristapp.service.TerroristServiceImpl;

public class TerroristRunner {
	
	public static void main(String[] args) {
		
		TerroristDTO terroristdto = new TerroristDTO();
		terroristdto.setName("Rahul");
		terroristdto.setAge(27);
		terroristdto.setCountry("Pakistan");
		terroristdto.setSpecialist("firing");
		terroristdto.setOrganisation("Pak");
		terroristdto.setAlive(false);
		terroristdto.setPrison(false);
		
		System.out.println(terroristdto);
		
		
		TerroristService service = new TerroristServiceImpl();
		service.validateAndSave(terroristdto);
		
		
		
	}

}
