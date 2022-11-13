package com.xworkz.overloadingapp;

import com.xworkz.overloadingapp.conceptoverloading.CarromBoard;

public class CarromBoardTester {
	
	public static void main(String t[]) {
		
		/*String color[] = {"Black", "Cream", "Red"};
		String playerNames[] = {"Ram", "Chaya", "Anu", "Krish"};
		
		CarromBoard board = new CarromBoard("Carrom Board", 19, color, playerNames);*/
		
		
		String color[] = {"Black", "Cream", "Red"};
		String playerNames[] = {"Ram", "Chaya", "Anu", "Krish"};
		
		CarromBoard board2 = new CarromBoard( color, playerNames);
		
		System.out.println(board2.gameName + " "+ board2.noOfPawns);
		
		 board2.toRefereshOurMind();
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
