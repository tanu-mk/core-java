class Torchh{

	 static String brand;
	 static String color;
	 static int price;
	 static boolean isConnected;
	 static int maxBrightness;
	 static int minBrightness;
	 static int currentBrightness;


		public static boolean onOrOff(){
	
	System.out.println("Inside onOrOff()");
		
			if(isConnected == false)
			{
				isConnected = true;
				System.out.println("Torch is On");
			}
			
			else if(isConnected == true)
			{
				isConnected = false;
				System.out.println("Torch is Off");
			}
		
	System.out.println("End of onOrOff()");	
	return(isConnected);	
		}




	public static void increaseBrightness(){
		
	System.out.println("start of increaseBrightness()");
		
			if(isConnected == true)
			{
				if(currentBrightness < maxBrightness)
				{
					currentBrightness = currentBrightness + 1;
					System.out.println("The current Brightness is: "+ currentBrightness);
				}
				
				else
				{
					System.out.println("Max Brightness reached");
				}
			}
			
			else
			{
				System.out.println("First Torch on madhu");
			}
			
		System.out.println("end of increaseBrightness()");
	}
		
		
		
		
	public static void decreaseBrightness(){
	
	System.out.println("start of decreaseBrightness()");
	
		if(isConnected == true)
		{
			if(currentBrightness > minBrightness)
			{
				currentBrightness = currentBrightness - 1;
				System.out.println("The current Brightness is: "+ currentBrightness);
			}
			
			else
			{
				System.out.println("Min Brightness reached");
			}
		}
		
		else
		{
			System.out.println("first torch on madhu");
		}
	System.out.println("End of increaseBrightness()");
	
	}	
		
		
		
		
		
		
	
	
	
	
	
	
	
	
	
	}







