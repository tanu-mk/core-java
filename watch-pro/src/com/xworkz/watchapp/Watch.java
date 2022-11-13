package com.xworkz.watchapp;

public class Watch {
	
	public String watchId;
	public String colour;
	public int price;
	public String brandName;
    public static String type;
    
    
    //Default constructor
    public Watch() {
    	
    }
    
    //Parameterized constructor
    public Watch(String watchId, String colour, int price, String brandName ) {
    	this.watchId = watchId;
    	this.colour = colour;
    	this.price = price;
    	this.brandName = brandName;
    	
    }
    
	public void toBeInTime() {
		
		System.out.println("To view the time");
	}
	
	

}
















