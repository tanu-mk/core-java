package com.xworkz.airportapp.airport;

public class Airport {
		
		 public  Passport passport;
		public  boolean isPassportAvailable;
		 public boolean isVisaAvailable;
		
		public boolean travel(Passport passport) {
			
			boolean isAllowed = false;
			
			System.out.println("Inside travel method ");
			
			if(isVisaAvailable == true) {
				
				if(isPassportAvailable == true) {
					
					this.passport = passport;
					
					System.out.println("Candidate informtion are:");
						this.passport.displayInfo();
					
				}
				else {
					
					System.out.println("Passport beke beku.....ella andre heg allow madake haguthe");
				}	
			}
			
			else {
				
				System.out.println("Allow madalla visa bandmelle bane.....evag maneg hoge");
			}
				
			return isAllowed;
			
	}
		
		
		
	}
		
		
		
		
	


