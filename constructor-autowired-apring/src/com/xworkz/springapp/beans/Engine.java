package com.xworkz.springapp.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Engine {
	
	private String name;
	private String type;
	@Autowired
	private int number;
	@Autowired
	private double version;
	private String company;
	private int strokes;
	
	
	public Engine(@Qualifier("engineName")String name, @Qualifier("engineType")String type, @Qualifier("engineCompany")String company) {
		super();
		this.name = name;
		this.type = type;
		this.company = company;
	}


	@Override
	public String toString() {
		return "Engine [name=" + name + ", type=" + type + ", number=" + number + ", version=" + version + ", company="
				+ company + ", strokes=" + strokes + "]";
	}


	public int getStrokes() {
		return strokes;
	}

	@Autowired
	public void setStrokes(int strokes) {
		this.strokes = strokes;
	}
	
	

}
