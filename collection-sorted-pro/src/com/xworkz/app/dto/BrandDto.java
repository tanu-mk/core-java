package com.xworkz.app.dto;

import java.io.Serializable;

public class BrandDto implements Comparable<BrandDto>, Serializable{

	private String name;
	private String dressCode;
	private Double price;

	public BrandDto() {
		// TODO Auto-generated constructor stub
	}

	public BrandDto(String name, String dressCode, Double price) {
		super();
		this.name = name;
		this.dressCode = dressCode;
		this.price = price;
	}

	@Override
	public String toString() {
		return "BrandDto [name=" + name + ", dressCode=" + dressCode + ", price=" + price + "]";
	}

    @Override
    public int hashCode() {

	return 01;
    }

    @Override
    public boolean equals(Object obj) {
    	if(obj!=null) {
    		if(obj instanceof BrandDto) {
    			BrandDto dto=(BrandDto) obj;
    			if(dto.name.equals(this.name) && dto.price.equals(this.price)) {
    				return true;
    			}
    		}
    	}
    	return false;
    }

    @Override
    public int compareTo(BrandDto o) {
    	return o.name.compareTo(this.name);//descending order
      //return o.name.compareTo(this.name);gives ascending order	
    }

	public String getName() {
		return name;
	}

	public String getDressCode() {
		return dressCode;
	}

	public Double getPrice() {
		return price;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setDressCode(String dressCode) {
		this.dressCode = dressCode;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	
	

}
