class Fibonacci{

	public static void main(String a[]){
	
		int n = 10 , firstTerm = 0 , secondTerm = 1;
		
		System.out.println("Fibonacci Series till "+ n + " terms:");
		
			for(int i = 1; i<=n; i++)
			{
				System.out.println(firstTerm + ", ");      // 0
				
				int nextTerm = firstTerm + secondTerm;    // 
				
				firstTerm = secondTerm;                    // 0=1
				secondTerm = nextTerm;                     // 1=0+1 =1
				                                           // 0=1 , 1=1 , 
				
				
				
				
			}
	
	
	
	}




}