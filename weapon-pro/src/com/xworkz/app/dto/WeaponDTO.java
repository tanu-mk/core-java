package com.xworkz.app.dto;

import java.io.Serializable;

import com.xworkz.app.constant.Type;

public class WeaponDTO implements Serializable, Comparable<WeaponDTO>{
	
	private String name;
	private String madeBy;
	private Integer madeOn;
	private Double price;
	private  Type type;
	
	public WeaponDTO() {
		super();

	}

	public WeaponDTO(String name, String madeBy, Integer madeOn, Double price, Type type) {
		super();
		this.name = name;
		this.madeBy = madeBy;
		this.madeOn = madeOn;
		this.price = price;
		this.type = type;
	}

	@Override
	public String toString() {
		return "WeaponDTO [name=" + name + ", madeBy=" + madeBy + ", madeOn=" + madeOn + ", price=" + price + ", type="
				+ type + "]";
	}

	@Override
	public int hashCode() {
		
		return 17;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj != null) {
			if(obj instanceof WeaponDTO) {
				WeaponDTO dto = (WeaponDTO)obj;
					if(dto.name.equals(this.name)) {
						return true;
				}
			}
		}
		return false;
	}
	
	
	
	
	
	public int compareTo(WeaponDTO obj) {
		
		return obj.name.compareTo(this.name);
	}
	
	
	
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMadeBy() {
		return madeBy;
	}

	public void setMadeBy(String madeBy) {
		this.madeBy = madeBy;
	}

	public Integer getMadeOn() {
		return madeOn;
	}

	public void setMadeOn(Integer madeOn) {
		this.madeOn = madeOn;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}
	
	 
	

}
