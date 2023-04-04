package com.xworkz.app.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class SignUpDto {
	
	private int id;
	
	@Size(min=3, max=20, message="UserId cannot be less than 3 and greater than 20")
	private String userId;
	
	@Size(min=3, max=50, message="Email cannot be less than 3 and greater than 20")
	private String email;
	
	@NotNull
	private Long mobileNumber;
	
	@NotBlank
	@Size(min=3, max=12, message="Password cannot be less than 3 and greater than 12")
	private String password;
	
	@NotBlank
	@NotNull
	private String confirmPassword;
	
	@NotBlank
	private String acceptAgreement;

}
