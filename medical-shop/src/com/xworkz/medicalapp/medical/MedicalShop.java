package com.xworkz.medicalapp.medical;

public class MedicalShop {

	public String gstNo ;
	public String address ;
	public String name ;
	public String staffNames[] ;
	public long staffContactNo[] ;
	public String medicineNames[] ; 
	public String cosmetics[] ;
	public int noOfSections;
	public String billingMethod[] ;
	
	
	public MedicalShop(String gstNo, String address, String name, String staffNames[], long staffContactNo[],
			            String medicineNames[], String cosmetics[], int noOfSections, String billingMethod[] ) {
		
		this.gstNo =  gstNo;
		this.address = address;
		this.name = name;
		this.staffNames = staffNames;
		this.staffContactNo = staffContactNo;
		this.medicineNames = medicineNames;
		this.cosmetics = cosmetics;
		this.noOfSections = noOfSections;
		this.billingMethod = billingMethod;
		
		
	}
	
	public void displayInfo() {
		
		System.out.println("Medical shop name is " + name);
		System.out.println("==================================");
		System.out.println("Medical shop gstNo is " + gstNo);
		System.out.println("==================================");
		System.out.println("Medical shop address is " + address);
		System.out.println("==================================");
		System.out.println("Medical Staff Info");
			for(int z=0; z<staffNames.length; z++) {
				System.out.println(staffNames[z]) ;
			}
	    System.out.println("==================================");
		
	    System.out.println("Medical Staff Contact No");
			for(int i=0; i<staffContactNo.length; i++) {
			System.out.println(staffContactNo[i]) ;
		}
		System.out.println("==================================");
    

		System.out.println("List of Medicine names");
			for(int d=0; d<medicineNames.length;d++) {
		System.out.println(medicineNames[d]) ;
	}
			System.out.println("==================================");
	    
		System.out.println("List of Cosmetics");
			for(int v=0; v<cosmetics.length; v++ ) {
		System.out.println(cosmetics[v]);
			}
		System.out.println("==================================");
		
	    System.out.println("Methods of billing");
	    	for(int w=0; w<billingMethod.length; w++) {
	    		System.out.println(billingMethod[w]);
	    	}
	    
	    
	    
	}
	
	
	
	
	
	
}

