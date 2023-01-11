package com.xworkz.springapp.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OrderedItem {
	
	@Autowired
	private String itemName;
	@Autowired
	private double itemPrice;
	@Autowired
	private int itemId;
	@Autowired
	private char itemSeries;
	@Autowired
	private boolean isSuccessfull;
	@Autowired
	private long contactNo;
	@Autowired
	private float streeetNo;
	@Autowired
	private byte houseNo;
	
	
	@Override
	public String toString() {
		return "OrderedItem [itemName=" + itemName + ", itemPrice=" + itemPrice + ", itemId=" + itemId + ", itemSeries="
				+ itemSeries + ", isSuccessful=" + isSuccessfull + ", contactNo=" + contactNo + ", streeetNo="
				+ streeetNo + ", houseNo=" + houseNo + "]";
	}
	

}
