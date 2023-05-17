package com.xworkz.tanu.Dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RallyDto {
	
	private int id;
	private String name;
	private double kilometers;
	private int noOfMembers;

}
