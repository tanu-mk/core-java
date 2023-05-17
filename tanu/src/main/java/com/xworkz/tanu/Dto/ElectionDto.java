package com.xworkz.tanu.Dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ElectionDto {
	
	private int id;
	private String partyName;
	private String constituency;
	private int noOfVoters;

}
