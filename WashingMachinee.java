class WashingMachinee{

	static String brand;
	static  String color;
	static int price;
	static boolean isConnected;
	static int maxSpeed;
	static int minSpeed;
	static int currentSpeed;


	public static boolean onOrOff(){
	
	System.out.println("inside onOrOff()");
	
		if(isConnected == false)
		{
			isConnected = true;
			System.out.println("Washing machine is on");
		}
		
		else if(isConnected == true)
		{
			isConnected = false;
			System.out.println("Washing machine is off");
		}
	
	System.out.println("end of onOrOff()");
	return(isConnected);
	
	}





	public static void increaseSpeed(){
	
	System.out.println("start of increaseSpeed()");
	
		if(isConnected = true)
		{
			if(currentSpeed < maxSpeed)
			{
				currentSpeed = currentSpeed + 1;
				System.out.println("The current speed of machine is: "+ currentSpeed);
			}
		
			else
			{
				System.out.println("Max speed reached");
			}
		}
	
		else
		{
			System.out.println("first machine on madhu");
		}
	
	System.out.println("end of increaseSpeed()");
	
	}




	
	public static void decreaseSpeed(){
	
	System.out.println("start of decreaseSpeed()");
	
		if(isConnected == true)
		{
			if(currentSpeed > minSpeed)
			{
				currentSpeed = currentSpeed - 1;
				System.out.println("The current speed of machine is: "+ currentSpeed);
			}
			
			else
			{
				System.out.println("Min speed reached");
			}
		}
		else
		{
			System.out.println("first machine on madhu");
		}
		
	System.out.println("end of decreaseSpeed()");
	
	}
	
	
	
	
	
	
}