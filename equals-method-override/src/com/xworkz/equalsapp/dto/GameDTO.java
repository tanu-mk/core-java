package com.xworkz.equalsapp.dto;

public class GameDTO {
	
	private String name;
	private String type;
	private Integer noOfPlayers;
	
	public GameDTO() {
		
	}
	
	public GameDTO(String name, String type, Integer noOfPlayers) {
		
		this.name = name;
		this.type = type;
		this.noOfPlayers = noOfPlayers;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Integer getNoOfPlayers() {
		return noOfPlayers;
	}

	public void setNoOfPlayers(Integer noOfPlayers) {
		this.noOfPlayers = noOfPlayers;
	}

	@Override
	public String toString() {
		return "GameDTO [name=" + this.getName() + ", type=" + this.getType() + ", noOfPlayers=" + this.getNoOfPlayers() + "]";
	}
	
	
	@Override
	public boolean equals(Object ref) {
		System.out.println("Inside equals method");
			if(ref != null) {
				if(ref instanceof GameDTO) {
					GameDTO dto = (GameDTO)ref;
					   if(dto.name.equals(this.name)) {
						   System.out.println("The given String is matched");
						   return true;
						  
					   }
				}
			}
		return false;
	}

}
