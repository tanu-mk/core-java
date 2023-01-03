package com.xworkz.streamapp.dto;

public class DaughterDTO {
	
	public String name;
	public Long contactNo;
	public Integer age;
	public boolean isAlive;
	
	public DaughterDTO() {
		
	}

	public DaughterDTO(String name, Long contactNo, Integer age, boolean isAlive) {
		super();
		this.name = name;
		this.contactNo = contactNo;
		this.age = age;
		this.isAlive = isAlive;
	}

	@Override
	public String toString() {
		return "DaughterDTO [name=" + name + ", contactNo=" + contactNo + ", age=" + age + ", isAlive=" + isAlive + "]";
	}

	@Override
	public int hashCode() {
		
		return 30;
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("Inside equals method");
			if(obj != null) {
				if(obj instanceof DaughterDTO) {
					DaughterDTO dto = (DaughterDTO)obj;
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

	public Long getContactNo() {
		return contactNo;
	}

	public void setContactNo(Long contactNo) {
		this.contactNo = contactNo;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public boolean isAlive() {
		return isAlive;
	}

	public void setAlive(boolean isAlive) {
		this.isAlive = isAlive;
	}



}
