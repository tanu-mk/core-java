package com.xworkz.chatshopapp.Chats;

public class ChatsShop {
	
		public String gstIn;
		public String name;
		public String address;
		public String staffNames[];
		public long staffContactNo[];
		public String chatsMenu[];
		public String juiceNames[];
		public int noOfBranches;
		public String paymentMethods[];
		
		public ChatsShop() {
			
			System.out.println("Chats shop object is created");
			
		}
		
		public ChatsShop(String gstIn, String name, String address, String staffNames[], long staffContactNo[], 
						String chatsMenu[], String juiceNames[], int noOfBranches, String paymentMethods[]) {
			
			this.gstIn = gstIn;
			this.name = name;
			this.address = address;
			this.staffNames =staffNames;
			this.staffContactNo = staffContactNo;
			this.chatsMenu = chatsMenu;
			this.juiceNames = juiceNames;
			this.noOfBranches = noOfBranches;
			this.paymentMethods = paymentMethods;
			
		}

		public void getChatsInfo() {
			
			System.out.println("=================================================");
			System.out.println("Chat Shop Gst No " + gstIn);
			System.out.println("=================================================");
			System.out.println("Chat Shop name " + name);
			System.out.println("=================================================");
			System.out.println("Chat shop address " + address);
			System.out.println("=================================================");
			System.out.println("No of Branches of Chats Shop " + noOfBranches);
			System.out.println("=================================================");
			
			System.out.println("Chat shop Info");
			System.out.println("=================================================");
			System.out.println("Chat shop Staff names");
				for(int t=0; t<staffNames.length; t++) {
					System.out.println(staffNames[t]);
				}
			System.out.println("=================================================");
			
			
			System.out.println("=================================================");	
			System.out.println("Chat shop staff Contact No");
				for(int m=0; m<staffContactNo.length; m++) {
					System.out.println(staffContactNo[m]);
				}
			System.out.println("=================================================");
			
			System.out.println("=================================================");
			System.out.println("Chat shop chats menu");
				for(int h=0; h<chatsMenu.length; h++) {
					System.out.println(chatsMenu[h]);
				}
			System.out.println("=================================================");
			
			System.out.println("=================================================");
			System.out.println("Chats shop juice menu");
				for(int k=0; k<juiceNames.length; k++) {
					System.out.println(juiceNames[k]);
				}
			System.out.println("=================================================");
			
			System.out.println("=================================================");
			System.out.println("Payment method in shop");	
				for(int c=0; c<paymentMethods.length; c++) {
					System.out.println(paymentMethods[c]);
				}
			
				
			
		}
}
