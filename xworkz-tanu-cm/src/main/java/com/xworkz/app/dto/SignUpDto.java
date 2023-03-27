package com.xworkz.app.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class SignUpDto {
	
	private Integer id;
	private String userId;
	private String email;
	private Integer mobileNumber;
	private String password;
	private String confirmPassword;
	private String acceptAgreement;

}
