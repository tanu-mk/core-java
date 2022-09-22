class Mobile{

	static String brand;
	static String color;
	static int price;
	static boolean isOnOrOff;
	
	public static boolean switchOnOrOff(){
	
System.out.println("Inside switchOnOrOff");	
	if(isOnOrOff == false)
	{
		isOnOrOff = true;
		System.out.println("Mobile is Switch On");
	}
	
	else if(isOnOrOff == true)
	{
		isOnOrOff = false;
		System.out.println("Mobile is Switch Off");
	}
	
System.out.println("End of switchOnOrOff");	
 return isOnOrOff;
	
}




}