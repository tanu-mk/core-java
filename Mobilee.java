class Mobilee{

	static String brand;
    static String color;
	static int price;
	static boolean isConnected;
	static int maxVolume;
	static int minVolume;
	static int currentVolume;
	
	public static boolean onOrOff(){
	
	System.out.println("inside onOrOff()");
	
		if(isConnected == false)
		{
			isConnected = true;
			System.out.println("The mobile is turned on");
		}
	
		else if(isConnected == true)
		{
			isConnected = false;
			System.out.println("The mobile is turnes off");
		}
	
	System.out.println("end of onOrOff()");
	return(isConnected);
	
	}






	public static void increaseVolume(){
	
	System.out.println("Inside increaseVolume()");
	
		if(isConnected == true)
		{
			if(currentVolume < maxVolume)
			{
				currentVolume = currentVolume + 1;
				System.out.println("The current volume is: "+ currentVolume);
			}
		
			else 
			{
				System.out.println("Max volume reached");
			}
		}
	
		else 
		{
			System.out.println("first mobile on madhu");
		}
	
	System.out.println("Inside increaseVolume()");
	
	}




	public static void decreaseVolume(){
	
	System.out.println("Inside decreaseVolume()");
	
		if(isConnected == true)
		{
			if(currentVolume > minVolume)
			{
				currentVolume = currentVolume - 1;
				System.out.println("The current volume is: "+ currentVolume);
			}
		
			else
			{
				System.out.println("Min volume reached");
			}
		}
	
		else
		{
			System.out.println("first mobile on madhu");
		}
	
	System.out.println("Inside decreaseVolume()");
	
	}




















}