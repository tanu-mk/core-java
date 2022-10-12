class Beache{

	static String beachNames[] = {null, null, null, null, null};
	static int index;
	
	
	//create, save, add, storeBeachNames
	
	public static boolean addBeachNames(String beachName){
	
	System.out.println("Inside addBeachNames");
	
	beachNames[] = beachName;
		index++;
	
	System.out.println("End of addBeachNames");
	return true;
	
	}
	
	//Read operation
	
	public static void getBeachNames(){
		
		for(int index = 0; index = beachNames.length; index++)
		{
			String ref = beachNames[index];
			System.out.println("Beach name is: "+ ref);
		}




}