package com.xworkz.milkparlourapp;

import com.xworkz.milkparlourapp.Milk.MilkParlour;

public class MilkParlourTester {

	public static void main(String d[]) {
		
		/*MilkParlour mlk = new MilkParlour();
		mlk.shopId = "GDFKGF387596";
		mlk.name = "Nandini Milk Parlour";
		mlk.address = "Jaynagar";
		mlk.contactNo = 8908908908l;
		
		mlk.sweetsMenu = new String[4];
		mlk.sweetsMenu[0] = "Ladoo";
		mlk.sweetsMenu[1] = "Rasgulla";
		mlk.sweetsMenu[2] = "Peda";
		mlk.sweetsMenu[3] = "Mysore Pak";
		
		mlk.milkProducts = new String[5];
		mlk.milkProducts[0] = "Paneer";
		mlk.milkProducts[1] = "Milk Maid";
	    mlk.milkProducts[2] = "Ice Cream";
	    mlk.milkProducts[3] = "Curd";
	    mlk.milkProducts[4] = "Bread";
	    
	    mlk.branchesInBangalore = new String[3];
	    mlk.branchesInBangalore[0] = "Heballa";
	    mlk.branchesInBangalore[1] = "Marathahalli";
	    mlk.branchesInBangalore[2] = "Mahalakshmi Layout";
	    
	    mlk.beverages = new String[3];
	    mlk.beverages[0] = "Fruity";
	    mlk.beverages[1] = "Mazaa";
	    mlk.beverages[2] = "Apple cider";*/
		
		
		String sweetsMenu[] = new String[4];
		sweetsMenu[0] = "Ladoo";
		sweetsMenu[1] = "Rasgulla";
		sweetsMenu[2] = "Peda";
		sweetsMenu[3] = "Mysore Pak";
		
		String milkProducts[] = new String[5];
		milkProducts[0] = "Paneer";
		milkProducts[1] = "Milk Maid";
	    milkProducts[2] = "Ice Cream";
	    milkProducts[3] = "Curd";
	    milkProducts[4] = "Bread";
	    
	    String branchesInBangalore[] = new String[3];
	    branchesInBangalore[0] = "Heballa";
	    branchesInBangalore[1] = "Marathahalli";
	    branchesInBangalore[2] = "Mahalakshmi Layout";
	    
	    String beverages[] = new String[3];
	    beverages[0] = "Fruity";
	    beverages[1] = "Mazaa";
	    beverages[2] = "Apple cider";
	    
		
		
		MilkParlour mlk = new MilkParlour("GDFKGF387596", "Nandini Milk Parlour", "Jaynagar", 8908908908l, sweetsMenu, 
												milkProducts, branchesInBangalore, beverages );
	
		mlk.getFreshItems();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
