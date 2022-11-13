package com.xworkz.examapp.e;

public class CoffeeShop {
	
	public Coffee coffee;
	public int price;
	public boolean isConnected;
	
	public boolean filter(Coffee coffee) {
		
		
		System.out.println(" Inside filter method");
		
		
		if(isConnected == false) {
			isConnected = true;
			
			System.out.println("Filter is connected");
			
			System.out.println("Coffee powder is Present");
			
			if(coffee != null) {
				this.coffee = coffee;
				
				System.out.println("Coffee powder details are");
					this.coffee.toProvideCoffee();
					
					
					
					System.out.println("Coffee is filtered");
			}
			
			else {
			
				System.out.println("Coffee powder is not Present");
			}
			}
		
		else  {
				
			
			System.out.println("Filter is Not Connected......Coffee not available");
		}
			
		return isConnected;
			
			
	}
	
	

}
