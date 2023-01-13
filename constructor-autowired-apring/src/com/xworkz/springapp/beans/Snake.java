package com.xworkz.springapp.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Snake {
	
	private String name;
	@Autowired
	private double length;
	@Autowired
	@Qualifier("snakeColor")
	private String color;
	private String type;
	private boolean isPoisonous;
	
	
	public Snake(@Qualifier("snakeName")String name, @Qualifier("snakeType")String type, boolean isPoisonous) {
		super();
		this.name = name;
		this.type = type;
		this.isPoisonous = isPoisonous;
	}


	@Override
	public String toString() {
		return "Snake [name=" + name + ", length=" + length + ", color=" + color + ", type=" + type + ", isPoisonous="
				+ isPoisonous + "]";
	}
	
	

}
