package com.xworkz.app.dto;

import lombok.Data;

@Data
public class EducationDto {
	
	private int id;
	private String schoolName;
	private String schoolLocation;
	private int noOfStudents;
	private Integer noOfTeachers;
	private Integer noOfClasses;
	private String syllabusType;
	private Integer noOfSubjects;
	private String principalName;
	private Boolean isSchoolBusFacilityAvailable;

}
