class Cricket{

	public static void main(String a[]){
	
		int rohitHighestScore = 264;
		int sachinHighestScore = 200;
		int mandanaHighestScore = 135;
		int ackerrHighestScore = 232;
		int bjClarkHighestScore = 229;
		
		int highestScores[] = {rohitHighestScore, sachinHighestScore, mandanaHighestScore, ackerrHighestScore, bjClarkHighestScore};
		
		
	//variable returned from an array
		int ref4 = highestScores[4];
		
		int ref0 = highestScores[0];
		
		int ref2 = highestScores[2];
		
		System.out.println("Element at index 4 is "+ ref4);
		
		System.out.println("Element at index 0 is  "+ ref0);
		
		System.out.println("Element at index 2 is "+ ref2);
	
	System.out.println("The Length of Highest Scores is "+ highestScores.length);	
	}
}


     //for loop
  //for(int index=0; index<highestScores.length; index++)
  //{
	
	//int ref = highestScores[index];
	
	//System.out.println("Element at index "+ index "+ ref);
	
 // }