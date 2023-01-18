package com.xworkz.soldierapp.boot;

import com.xworkz.soldierapp.dto.SoldierDto;
import com.xworkz.soldierapp.repository.SoldierRepo;
import com.xworkz.soldierapp.repository.SoldierRepoImpl;
import com.xworkz.soldierapp.service.SoldierService;
import com.xworkz.soldierapp.service.SoldierServiceImpl;

public class SoldierRunner {
	
	public static void main(String[] args) {
		
		SoldierDto soldierdto = new SoldierDto(1, "Kiran", "Topper", "Indian Army", "India");
		//System.out.println(soldierdto);
		
		SoldierServiceImpl service = new SoldierServiceImpl();
		
		SoldierRepo repo = new SoldierRepoImpl();
		service.setSoldierRepo(repo);
		service.validateAndSave(soldierdto);
		
		
	}

}
