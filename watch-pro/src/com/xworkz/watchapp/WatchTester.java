package com.xworkz.watchapp;

public class WatchTester {

	public static void main(String t[]) {
		
		Watch.type = "Digital";
		
		Watch wt = new Watch("HDBV368", "Black", 8546, "Noise");
		System.out.println("Features of Watch");
		System.out.println(wt.watchId + " "+ wt.colour + " "+ wt.price + " "+ wt.brandName + " "+ Watch.type );
		
		
		Watch wt1 = new Watch("HgdfV368", "White", 3546, "Pebble");
		System.out.println("Features of Watch");
		System.out.println(wt1.watchId + " "+ wt1.colour + " "+ wt1.price + " "+ wt1.brandName + " "+ Watch.type );
		
		
		Watch wt2 = new Watch("HDBV368", "Brown", 3446, "Redmi");
		System.out.println("Features of Watch");
		System.out.println(wt2.watchId + " "+ wt2.colour + " "+ wt2.price + " "+ wt2.brandName + " "+ Watch.type );
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
}
