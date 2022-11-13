package com.xworkz.overloadingapp.conceptoverloading;

public class PetrolBunk {

	//instance variables/ states/ properties/ fields
	public int id;
	public String name;
	public String location;
	public String workersName[] = new String[7];
	
	public PetrolBunk() {
		
		System.out.println("Default constructor is called");
	}
	
	
	public PetrolBunk(String workersName[]) {
	
		this(1234, "DeveGowda Petrol Bunk", "Banashankari 2nd stage",workersName);
		
		System.out.println("one parameterized constructor is called");
		
	}
	
	
	public PetrolBunk(int id, String name, String location, String workersName[]) {
		
		this();
		
		System.out.println("Calling  4  parameterized constructor");
		
		this.id = id;
		this.name = name;
		this.location = location;
		this.workersName = workersName;
	}
	
	
	public void provideFuels() {
		
		
	}
	
	public void displayInformation() {
		
		System.out.println("displayinformation method is invoked");
		System.out.println(this.id +" "+ this.name + " "+ this.location);
		System.out.println("List of workers names in" + this.name);
		for(int i=0; i<workersName.length; i++) {
			System.out.println(workersName[i]);
			
		}
	}
	
}
