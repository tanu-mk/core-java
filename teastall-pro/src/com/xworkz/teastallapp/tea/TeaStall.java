package com.xworkz.teastallapp.tea;

public class TeaStall {
	
	public String name;
	public int teaStallId;
	public String ownerName;
	
	
	public TeaStall() {
		
		}

	public TeaStall(String name, int teaStallId, String ownerName) {
		
		//wrt id, using this is optional
		this.teaStallId = teaStallId;
		
		//wrt name, ownerName this keyword is used to avoid the naming conflict b/w parameter and instance variable
		this.name= name;
		this.ownerName = ownerName;
		
		this.displayInfo();
	}
	
	
	public void displayInfo() {
		
		//invoking variables of the current class using this keyword
		System.out.println(this.name + " "+ this.teaStallId + " "+ this.ownerName);
	}
}
