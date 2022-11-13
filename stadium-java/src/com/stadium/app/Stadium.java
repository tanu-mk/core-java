package com.stadium.app;

public class Stadium {
	
	static String stadiumNames[] = {null, null, null, null, null};
	static int z;
	
	public static boolean createStadiumNames(String stadiumName) {
	
		     stadiumNames[z] = stadiumName;
		     z++;
		     
		     return false;

}


	public static void getStadiumNames() {
		
		for(int z=0; z<stadiumNames.length; z++) {
			
			String ref = stadiumNames[z];
			System.out.println("Stadium name is " + ref);
		}
	}
	}