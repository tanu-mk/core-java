class PrimeNumber{

	public static void main(String a[]){
	
		int num =29;
		boolean isPrime = false;
		
			for(int i=2; i<num/2; i++)
			{
				if(num % i == 0)
				{
					isPrime = true;
				}
			}
	
			if(isPrime)
			{
				System.out.println( "Is a prime number "+ num);
			}
			else
			{
				System.out.println("Is not a prime number "+ num);
	        }



	}

}