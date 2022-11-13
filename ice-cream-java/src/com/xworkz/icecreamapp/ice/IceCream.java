package com.xworkz.icecreamapp.ice;

public class IceCream {
	
	public String shopId;
	public String name;
	public String address;
	public long contactNo;
	public String menu[];
	public String flavours[];
	public String branches[];
	
	public IceCream() {
		System.out.println("Milk Parlour object is created");
	}

	
	public IceCream(String shopId, String name, String address, long contactNo,
						String menu[], String flavours[],  String branches[]) {
		
		this.shopId = shopId;  
	    this.name = name;
		this.address =  address;
		this.contactNo = contactNo;
		this.menu = menu;
		this.flavours = flavours;
		this.branches =  branches;
				 
	}

	
	public void toFeelCool() {
		
		System.out.println("Ice Cream shop Id " + shopId);
		System.out.println("=================================================");
		System.out.println("Ice Cream shop name " + name);
		System.out.println("=================================================");
		System.out.println("Ice Cream Shop address " + address);
		System.out.println("=================================================");
		System.out.println("Ice Cream Shop contactNo "+ contactNo);
		System.out.println("=================================================");
		
		System.out.println("Ice Cream Shop Info");
		System.out.println("=================================================");
		System.out.println("menu available in ice cream shop");
		 	for(int m=0; m<menu.length; m++) {
		 		System.out.println(menu[m]);
		 	}
		System.out.println("=================================================");
		
		
		System.out.println("=================================================");	
		System.out.println("Flavours available in shop");
		 	for(int t=0; t<flavours.length; t++) {
		 		System.out.println(flavours[t]);
		 	}
		System.out.println("=================================================");
		
		
		System.out.println("=================================================");
	    System.out.println("Branches of Ice Cream Shop");
			for(int f=0; f<branches.length; f++) {
				System.out.println(branches[f]);
			}
		}
}
