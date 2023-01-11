package com.xworkz.springapp.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Rubber {
	
	@Autowired
	@Qualifier("rubberName")
	private String rubberName;
	@Autowired
	@Qualifier("rubberType")
	private String rubberType;
	@Autowired
	private double rubberPrice;
	@Autowired
	@Qualifier("rubberColor")
	private String rubberColor;
	@Autowired
	@Qualifier("rubberShape")
	private String rubberShape;
	@Autowired
	private boolean isAvailable;
	@Autowired
	@Qualifier("rubberSize")
	private String rubberSize;
	
	
	@Override
	public String toString() {
		return "Rubber [name=" + rubberName + ", type=" + rubberType + ", price=" + rubberPrice + ", color=" + rubberColor + ", shape=" + rubberShape
				+ ", isStolen=" + isAvailable + ", size=" + rubberSize + "]";
	}

}
