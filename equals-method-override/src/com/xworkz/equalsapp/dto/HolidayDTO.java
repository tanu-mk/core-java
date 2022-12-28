package com.xworkz.equalsapp.dto;

public class HolidayDTO {
	
	private String name;
	private String month;
	private Integer noOfHolidays;
	
	public HolidayDTO() {
		
	}
	
	public HolidayDTO(String name, String month, Integer noOfHolidays) {
		super();
		this.name = name;
		this.month = month;
		this.noOfHolidays = noOfHolidays;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	public Integer getNoOfHolidays() {
		return noOfHolidays;
	}

	public void setNoOfHolidays(Integer noOfHolidays) {
		this.noOfHolidays = noOfHolidays;
	}

	@Override
	public String toString() {
		return "HolidayDTO [name=" + this.getName() + ", month=" + this.getMonth() + ", noOfHolidays=" + this.getNoOfHolidays() + "]";
	}
	
	
	@Override
	public boolean equals(Object ref) {
	  System.out.println("Inside equals method");
	  	if(ref != null) {
	  		if(ref instanceof HolidayDTO) {
	  			HolidayDTO dto = (HolidayDTO)ref;
	  				if(dto.noOfHolidays.equals(this.noOfHolidays)) {
	  					System.out.println("Entered data is Matched");
	  					return true;
	  			}
	  		}
	  	}
	  
		return false;
	}
	

}
