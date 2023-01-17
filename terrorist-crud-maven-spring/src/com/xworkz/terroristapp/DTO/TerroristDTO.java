package com.xworkz.terroristapp.DTO;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class TerroristDTO extends AbstarctAuditDTO {

	
	@NonNull
	@NotNull
	@Size(min = 3, max = 70, message = "Name is Invalid")
	private String name;
	@NotNull
	@Min(value = 1, message = "Should be greator than 1 or less than 100")
	@Max(value = 100, message = "Should be greator than 1 or less than 100")
	private Integer age;
	@NotNull
	@Size(min = 3, max = 300, message = "Country is Invalid")
	private String country;
	@NotNull
	@Size(min = 3, max = 300, message = "Specialist is Invalid")
	private String specialist;
	@NotNull
	@Size(min = 3, max = 300, message = "Organisation is Invalid")
	private String organisation;
	private boolean isAlive;
	private boolean prison;
	
	
	
	
	
	
	
}
