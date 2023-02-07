package com.xworkz.app.dto;

import lombok.Data;

@Data
public class BeverageDto {
	
	private Integer id;
	private String name;
	private Double price;
	private Double quantity;
	private String barCodeNo;
	private Boolean isPreservativesAdded;
	private String flavour;
	private String color;

}
