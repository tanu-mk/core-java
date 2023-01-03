package com.xworkz.streamapp.dto;

public class ApplicationDTO {
	
	public String name;
	public Double version;
	public boolean isFree;
	public String developedBy;
	public String price;
	
	
	public ApplicationDTO() {
		
	}
	
	public ApplicationDTO(String name, Double version, boolean isFree, String developedBy, String price) {
		super();
		this.name = name;
		this.version = version;
		this.isFree = isFree;
		this.developedBy = developedBy;
		this.price = price;
	}
	

	@Override
	public int hashCode() {
		
		return 10;
	}


	@Override
	public String toString() {
		return "ApplicationDTO [name=" + name + ", version=" + version + ", isFree=" + isFree + ", developedBy="
				+ developedBy + ", price=" + price + "]";
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("Inside equals method");
			if(obj != null) {
				if(obj instanceof ApplicationDTO) {
					ApplicationDTO dto = (ApplicationDTO)obj;
						if(dto.name.equals(this.name) ) {
							return true;
						}
				}
			}
		
		return false;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getVersion() {
		return version;
	}

	public void setVersion(Double version) {
		this.version = version;
	}

	public boolean isFree() {
		return isFree;
	}

	public void setFree(boolean isFree) {
		this.isFree = isFree;
	}

	public String getDevelopedBy() {
		return developedBy;
	}

	public void setDevelopedBy(String developedBy) {
		this.developedBy = developedBy;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}


	
	

}
