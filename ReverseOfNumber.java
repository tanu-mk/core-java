class ReverseOfNumber{

	public static void main(String t[]){
	
	int number = 12345;
	int reverseNumber = 0;
	
	while(number!=0)
	{
		int rem = number%10;
		reverseNumber = reverseNumber*10+rem;
	}
	
	System.out.println("The reverse number is: " + reverseNumber);
	
	
	
	
	
	}




}