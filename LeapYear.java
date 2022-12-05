class LeapYear{

	public static boolean checkYear(int year){
	
		if(year % 400 ==0)
		return true;
		
		if (year % 100 == 0)
		return false;
		
		if(year % 4 == 0)
		return true;
		return false;
	
	}

	public static void main(String t[]){
	
	int year = 2020;
	
	System.out.println(checkYear(2020)? "Leap year" :"Not a Leap Year");
	}




}