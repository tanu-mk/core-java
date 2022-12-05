class ReversedNumber{

	public static void main(String a[]){
	
		int num = 123456 , reversed = 0;
		
			for(; num != 0; num /= 10)           //run loop until num becomes 0 & get last digit from num
			{
				int digit = num % 10;
				reversed = reversed * 10 + digit;
			}
	System.out.println("Reversed Number is: "+ reversed);
	
	}





}