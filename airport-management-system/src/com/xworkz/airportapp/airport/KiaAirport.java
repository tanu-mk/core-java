package com.xworkz.airportapp.airport;

public class KiaAirport {
			
			 public Passport passport;
			 public boolean isVisaAvailable;
			 public int laguage;
			 
			
			public boolean travel(Passport passport) {
				
				boolean isAllowed = false;
				
				System.out.println("Inside travel method ");
				
				if(isVisaAvailable == true) {
					
					if(laguage <= 32) {
						
						System.out.println("Laguage check is done.....allowed");
						
						this.passport = passport;
						
						System.out.println("Candidate informtion are:");
							this.passport.displayInfo();
						
					}
					else {
						
						System.out.println("Laguage over weight hagede allow madalla");
					}	
				}
				
				else {
					
					System.out.println("Allow madalla visa bandmelle bane.....evag maneg hoge");
				}
					
				return isAllowed;
				
		}
			
			
			
		}
			
			

