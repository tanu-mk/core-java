class Swiggyy{

	public static double takeOrders(String item){
	
		
		if(item == "Pizza")
		{
			System.out.println("Thank u for ordering "+ item);
			return 99.00;
			
		}
	
		if(item == "Sandwitch")
		{
			System.out.println("Thank u for ordering "+ item);
			return 70.00;
		}
	
		if(item == "SouthIndian")
		{
			System.out.println("Thank u for ordering "+ item);
			return 75.66;
		}
	
		if(item == "Mosranna")
		{
			System.out.println("Thank u for ordering "+ item);
			return 45.50;
		}
	
		if(item == "Burger")
		{
			System.out.println("Thank u for ordering "+ item);
			return 112.98;
		}
	
		if(item == "Pasteries")
		{
			System.out.println("Thank u for ordering "+ item);
			return 80.00;
		}
		
	return 0.0;
	}




	public static double takeOrders(String item , int quantity){
	
		
		if(item == "Pizza")
		{
			System.out.println("Thank u for ordering "+ item + " and quantity: "+ quantity);
			return 99.00 * quantity;
			
		}
	
		if(item == "Sandwitch")
		{
			System.out.println("Thank u for ordering "+ item + " and quantity: "+ quantity);
			return 70.00 * quantity;
		}
	
		if(item == "SouthIndian")
		{
			System.out.println("Thank u for ordering "+ item + " and quantity: "+ quantity);
			return 75.66 * quantity;
		}
	
		if(item == "Mosranna")
		{
			System.out.println("Thank u for ordering: "+ item + " and quantity: "+  quantity );
			return 45.50 * quantity;
		}
	
		if(item == "Burger")
		{
			System.out.println("Thank u for ordering "+ item + " and quantity: "+ quantity);
			return 112.98 * quantity;
		}
	
		if(item == "Pasteries")
		{
			System.out.println("Thank u for ordering "+ item + " and quantity: "+ quantity );
			return 80.00 * quantity;
		}
		
	return 0.0;
	}





}