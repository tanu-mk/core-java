class Garage{

	public static void getVehicleNo(String vehicleNo[]){
	
		System.out.println("inside getVehicleNo()");
		System.out.println("Size of the vehicle Num is: "+vehicleNo.length);
		System.out.println("List of Vehicle Num");
		
			for(int v=0; v<vehicleNo.length; v++)
			{
				System.out.println(vehicleNo[v]);
			}
		
		System.out.println("end of getGarage()");
	
	}
}