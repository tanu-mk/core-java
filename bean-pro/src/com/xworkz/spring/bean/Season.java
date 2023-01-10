package com.xworkz.spring.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Season {
	
	private String name;
	private String startingMonth;
	private Integer duration;
	
	
	@Value("Winter")
	public void setName(String name) {
		this.name = name;
	}
	
	@Value("October")
	public void setStartingMonth(String startingMonth) {
		this.startingMonth = startingMonth;
	}
	
	@Value("3")
	public void setDuration(Integer duration) {
		this.duration = duration;
	}
	
	public String getName() {
		return name;
	}
	
	public String getStartingMonth() {
		return startingMonth;
	}
	
	public Integer getDuration() {
		return duration;
	}

}
