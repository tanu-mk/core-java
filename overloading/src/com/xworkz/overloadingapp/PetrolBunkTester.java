package com.xworkz.overloadingapp;

import com.xworkz.overloadingapp.conceptoverloading.PetrolBunk;

public class PetrolBunkTester {
	
	public static void main(String t[]) {
	
	/*String workersName[] = {"Chetan", "Rahul", "Navya", "Sandeep", "Raju", "Priya", "Sneha"};
	PetrolBunk bunk = new PetrolBunk(1234, "DeveGowda Petrol Bunk", "Banashankari 2nd stage", workersName);

	System.out.println(bunk.id + " "+ bunk.name + " "+ bunk.location);*/
		
		
		String workersName[] = {"Chetan", "Rahul", "Navya", "Sandeep", "Raju", "Priya", "Sneha"};
		
		PetrolBunk bunk2 = new PetrolBunk(workersName);
		
		System.out.println(bunk2.id + " "+ bunk2.name + " "+ bunk2.location);
		
		bunk2.displayInformation();
				
         
			}
		
		
		
		
		
	}	
		










