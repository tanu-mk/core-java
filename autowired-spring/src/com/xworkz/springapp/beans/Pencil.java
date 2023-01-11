package com.xworkz.springapp.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Pencil {
	
	@Autowired
	@Qualifier("pencilName")
	private String pencilName;
	@Autowired
	@Qualifier("pencilType")
	private String pencilType;
	@Autowired
	private double pencilPrice;
	@Autowired
	@Qualifier("pencilColor")
	private String pencilColor;
	@Autowired
	@Qualifier("isPencilSharp")
	private boolean isPencilSharp;
	@Autowired
	@Qualifier("isStolen")
	private boolean isStolen;
	
	
	@Override
	public String toString() {
		return "Pencil [pencilName=" + pencilName + ", pencilType=" + pencilType + ", pencilPrice=" + pencilPrice
				+ ", pencilColor=" + pencilColor + ", isSharpOrBlunt=" + isPencilSharp + ", isStolen=" + isStolen
				+ "]";
	}
	
	

}
