package com.xworkz.equalsapp.dto;

public class CalendarDTO {
	
	private String name;
	private Integer noOfDays;
	private Integer noOfHolidays;
	
	public CalendarDTO() {
		
	}

	public CalendarDTO(String name, Integer noOfDays, Integer noOfHolidays) {
		super();
		this.name = name;
		this.noOfDays = noOfDays;
		this.noOfHolidays = noOfHolidays;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getNoOfDays() {
		return noOfDays;
	}

	public void setNoOfDays(Integer noOfDays) {
		this.noOfDays = noOfDays;
	}

	public Integer getNoOfHolidays() {
		return noOfHolidays;
	}

	public void setNoOfHolidays(Integer noOfHolidays) {
		this.noOfHolidays = noOfHolidays;
	}

	@Override
	public String toString() {
		return "CalendarDTO [name=" + this.getName() + ", noOfDays=" + this.getNoOfDays() + ", noOfHolidays=" + this.getNoOfHolidays() + "]";
	}
	
	@Override
	public boolean equals(Object reference) {
		System.out.println("Inside equals method");
			if(reference != null) {
				if(reference instanceof CalendarDTO) {
					CalendarDTO ref = (CalendarDTO)reference;
					if(ref.noOfDays.equals(this.noOfDays)) {
						System.out.println("Entered data Matched");
						return true;
					}
				}
			}
		return false;
	}
	
	
	
	

}
