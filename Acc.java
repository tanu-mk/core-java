class Acc{

	static String brandName;
	static String color;
	static int price;
	static boolean isConnected;
	static int maxTemperature;
	static int minTemperature;
	static int currentTemperature;
	
	public static boolean onOrOff(){
	
	System.out.println("Inside onOrOff()");
	
		if(isConnected == false)
		{
			isConnected = true;
			System.out.println("Ac is turned On");
		}
		
		else if(isConnected == true)
		{
			isConnected = false;
			System.out.println("Ac is turned Off");
		}
	
	System.out.println("End of onOrOff()");
	return(isConnected);
}
	
	

	public static void increaseTemperature(){
	
	System.out.println("Start of increaseTemperature()");	
		if(isConnected == true)
		{
		
			if(currentTemperature < maxTemperature)
			{
			    currentTemperature = currentTemperature + 1;
				System.out.println("The current temperature of Ac is: "+ currentTemperature);
			}
		
		     else
			 {
				System.out.println("Max temperature reached");
			 }
		}
	
	    else
		{
			System.out.println("First Ac on madhu");
		}
	System.out.println("End of increaseTemperature()");

}





	public static void decreaseTemperature(){
		
System.out.println("Start of decreaseTemperature()");

		if(isConnected == true)
		{
			if(currentTemperature > minTemperature)
			{
				currentTemperature = currentTemperature - 1;
				System.out.println("The current Temperature is: "+ currentTemperature);
			}
			
			else 
			{
				System.out.println("Min volume reached");
			}
		}
		
		else
		{
			System.out.println("First Ac on madhu");
		}

System.out.println("End of decreaseTemperature()");

}

}