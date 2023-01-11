package com.xworkz.springapp.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Software {
	
	@Autowired
	@Qualifier("name")
	private String name;
	@Autowired
	private double version;
	@Autowired
	@Qualifier("developer")
	private String developer;
	@Autowired
	@Qualifier("date")
	private String date;
	@Autowired
	private boolean isFree;
	
	
	@Override
	public String toString() {
		return "Software [name=" + name + ", version=" + version + ", developer=" + developer + ", date=" + date
				+ ", isFree=" + isFree + "]";
	}
	
	
	
	

}
