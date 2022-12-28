package com.xworkz.equalsapp.dto;

public class AirportDTO {
	
	private String name;
	private String place;
	private Integer noOfFlights;
	
	public AirportDTO() {
		
	}
	
	public AirportDTO(String name, String place, Integer noOfFlights) {
		super();
		this.name = name;
		this.place = place;
		this.noOfFlights = noOfFlights;
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

	public Integer getNoOfFlights() {
		return noOfFlights;
	}

	public void setNoOfFlights(Integer noOfFlights) {
		this.noOfFlights = noOfFlights;
	}
	
	@Override
	public String toString() {
		
		return "AirportDTO - [ name - " + this.getName() + " , place - " + this.getPlace() + ", noOfFlights - " + this.getNoOfFlights() + "]";
	}
	
	
	@Override
	public boolean equals(Object ref) {
	System.out.println("Inside equals method");
		if(ref != null) {
			if( ref instanceof AirportDTO) {
				AirportDTO dto = (AirportDTO)ref;
					if(dto.name.equals(this.name)) {
						System.out.println("The name is Matched");
						return true;
					}
			}
		}
		return false;
	}
	

}
