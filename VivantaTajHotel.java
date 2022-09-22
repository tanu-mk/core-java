class VivantaTajHotel
{

	public static void main(String a[])
	{
		   
	   String type = "5 star Hotel";	  
       String address = "M G Road";
	   String managerNames[] = {"Akshata","Lakshmi","Sangeetha","Ganesha","Sumanth"};
	   int noOfManagers = 5;
	   String foodMenu[] = {"Tandoori Palav","Corn fried Rice","Babycorn Manchurian","Mushroom pepper Dry","Tandoori Gobi","Paneer Masala","Lava cup cake",
	                         "Chicken Lollypop","Mutton Biriyani","Chicken Biriyani","Fried Rice","Gobi Manchurian","Noodles","Schezwan Fried Rice","Mushroom curry"};
       							 
		   
					System.out.println("Welcome to Vivanta Taj Hotel");
					System.out.println("Hotel Type "+ type);
					System.out.println("Hotel is Located in "+ address);

					System.out.println("********************************************");	
					System.out.println("List of Manager Names");
					System.out.println("********************************************");	
					
					for(int m=0; m<managerNames.length; m++)
					{
						System.out.println(managerNames[m]);
                    }

					System.out.println("No Of Managers "+ noOfManagers);


					System.out.println("********************************************");	
					System.out.println("List of Food Menu ");
					System.out.println("********************************************");	
					
					for(int f=0; f<foodMenu.length; f++)
					{
						System.out.println(foodMenu[f]);
                    }
		   
	}          
}
  
  
  
  //truffles
  //empire