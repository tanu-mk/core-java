package com.xworkz.spring.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Actor {

	private String name;
	private String language;
	private Integer age;
	
	public Actor(@Value("Darshan")String name, @Value("Kannada")String language, @Value("47")Integer age) {
		
		this.name = name;
		this.language = language;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	
	public String getLanguage() {
		return language;
	}
	
	public Integer getAge() {
		return age;
	}
	
	
	
	
	

}
