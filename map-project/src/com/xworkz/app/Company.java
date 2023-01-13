package com.xworkz.app;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Company {
	
	public static void main(String[] args) {
		
		Map<String, String> str = new HashMap<String, String>();
		str.put("Flipkart", "Slack");
		str.put("Deloitte", "Linux");
		str.put("Avesthagen", "Java");
		str.put("Sasken Technologies", "Internet Explorer");
		str.put("Oracle", "Simulation");
		
		System.out.println(str.size());
		
		System.out.println("=========KEYS========");
		Set<String> keys = str.keySet();
		keys.forEach(ele -> System.out.println(ele));
		
		System.out.println("=========KEYS========");
		Collection<String> values = str.values();
		values.forEach(ele -> System.out.println(ele));
		
		System.out.println("=========KEYS and VALUES========");
		Set<Entry<String, String>> entries = str.entrySet();
		for(Entry<String, String> entry : entries) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
		
		
	}

}
