package com.xworkz.inheritanceapp;

import com.xworkz.inheritanceapp.Base.SocialMedia;

public class SocialMediaTester {
	
	public static void main(String t[]) {
		
		SocialMedia sm = new SocialMedia();
		sm.toView("Insta", "Watching Reels");
		
		SocialMedia sm4 = new SocialMedia();
		sm4.toView("Whatsapp", "Chatting");
		
		
	}

}
