package com.xworkz.app.dto;

import lombok.Data;

@Data
public class ChatDto {
	
	private Integer id;
	private String shopGstin;
	private String shopName;
	private String shopQwnerName;
	private String shopLocation;
	private Integer streetNo;
	private String chatName;
	private Double price;
	private Boolean isBeveragesAvailable;
	private Boolean isServerAvailable;
	private Integer noOfVarities;
	
	

}
