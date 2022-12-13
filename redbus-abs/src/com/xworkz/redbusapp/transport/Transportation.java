package com.xworkz.redbusapp.transport;

import com.xworkz.redbusapp.redbus.RedBusContract;

public class Transportation {
	
	RedBusContract redbusContract;
	
	String name = "Sri Durga Parameshwari";
	
	public int noOfBookings;
	
	public boolean bookings(RedBusContract contract) {
		
		boolean isBookingDone = false;
	System.out.println("Inside bookings method");
	
		boolean condition = contract.conditionOfBus();
		
			if(condition == true ) {
			System.out.println("The bus is in good condition");
			
				if(noOfBookings <= contract.minBookings()) {
					System.out.println("No of Bookings is:" + noOfBookings);
					System.out.println("Thank u for booking the ticket through" + name);
					isBookingDone = true;
		}
			else {
			System.out.println("Cannot proceed with bookings as noOfBookings exceeds");
				}
		    }
	
		else {
			System.out.println("Cannot proceed with Booking as Bus is not in good condition");
		}
		return isBookingDone;
			
	}

}

