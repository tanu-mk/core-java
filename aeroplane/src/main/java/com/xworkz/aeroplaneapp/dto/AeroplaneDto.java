package com.xworkz.aeroplaneapp.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class AeroplaneDto {
	
	
	@Size(min = 3, max = 20, message = "companyName cannot be less than 3 and greater than 20")
	private String companyName;
	
	@Size(min = 3, max = 20, message = "planeName cannot be less than 3 and greater than 20")
	private String planeName;
	
	
	private Double cost;
	
	@NotBlank(message = "type should be selected")
	private String type;
	
	@NotBlank(message = "country should be selected")
	private String country;

}
