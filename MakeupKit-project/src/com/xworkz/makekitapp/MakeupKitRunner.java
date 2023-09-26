package com.xworkz.makekitapp;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class MakeupKitRunner {
	
	
	public static void main(String[] args) {
		
		MakeupKitDTO dto1 = new MakeupKitDTO("Foundation", "Lakme", 899 );
		MakeupKitDTO dto2 = new MakeupKitDTO("Kajal", "Sugar", 399 );
		MakeupKitDTO dto3 = new MakeupKitDTO("Mascara", "Mac", 499 );
		MakeupKitDTO dto4 = new MakeupKitDTO("Primer", "Nykaa", 699 );
		
		Collection<MakeupKitDTO> collection = new ArrayList<MakeupKitDTO>();
		collection.add(dto1);
		collection.add(dto2);
		collection.add(dto3);
		collection.add(dto4);
		
		Iterator<MakeupKitDTO> ref = collection.iterator();
		while(ref.hasNext()) {
			MakeupKitDTO element = ref.next();
			
			//System.out.println(element.getBrand());
			
			/*
			  if(element.getPrice() > 399)
			  { System.out.println(element); }
			 */
				
				/*if("Lakme".equals(element.getBrand())) {
					System.out.println(element);
				}
				*/
				
				
				
				if(element.getPrice() > 599) {
					ref.remove();
					System.out.println(element);
					
				}
				
				
				
				
				
		}
		
		
		
		
	}

}
