package com.xworkz.app;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;





public class Temperature {
	
	public static void main(String[] args) {
		
		Map<String, Double> map = new HashMap<String, Double>();
		map.put("Bengaluru", 24.7);
		map.put("Shivamogga", 28.2);
		map.put("Chikamagalur", 22.4);
		map.put("Yadgir", 38.5);
		map.put("Hassan", 27.0);
		
		System.out.println(map.size());
		
		if(map.isEmpty()) {
			System.out.println("Map nali yenu ella");
		}
		else {
			System.out.println("Map nali en eno ede");
		}
		
		Set<String> keys = map.keySet();
			keys.forEach(e->System.out.println(e));
			
		System.out.println("=========VALUES=========");
		
		Collection<Double> values = map.values();
		values.forEach(v -> System.out.println(v));
		
		System.out.println("===========KEYS AND VALUES==========");
		
		Set<Entry<String,Double>> entries = map.entrySet();
			for(Entry<String,Double> entry:entries) {
				System.out.println(entry.getKey() + " " + entry.getValue());
			}
		
		
		
		
		
	}

}
