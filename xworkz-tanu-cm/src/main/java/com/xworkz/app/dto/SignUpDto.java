package com.xworkz.app.dto;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class SignUpDto {
	
	private int id;
	
	@Size(min=3, max=20, message="UserId cannot be less than 3 and greater than 20")
	private String userId;
	
	@Size(min=3, max=20, message="Email cannot be less than 3 and greater than 20")
	private String email;
	
	@Max(value = 10 , message="Moblie Number must contain 10 digits")
	@Min(value = 10,  message="Moblie Number must contain 10 digits")
	private Long mobileNumber;
	
	@Size(min=3, max=12, message="Password cannot be less than 3 and greater than 12")
	private String password;
	
	@Size(min=3, max=12, message="confirmPassword cannot be less than 3 and greater than 12")
	private String confirmPassword;
	
	@Size(min=3, max=15, message="acceptAgreement cannot be less than 3 and greater than 15")
	private String acceptAgreement;

}
