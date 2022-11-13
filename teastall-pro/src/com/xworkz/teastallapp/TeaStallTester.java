package com.xworkz.teastallapp;

import com.xworkz.teastallapp.tea.TeaStall;

public class TeaStallTester {

	public static void main(String t[]) {
		
		TeaStall ref = new TeaStall();
		
		System.out.println(ref.name + " "+ ref.teaStallId + " "+ ref.ownerName);
		
		ref.name ="Chaiwala";
		ref.teaStallId = 467;
		ref.ownerName = "Rahul";
		
		System.out.println(ref.name + " "+ ref.teaStallId + " "+ ref.ownerName);
		
		TeaStall ref1 = new TeaStall("Chaiwala", 487, "Chethan");
		
		System.out.println(ref1.name + " "+ ref1.teaStallId + " "+ ref1.ownerName);
		
		
		
		
		
		
		
	}
	
	
}
