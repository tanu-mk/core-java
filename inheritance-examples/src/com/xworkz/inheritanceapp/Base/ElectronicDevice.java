package com.xworkz.inheritanceapp.Base;

public class ElectronicDevice {
	
	public String brand;
	public String modelName;
	public String memoryStorageCapacity;
	public String color;
	
	public void takingPhotos(String modelName, String memoryStorageCapacity) {
		
		this.modelName = modelName;
		this.memoryStorageCapacity = memoryStorageCapacity;
		
		System.out.println(this.modelName);
		System.out.println(this.memoryStorageCapacity);
		
	}
	
}
