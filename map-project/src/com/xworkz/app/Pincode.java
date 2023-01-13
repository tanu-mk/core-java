package com.xworkz.app;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.sun.corba.se.impl.oa.poa.AOMEntry;

public class Pincode {
	
	public static void main(String[] args) {
		
		Map<String, Integer> ref = new HashMap<String, Integer>();
		ref.put("MG Road", 560001);
		ref.put("Nagasandra", 560073);
		ref.put("Marathahalli", 560037);
		ref.put("Hassan", 580081);
		ref.put("Yeshwanthpur", 560045);
		
		System.out.println(ref.size());
		
		System.out.println("========KEYS=======");
		Set<String> keys = ref.keySet();
		keys.forEach(ele -> System.out.println(ele));
		
		System.out.println("========VALUES=======");
		Collection<Integer> values = ref.values();
		values.forEach(ele -> System.out.println(ele));
		
		System.out.println("========KEYS AND VALUES=======");
		Set<Entry<String, Integer>> entries = ref.entrySet();
		for(Entry<String, Integer> entry : entries) {
			System.out.println(entry.getKey() + " "+ entry.getValue());
		}
		
		
		
		
	}

}
