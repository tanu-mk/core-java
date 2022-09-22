class CitizenOfIndia{

	public static void showTheResponsibility(){
	
	System.out.println("Invoked showTheResponsibility");
	
	int age = 20;
	char gender = 'F';
	
		if(age >= 10 && age < 16)
		{
			System.out.println("Responsibility is Schooling");
		}
	
		if(age > 16)
		{
			System.out.println("Responsibility is College");
		}
		
		if(age >= 21)
		{
			System.out.println("Responsibility is voting");
			
				if(gender == 'F')
				{
					System.out.println("Girl can legally Marry");
				}
				
				else
				{
					System.out.println("Boy cannot legally Marry");
				}
		}
	
	
	}




}