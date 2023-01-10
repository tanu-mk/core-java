package com.xworkz.spring.bean;

import java.util.Set;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Rocket {
	
	public Rocket() {
		
	}
	
	@Value("Jet Propelled Tube")
	private String name;
	@Value("India")
	private String country;
	@Value("1654")
	private Integer budget;
	
	public String getName() {
		return name;
	}
	
	public String getCountry() {
		return country;
	}
	
	public Integer getBudget() {
		return budget;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setCountry(String country) {
		this.country = country;
	}
	
	public void setBudget(Integer budget) {
		this.budget = budget;
	}
	

}
