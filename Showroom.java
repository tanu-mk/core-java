class Showroom{

	public static void getCars(String cars[]){
		
		System.out.println("inside getCars()");
		System.out.println("Size of the cars is: "+ cars.length);
		System.out.println("List of cars are");
		
			for(int c=0; c<cars.length; c++)
			{
				System.out.println(cars[c]);
			}
		
		System.out.println("end of getCars()");
		
		}
	
	
	public static void getBikes(String bikes[]){
	
	    System.out.println("inside getBikes()");
		System.out.println("Size of the bikes is: "+ bikes.length);
		System.out.println("List of Bikes are");
		
			for(int b=0; b<bikes.length; b++)
			{
				System.out.println(bikes[b]);
			}

		System.out.println("End of getBikes()");
	
	
	
	} 

}