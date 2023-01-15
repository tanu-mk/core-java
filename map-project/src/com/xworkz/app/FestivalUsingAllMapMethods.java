package com.xworkz.app;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class FestivalUsingAllMapMethods {

	public static void main(String[] args) {
		
		Map<String, LocalDate> festivalAndDateMap = new HashMap<String, LocalDate>();
		festivalAndDateMap.put("Deepavali", LocalDate.of(2023, 11, 17));
		festivalAndDateMap.put("Ugadi", LocalDate.of(2023, 03, 22));
		festivalAndDateMap.put("Sankranthi", LocalDate.of(2023, 01, 15));
		festivalAndDateMap.put("Vinayaka Chathurthi", LocalDate.of(2023, 8, 19));  //08 not taken due to hexadecimal
		festivalAndDateMap.put("Dussehra", LocalDate.of(2023, 10, 24));
		
		
		System.out.println("========Contain for Key========");
		boolean contains = festivalAndDateMap.containsKey("Ugadi");
		System.out.println( "Contains Ugadi " + contains);
		
		
		System.out.println("========Contain for Value========");
		boolean containsValue = festivalAndDateMap.containsValue(LocalDate.of(2023, 03, 22));
		System.out.println("Contains Value " + containsValue);
		
		
		System.out.println("========Contain for Both Key & Value========");
		festivalAndDateMap.forEach((key, value) -> System.out.println("key:" + key + " "+ "value:" + value ));
		
		

		System.out.println("======== for remove ========");
		LocalDate date = festivalAndDateMap.remove("Dussehra");
		System.out.println("Removed entry for value "+ date);
		
//		LocalDate key = festivalAndDateMap.remove(LocalDate.of(2023, 03, 22));
//		System.out.println(key);
		
		System.out.println(festivalAndDateMap.replace("Sankranthi", LocalDate.now()));
		
		
		
		
	}
	
	
	
}
