class WashingMachine{

	static String brand;
	static String color;
	static int rpm;
    static boolean isWorking;

		public static boolean isConnected(){
		
	System.out.println("inside isConnected");
	
		if(isWorking == false)
	    {
		  isWorking = true;
		  System.out.println("Washing Machine is Working");
		}
	 else if(isWorking == true)
	 {
          isWorking = false;
		  System.out.println("Washing Machine is not Working");
	 }
	 
	 System.out.println("outside isConnected");
	return(isWorking);
	
}
}