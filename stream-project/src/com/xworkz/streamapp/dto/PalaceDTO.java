package com.xworkz.streamapp.dto;

public class PalaceDTO {
	
	private String name;
	private String place;
	private boolean isDestroyed;
	private double entryFees;
	
	public PalaceDTO() {
		
	}

	public PalaceDTO(String name, String place, boolean isDestroyed, double entryFees) {
		super();
		this.name = name;
		this.place = place;
		this.isDestroyed = isDestroyed;
		this.entryFees = entryFees;
	}

	@Override
	public String toString() {
		return "PalaceDTO [name=" + name + ", place=" + place + ", isDestroyed=" + isDestroyed + ", entryFees="
				+ entryFees + "]";
	}

	@Override
	public int hashCode() {
		
		return 17;
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("Inside equals method");
			if(obj != null) {
				if(obj instanceof PalaceDTO) {
					PalaceDTO dto = (PalaceDTO)obj;
						if(dto.name.equals(this.name) && dto.entryFees == this.entryFees) {
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

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public boolean isDestroyed() {
		return isDestroyed;
	}

	public void setDestroyed(boolean isDestroyed) {
		this.isDestroyed = isDestroyed;
	}

	public double getEntryFees() {
		return entryFees;
	}

	public void setEntryFees(double entryFees) {
		this.entryFees = entryFees;
	}
	
	
	
	

}
