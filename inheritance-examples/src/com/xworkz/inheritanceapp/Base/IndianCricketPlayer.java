package com.xworkz.inheritanceapp.Base;

public class IndianCricketPlayer {
	
	public String name;
	public int noOfPlayers;
	public String stadiumName;
	
	public void toPlay(String name, int noOfPlayers) {
		
		this.name = name;
		this.noOfPlayers = noOfPlayers;
		
		System.out.println(this.name);
		System.out.println(this.noOfPlayers);
	}

}
