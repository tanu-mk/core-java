package com.xworkz.milkparlourapp.Milk;

public class MilkParlour {

	public String shopId;
	public String name;
	public String address;
	public long contactNo;
	public String sweetsMenu[];
	public String milkProducts[];
	public String branchesInBangalore[];
	public String beverages[];
	
	public MilkParlour() {
		
		System.out.println("Milk Parlour object is created");
	}
	

	public MilkParlour(String shopId, String name,  String address, long contactNo, String sweetsMenu[],
			              String milkProducts[], String branchesInBangalore[],  String beverages[]) {
		
		this.shopId = shopId;
		this.name = name;
		this.address=  address;
		this.contactNo = contactNo;
		this.sweetsMenu = sweetsMenu;
		this.milkProducts = milkProducts;
		this. branchesInBangalore = branchesInBangalore;
		this. beverages = beverages;
	}
	
	
	public void getFreshItems() {
		
		System.out.println("Milk Parlour Id " + shopId);
		System.out.println("=================================================");
		System.out.println("Milk Parlour name " + name);
		System.out.println("=================================================");
		System.out.println("Milk Palour address " + address);
		System.out.println("=================================================");
		System.out.println("Milk Parlour contactNo "+ contactNo);
		System.out.println("=================================================");
		
		System.out.println("Milk Parlour Info");
		System.out.println("=================================================");
		System.out.println("Sweets available in Milk Parlour");
		 	for(int m=0; m<sweetsMenu.length; m++) {
		 		System.out.println(sweetsMenu[m]);
		 	}
		System.out.println("=================================================");
		
		
		System.out.println("=================================================");	
		System.out.println("Milk Products available in Parlour");
		 	for(int t=0; t<milkProducts.length; t++) {
		 		System.out.println(milkProducts[t]);
		 	}
		System.out.println("=================================================");
		
		
		System.out.println("=================================================");
		System.out.println("Milk Parlour Branches in Bangalore");
		 	for(int r=0; r<branchesInBangalore.length; r++ ) {
		 		System.out.println(branchesInBangalore[r]);
		 	}
	    System.out.println("=================================================");
		
		
		System.out.println("=================================================");
	    System.out.println("Beverages Avilable in Parlour");
			for(int f=0; f<beverages.length; f++) {
				System.out.println(beverages[f]);
			}
		
		
		
	}
	
	
	
}
