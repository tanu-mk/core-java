class Ac{

	static String brand;
	static double price;
    static boolean isConnected;


		public static boolean onOrOff(){
		
		System.out.println("Inside onOrOff");
		
		if(isConnected == false)
			{
				isConnected = true;
				System.out.println("Ac is On");
			}
		else if(isConnected == true)
		    {
		       isConnected = false;
			   System.out.println("Ac is off");
            }
		
		
		
       System.out.println("end of onOrOff");
	   return (isConnected);

} 

}