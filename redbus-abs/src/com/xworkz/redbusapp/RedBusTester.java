package com.xworkz.redbusapp;

import com.xworkz.redbusapp.redbus.RedBusContract;
import com.xworkz.redbusapp.transport.Transportation;
import com.xworkz.redbusapp.vrl.VrlImpl;

public class RedBusTester {
	
	public static void main(String[] args) {
		
		
		RedBusContract contract = new VrlImpl();
		
		Transportation transportation = new Transportation();
		transportation.noOfBookings = 20;
		transportation.bookings(contract);		
		
	}

}
