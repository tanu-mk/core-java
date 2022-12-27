package com.xworkz.sanitizerapp;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class SanitizerRunner {
	
	public static void main(String[] args) {
		
		SanitizerDTO dto1 = new SanitizerDTO(123, "Sterillium", 5D, "Blue");
		SanitizerDTO dto2 = new SanitizerDTO(45, "Savlon", 45D, "White");
		SanitizerDTO dto3 = new SanitizerDTO(456, "Dettol", 3D, "Green");
		SanitizerDTO dto4 = new SanitizerDTO(567, "Lifebuoy", 23D, "White");
		SanitizerDTO dto5 = new SanitizerDTO(678, "Godrej", 19D, "Green" );
		SanitizerDTO dto6 = new SanitizerDTO(789, "Dabur", 5D , "Pink" );
		SanitizerDTO dto7 = new SanitizerDTO(8910, "Multani", 3D , "Blue" );
		SanitizerDTO dto8 = new SanitizerDTO(91011, "Corvil", 15D , "White" );
		SanitizerDTO dto9 = new SanitizerDTO(101112, "Trust", 20D , "Green" );
		SanitizerDTO dto10 = new SanitizerDTO(111213, "DCM Shriram", 10D , "Green");
		
		
		Collection<SanitizerDTO> collection = new ArrayList<SanitizerDTO>();
		collection.add(dto10);
		collection.add(dto9);
		collection.add(dto8);
		collection.add(dto7);
		collection.add(dto6);
		collection.add(dto5);
		collection.add(dto4);
		collection.add(dto3);
		collection.add(dto2);
		collection.add(dto1);
		
		
		Iterator<SanitizerDTO> element = collection.iterator();
		while(element.hasNext()) {
			SanitizerDTO ele = element.next();
				if(ele.getPrice() > 5) {
					System.out.println(ele);
				}
		}
		
		
		System.out.println("=========================================");
		
		
		Iterator<SanitizerDTO> string = collection.iterator();
		while(string.hasNext()) {
			SanitizerDTO str = string.next();
				if("Green".equals(str.getColor())) {
					string.remove();
					System.out.println(str);
					
		}
	}

	

		System.out.println("=========================================");
		
		
		Iterator<SanitizerDTO> data = collection.iterator();
		while(data.hasNext()) {
			SanitizerDTO value = data.next();
				if(value != null) {
					System.out.println(value);
				}
		}
	
	
	
		System.out.println("=========================================");
		
		
		Iterator<SanitizerDTO> newData = collection.iterator();
		while(newData.hasNext()) {
			SanitizerDTO data1 = newData.next();
				if() {
					
				}
		}
	
	
	
	
	}
}
