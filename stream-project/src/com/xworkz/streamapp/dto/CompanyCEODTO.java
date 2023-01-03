package com.xworkz.streamapp.dto;

public class CompanyCEODTO  {
	
	public String name;
	public String company;
	public Integer age;
	public String country;
	public String qualification;
	public boolean isMarried;
	
	public CompanyCEODTO() {
		
	}

	public CompanyCEODTO(String name, String company, Integer age, String country, String qualification,
			boolean isMarried) {
		super();
		this.name = name;
		this.company = company;
		this.age = age;
		this.country = country;
		this.qualification = qualification;
		this.isMarried = isMarried;
	}

	@Override
	public String toString() {
		return "CompanyCEODTO [name=" + name + ", company=" + company + ", age=" + age + ", country=" + country
				+ ", qualification=" + qualification + ", isMarried=" + isMarried + "]";
	}

	@Override
	public int hashCode() {
		
		return 13;
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("Inside equals method");
			if(obj != null) {
				if(obj instanceof CompanyCEODTO) {
					CompanyCEODTO dto = (CompanyCEODTO)obj;
						if(dto.name.equals(this.name)) {
							return true;
					}
				}
			}
		
		return false;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public boolean isMarried() {
		return isMarried;
	}

	public void setMarried(boolean isMarried) {
		this.isMarried = isMarried;
	}
	
	
	
	
	

}
