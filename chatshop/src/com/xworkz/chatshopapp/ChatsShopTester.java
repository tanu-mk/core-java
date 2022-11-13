package com.xworkz.chatshopapp;

import com.xworkz.chatshopapp.Chats.ChatsShop;

public class ChatsShopTester {

	public static void main(String t[]) {
		
		/*ChatsShop chts = new ChatsShop();
		chts.gstIn = "GSTIN36585367";
		chts.name = " Sri Sai Juice and Chats Center ";
		chts.address = "K R Puram";
		chts.noOfBranches = 7;
		
		chts.staffNames = new String[3];
		chts.staffNames[0] = "Kiran";
		chts.staffNames[1] = "Chethan";
		chts.staffNames[2] = "Rahul";
		
		chts.staffContactNo = new long[3];
		chts.staffContactNo[0] = 8908908908l;
		chts.staffContactNo[1] = 8908907688l;
		chts.staffContactNo[2] = 8908908976l;
		
		chts.chatsMenu = new String[5];
		chts.chatsMenu[0] = "Gobi machurian";
		chts.chatsMenu[1] = "Masala puri";
		chts.chatsMenu[2] = "Pani Puri";
		chts.chatsMenu[3] = "BabyCorn Manchurian";
		chts.chatsMenu[4] = "Dahi Puri";
		
		chts.juiceNames = new String[5];
		chts.juiceNames[0] = "Orange";
		chts.juiceNames[1] = "Chikoo";
		chts.juiceNames[2] = "Musk Melon";
		chts.juiceNames[3] = "Water Melon";
		chts.juiceNames[4] = "Apple";
		
		chts.paymentMethods = new String[3];
		chts.paymentMethods[0] = "Cash";
		chts.paymentMethods[1] = "Scanner";
		chts.paymentMethods[2] = "Card";*/
				
		
		String staffNames[] = new String[3];
		staffNames[0] = "Kiran";
		staffNames[1] = "Chethan";
		staffNames[2] = "Rahul";
		
		long staffContactNo[] = new long[3];
		staffContactNo[0] = 8908908908l;
		staffContactNo[1] = 8908907688l;
		staffContactNo[2] = 8908908976l;
		
		String chatsMenu[] = new String[5];
		chatsMenu[0] = "Gobi machurian";
		chatsMenu[1] = "Masala puri";
		chatsMenu[2] = "Pani Puri";
		chatsMenu[3] = "BabyCorn Manchurian";
		chatsMenu[4] = "Dahi Puri";
		
		String juiceNames[] = new String[5];
		juiceNames[0] = "Orange";
		juiceNames[1] = "Chikoo";
		juiceNames[2] = "Musk Melon";
		juiceNames[3] = "Water Melon";
		juiceNames[4] = "Apple";
		
		String paymentMethods[] = new String[3];
		paymentMethods[0] = "Cash";
		paymentMethods[1] = "Scanner";
		paymentMethods[2] = "Card";
		
		
		
		
		
		ChatsShop chts = new ChatsShop("GSTIN36585367", " Sri Sai Juice and Chats Center ", "K R Puram", staffNames,
										staffContactNo, chatsMenu, juiceNames, 7, paymentMethods);
		
		chts.getChatsInfo();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
