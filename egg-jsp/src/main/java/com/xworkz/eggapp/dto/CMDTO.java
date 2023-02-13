package com.xworkz.eggapp.dto;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class CMDTO {
	
	
	@NotNull(message = "CM Name cannot be null or blank")
	@Size(min = 3, max = 20, message = "CM Name should be greater than 3 and less than 20")
	private String name;
	
	@NotBlank(message = "Party cannot be Null")
	private String party;
	
	@NotBlank(message = "State cannot be Null")
	private String state;
	
	@NotNull(message = "Tenure cannot be Null")
	@Min(value = 1, message = "Tenure cannot be less than zero")
	private Integer tenure;
	
	@NotBlank(message = "Portfolio cannot be Null")
	private String portfolio;

}
