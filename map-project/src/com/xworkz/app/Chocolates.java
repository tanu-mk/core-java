package com.xworkz.app;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;


public class Chocolates {
	
	public static void main(String[] args) {
		
		Map<String, Double> ref = new HashMap<String, Double>();
		ref.put("Dairy Milk", 185.76);
		ref.put("Nestle", 89.23);
		ref.put("Ferrero Rocher", 480.00);
		ref.put("Hershey's", 90.87);
		ref.put("Amul", 56.89);
		
		System.out.println(ref.size());
		
		System.out.println("==========KEYS==========");
		Set<String> keys = ref.keySet();
		keys.forEach(ele ->System.out.println(ele));
		
		System.out.println("==========VALUES==========");
		Collection<Double> values = ref.values();
		values.forEach(ele -> System.out.println(ele));
		
		System.out.println("==========VALUES==========");
		Set<Entry<String, Double>> entries = ref.entrySet();
		for(Entry<String, Double> entry : entries) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
		
		
		
		
	}

}
