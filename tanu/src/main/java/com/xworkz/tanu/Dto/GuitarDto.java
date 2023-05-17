package com.xworkz.tanu.Dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GuitarDto {
	
	private int id;
	private String woodType;
	private int noOfSongsPlayed;
	private int noOfStrings;

}
