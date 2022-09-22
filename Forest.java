class Forest{

	public static void main(String a[]){

		String name = "Bhadra Reserved Forest";
		String totalArea = "1,91,791 Geographical Area";
		String type = "Dry Deciduous Forest";
		String region = "Chikmagalur District,south of Bhadravathi city";
		String primaryAnimals[] = {"Tigers" , "Lion","Lepord","BlackPanther","Deer"};
		
			
			
			
			String aboutForest[] = {name, totalArea, type, region};
			
			String ref0 = aboutForest[0];
			
			String ref1 = aboutForest[1];
			
			String ref2 = aboutForest[2];
			
			String ref3 = aboutForest[3];
			
			
			System.out.println("Name of the Forest is "+ ref0);
			System.out.println("Forest Area "+ ref1);
			System.out.println("Forest Type "+ ref2);
			System.out.println("Region of Forest "+ ref3);
			
		    
			for(int f=0; f<primaryAnimals.length; f++)
			{
				String ref = primaryAnimals[f];
				System.out.println("Animals found in Forest "+ f  + ref);
				
			}
			
		
	
	
	}
}