package com.xworkz.overloadingapp.conceptoverloading;

public class CarromBoard {
	
	public String gameName;
    public int noOfPawns;
    public String color[] = new String [3];
    public String playerNames[] = new String [4];
    
    public CarromBoard() {
    	
    	System.out.println("Default constructor is called");
    	
    }
    
    public CarromBoard(String color[], String playerNames[]) {
    	
    	this("Carrom Board", 19, color, playerNames);
    	
    	System.out.println("calling 2 parameterized constructor");
    	
    }
    
    
    public CarromBoard(String gameName, int noOfPawns, String color[], String playerNames[] ) {
    	
    	this();
    	
    	System.out.println("Calling 4 Parameterized constructor");
    	
    	
    	this.gameName = gameName;
    	this.noOfPawns = noOfPawns;
    	this.color = color;
    	this.playerNames = playerNames;
    
    }
    
    public void toRefereshOurMind() {
    	
    	System.out.println("toFreshOurMind() is called");
    	
    	System.out.println(this.gameName + " "+ this.noOfPawns);
    	
    	System.out.println("Colors of pawns are");
    	for(int i=0; i<color.length; i++) {
    		System.out.println(color[i]);
    	}
    	
    	
    	System.out.println("list of players names");
    	for(int d=0; d<playerNames.length; d++) {
    		System.out.println(playerNames[d]);
    	}
    }
    
    


}
