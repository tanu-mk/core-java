package com.xworkz.app.controller;

import java.util.List;
import java.util.ArrayList;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.app.dto.BeverageDto;
import com.xworkz.app.dto.ChatDto;
import com.xworkz.app.dto.EducationDto;
import com.xworkz.app.dto.FamilyDto;
import com.xworkz.app.dto.MobileDto;

@Component
@RequestMapping("/")
public class SpringController {
	
	public SpringController() {
		System.out.println("Created " + this.getClass().getSimpleName());
	}
	
	
	@GetMapping("/login")
	public String onEmail(Model model) {
		System.out.println("Running onEmail");
		model.addAttribute("email", "tanujamk1705@gmail.com");
		return "index.jsp";
		
	}
	
	
	@GetMapping("/chatting")
	public String onMobile(Model model) {
		System.out.println("Running onMobile");
		model.addAttribute("mobile", "IQ00 Z5");
		return "index.jsp";
	}
	
	
	@GetMapping("/number")
	public String onAdhaar(Model model) {
		System.out.println("Running onAdhaar");
		model.addAttribute("adhaar", "1722 0503 4848 1717");
		return "index.jsp";
	}
	
	
	@GetMapping("/vayasu")
	public String onAge(Model model) {
		System.out.println("Running onAge");
		model.addAttribute("age", "niv ankond astu");
		return "index.jsp";
	}
	
	
	@GetMapping("/birth")
	public String onDob(Model model) {
		System.out.println("Running onDob");
		model.addAttribute("dob", "04/03/2004, 8:04am");
		return "index.jsp";
	}
	
	
	@GetMapping("/salary")
	public String onSalary(Model model) {
		System.out.println("Running onSalary");
		model.addAttribute("salary", "30,000");
		return "index.jsp";
		}
	
	
	@GetMapping("/friends")
	public String onFriends(Model model) {
		System.out.println("Running onFriends");
		
		List<String> ref = new ArrayList<String>();
		ref.add("Deepa");
		ref.add("Sindhu");
		ref.add("Sugandha");
		ref.add("Chaitra Gowda");
		model.addAttribute("friend", ref);
		return "index.jsp";
	}
	
	
	@GetMapping("/places")
	public String onPlaces(Model model) {
		System.out.println("Running onPlace");
		
		List<String> str = new ArrayList<String>();
		str.add("Mysore");
		str.add("Hassan");
		str.add("Saklespur");
		str.add("Chikmagalur");
		model.addAttribute("places", str);
		return "index.jsp";
	}
	
	
	@GetMapping("/skills")
	public String onSkills(Model model) {
		System.out.println("Running onSkills");
		
		List<String> list = new ArrayList<String>();
		list.add("Core Java");
		list.add("SQL");
		list.add("HTML");
		list.add("Bootstrap");
		list.add("Java Script");
		model.addAttribute("skill", list);
		return "index.jsp";
		
	}
	
	
	@GetMapping("/education")
	public String onEducationDto(Model model) {
		System.out.println("Running onEducationDto");
		
		EducationDto dto = new EducationDto();
		dto.setId(4567);
		dto.setSchoolName("HAL");
		dto.setSchoolLocation("Marathahalli");
		dto.setNoOfStudents(80);
		dto.setNoOfTeachers(180);
		dto.setNoOfClasses(65);
		dto.setSyllabusType("ICSE");
		dto.setNoOfSubjects(12);
		dto.setPrincipalName("Rita Reddy");
		dto.setIsSchoolBusFacilityAvailable(true);
		
		model.addAttribute("data", dto);
		return "index.jsp";
	}
	
	
	@GetMapping("/family")
	public String onFamily(Model model) {
		System.out.println("Running onFamily");
		
		FamilyDto dto = new FamilyDto();
		dto.setId(1722);
		dto.setFamilyName("Das");
		dto.setFamilyType("Joint Family");
		dto.setNoOfMembers(22);
		dto.setNoOfChilderns(9);
		dto.setNoOfPeopleMarried(4);
		dto.setNoOfSeniorCitizen(8);
		dto.setIsPetAnimalAvailable(true);
		dto.setNoOfTeenagers(12);
		dto.setNoOfVehicles(7);
		
		model.addAttribute("family", dto);
		return "index.jsp";
	}
	
	
	@PostMapping("/mobile")
	public String onPhone(Model model) {
		System.out.println("Running onMobile");
		
		MobileDto dto = new MobileDto();
		dto.setId(6483);
		dto.setBrandName("IQOO Z5");
		dto.setPrice(29999);
		dto.setColor("Dark Navy Blue");
		dto.setStorageCapacity("128 GB");
	
		model.addAttribute("mobile", dto);
		return "index.jsp";
	}
	
	
	@GetMapping("/drink")
	public String onBeverage(Model model) {
		System.out.println("Running onBeverage");
		
		BeverageDto dto = new BeverageDto();
		dto.setId(8649);
		dto.setName("Coffee");
		dto.setPrice(80.0);
		dto.setQuantity(15.0);
		dto.setBarCodeNo("PST00170405");
		dto.setIsPreservativesAdded(false);
		dto.setFlavour("Aroma");
		dto.setColor("Dark Brown");
		
		model.addAttribute("drink", dto);
		return "index.jsp";
	}
	
	
	@PostMapping("/chats")
	public String onChats(Model model) {
		System.out.println("Running onChats");
		
		ChatDto dto = new ChatDto();
		dto.setId(6484);
		dto.setShopGstin("THKDSP54782");
		dto.setShopName("The Blue Streak");
		dto.setShopQwnerName("Anand");
		dto.setShopLocation("Marathahalli");
		dto.setStreetNo(7);
		dto.setChatName("Gobi Manchurrian");
		dto.setPrice(120.0);
		dto.setIsBeveragesAvailable(true);
		dto.setIsServerAvailable(false);
		dto.setNoOfVarities(48);
		
		model.addAttribute("chats", dto);
		return "index.jsp";
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
