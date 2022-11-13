package com.beach.app;

public class Beach {

	
	static String beachNames[] = {null, null, null, null, null};
	static int d;
	
	public static boolean createBeachNames(String beachName) {
		
			    beachNames[d] = beachName;
			    d++;
			    
			    return false;
	}
	
	public static void getBeachNames() {
		
		for(int d=0; d<beachNames.length; d++) {
			
			String ref = beachNames[d];
			
			System.out.println("The beach name is " + ref);
		}
	}
	
	
	}
	
	
