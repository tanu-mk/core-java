package com.xworkz.bigbasketapp.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class BigBasketDto {
	
	
	@Size(min = 3, max = 20, message = "firstName cannot be less than 3 and greater than 20")
	private String firstName;
	
	@Size(min = 3, max = 20, message = "lastName cannot be less than 3 and greater than 20")
	private String lastName;
	
	@NotBlank(message = "Area should be selected")
	private String area;
	
	//@Size(min = 3, max = 20, message ="Enter Email")
	private String email;
	
	
	private long contactNumber;
	
	@Size(min = 3, max = 20, message ="Enter Password")
	private String password;
	
	@NotBlank(message = "itemList should be selected")
	private String itemList;
	
	@NotBlank(message = "takeAway should be selected")
	private String takeAway;
	

}




		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  