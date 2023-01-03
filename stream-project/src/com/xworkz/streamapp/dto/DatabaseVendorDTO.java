package com.xworkz.streamapp.dto;

import com.xworkz.streamapp.constant.Type;

public class DatabaseVendorDTO {
	
	public String name;
	public String developedBy;
	public String size;
	public Integer licenseCost;
	public Type type;
	
	public DatabaseVendorDTO() {
		
	}
	
	
	public DatabaseVendorDTO(String name, String developedBy, String size, Integer licenseCost, Type type) {
		super();
		this.name = name;
		this.developedBy = developedBy;
		this.size = size;
		this.licenseCost = licenseCost;
		this.type = type;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getDevelopedBy() {
		return developedBy;
	}


	public void setDevelopedBy(String developedBy) {
		this.developedBy = developedBy;
	}


	public String getSize() {
		return size;
	}


	public void setSize(String size) {
		this.size = size;
	}


	public Integer getLicenseCost() {
		return licenseCost;
	}


	public void setLicenseCost(Integer licenseCost) {
		this.licenseCost = licenseCost;
	}


	public Type getType() {
		return type;
	}


	public void setType(Type type) {
		this.type = type;
	}


	@Override
	public int hashCode() {
		
		return 24;
	}


	@Override
	public boolean equals(Object obj) {
		System.out.println("Inside equals method");
			if(obj != null) {
				if(obj instanceof DatabaseVendorDTO) {
					DatabaseVendorDTO dto = (DatabaseVendorDTO)obj;	
						if(dto.name.equals(this.name)) {
							return true;
						}
				}
			}
		return false;
	}


	@Override
	public String toString() {
		return "DatabaseVendorDTO [name=" + name + ", developedBy=" + developedBy + ", size=" + size + ", licenseCost="
				+ licenseCost + ", type=" + type + "]";
	}

}
