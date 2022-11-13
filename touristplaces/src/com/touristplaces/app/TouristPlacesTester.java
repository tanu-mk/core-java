package com.touristplaces.app;

public class TouristPlacesTester {
	
	public static void main(String t[]) {
		
		TouristPlaces.saveTouristPlacesNames("Coorg");
		TouristPlaces.saveTouristPlacesNames("Chikmagalur");
		TouristPlaces.saveTouristPlacesNames("Badami");
		TouristPlaces.saveTouristPlacesNames("Hampi");
		TouristPlaces.saveTouristPlacesNames("Saklespur");
		
		TouristPlaces.getTouristPlacesNames();
	}

}
