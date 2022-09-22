class Trimmer{

	public static void main(String a[]){
	
		String color = "Grey with Black Mix";
		String brand = "Philips";
		int price = 2570;
		String working = "Yes";
		String warranty = "1 Year";
		
		
		
		
		String aboutTrimmer[] = {color, brand, working, warranty};
		
		int prices[] ={price}; 

		
		String ref0 = aboutTrimmer[0];
		String ref1 = aboutTrimmer[1];
		String ref2 = aboutTrimmer[2];
		String ref3 = aboutTrimmer[3];
		
		
		
		int reference0=  prices[0] ; 
		
		
		
		System.out.println("The Color of Trimmer is "+ ref0);
		System.out.println("Trimmer Brand "+ ref1);
		System.out.println("Is Trimmer in Working Condition "+ ref2);
		System.out.println("Is Trimmer Working "+ ref3);
		System.out.println("The price of Trimmer is "+ reference0);
		
	
	}
}