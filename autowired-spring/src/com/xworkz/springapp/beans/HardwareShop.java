package com.xworkz.springapp.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class HardwareShop {
	
	@Autowired
	@Qualifier("id")
	private Integer id;
	@Autowired
	@Qualifier("shopName")
	private String shopName;
	@Autowired
	@Qualifier("gstNo")
	private Integer gstNo;
	@Autowired
	@Qualifier("ownerName")
	private String ownerName;
	@Autowired
	@Qualifier("address")
	private String address;
	
	
	
	@Override
	public String toString() {
		return "HardwareShop [id=" + id + ", shopName=" + shopName + ", gstNo=" + gstNo + ", ownerName=" + ownerName
				+ ", address=" + address + "]";
	}
	
	

}
