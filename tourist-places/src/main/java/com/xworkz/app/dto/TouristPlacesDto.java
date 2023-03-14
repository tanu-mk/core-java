package com.xworkz.app.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class TouristPlacesDto {
	
	private int id;
	
	@Size(min=3, max=20, message="Destination name cannot be less than 3 and greater than 20")
	private String destination;
	
	private Double kilometers;

	@NotBlank(message = "State should be selected")
	private String state;
	
	@Size(min=3, max=20, message="Famous For name cannot be less than 3 and greater than 20")
	private String famousFor;
	
	@NotBlank(message = "Best Time to Visit should be selected")
	private String bestTimeToVisit;
	
	

}
