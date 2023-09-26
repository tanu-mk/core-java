package com.xworkz.makekitapp;

public class MakeupKitDTO {
	
	private String name;
	private String brand;
	private Integer price;
	
	public MakeupKitDTO() {
		
	}
	
	public MakeupKitDTO(String name, String brand, Integer price) {
		
		this.name = name;
		this.brand = brand;
		this.price = price;
	}
	
	@Override
	public String toString() {
		
		return "MakeupKit [ name = " + this.name + " , brand = " + this.brand + " , price = " + this.price + " ]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}
	
	

}
