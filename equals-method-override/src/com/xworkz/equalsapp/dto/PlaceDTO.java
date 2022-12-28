package com.xworkz.equalsapp.dto;

public class PlaceDTO {
	
	private String name;
	private String place;
	private String type;
	
	public PlaceDTO() {
		
	}
	
	public PlaceDTO(String name, String place, String type) {
		super();
		this.name = name;
		this.place = place;
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "PlaceDTO [name=" + this.getName() + ", place=" + this.getPlace() + ", type=" + this.getType() + "]";
	}
	
	
	@Override
	public boolean equals(Object anything) {
		System.out.println("Inside equals method");
			if(anything != null) {
				if(anything instanceof PlaceDTO) {
					PlaceDTO dto = (PlaceDTO)anything;
						if(dto.place.equals(this.place)) {
							System.out.println("The entered String is Matched");
							return true;
						}
				}
			}
			return false;
	}
	
	
	
	

}
