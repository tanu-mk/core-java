package com.xworkz.inheritanceapp.Base;

public class Singer {
	
	public String name;
	public String songName;
	public String place;
	
	public void toSing(String name, String songName) {
		
		this.name = name;
		this.songName = songName;
		
		System.out.println(this.name);
		System.out.println(this.songName);
	}

}
