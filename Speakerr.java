class Speakerr{

	static String brand;
	static String color;
	static double price;
	static boolean isConnected;
	static int minVolume;
	static int maxVolume = 8;
	static int currentVolume;
	
	
	public static boolean onOrOff(){
	
System.out.println("inside onOrOff");
	
	if(isConnected == false)
	{
		isConnected = true;
			System.out.println("Speaker is turned on");
	}
	else if(isConnected == true)
	{
		isConnected = false;
			System.out.println("Speaker is turned off");
	}
	
System.out.println("end of onOrOff");
	return (isConnected);
}


	public static void increaseVolume(){
	
 System.out.println("inside increaseVolume()");
		
	if(isConnected == true)
	{
		if(currentVolume < maxVolume)
		{
		 currentVolume = currentVolume + 1;
		 System.out.println("The current volume is : "+ currentVolume);
	    }
		
	    else
		{
		  System.out.println("Max volume reached......");
		}
	}
		
		else 
		{
		  System.out.println("Gube.....First Speaker On madhu");
		}
		
	
 System.out.println("end of increaseVolume()");
}



	public static void decreaseVolume(){
		
System.out.println("inside decreaseVolume()");

	if(isConnected == true)
	{
		   if(currentVolume > minVolume)
		   {
			 currentVolume = currentVolume - 1;
             System.out.println("The current volume is : "+ currentVolume);			 
		   }
		   
		   else
		   {
			   System.out.println("Min Volume reached");
		   }
		   
	}

   else 
   {
	   System.out.println("Gube.......Speaker on madhu");
   }

System.out.println("end of decreaseVolume()");
		
		
		
		
		
}















}	