package com.xworkz.soldierapp.dto;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class SoldierDto {
	
	
	@Min(value = 0, message = "Id should be greater than 0 less than 10")
	@Max(value = 10, message = "Id should be greater than 0 less than 10")
	private Integer id;
	@NotNull
	@NotBlank
	@Size(min = 3, max = 150, message = "Name Not Valid")
	private String name;
	@NotNull
	@NotBlank
	@Size(min = 3, max = 150, message = "Rank Not Valid")
	private String rank;
	@NotNull
	@NotBlank
	@Size(min = 3, max = 150, message = "Batallian Not Valid")
	private String batallian;
	@NotNull
	@NotBlank
	@Size(min = 3, max = 150, message = "Country Not Valid")
	private String country;
	
	
	
	
	
	

}
