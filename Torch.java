class Torch{

	static String brandName;
	static String color;
	static int price;
	static boolean isConnected;
	
		public static boolean onOrOff(){
		
 System.out.println("Inside onOrOff");
		
		if(isConnected == true)
		{
			isConnected = false;
			System.out.println("Torch is on");
		}
		
		else if(isConnected == false)
		{
			isConnected = true;
			System.out.println("Torch is off");
		}
		
 System.out.println("Outside onOrOff");
 return isConnected;
		
	}
}