package com.touristplaces.app;

public class TouristPlaces {
	
	static String touristPlacesNames[] = {null, null, null, null, null};
	static int m;
	
	public static boolean saveTouristPlacesNames(String touristPlaceName) {
		
		 touristPlacesNames[m] = touristPlaceName;
		 m++;
		 
		 return false;
	}
	
	
	public static void getTouristPlacesNames() {
		
		for(int m=0; m<touristPlacesNames.length; m++) {
			
			   String ref = touristPlacesNames[m];
			   
			   System.out.println("The Tourist place name is " + ref);
}
	}

}
