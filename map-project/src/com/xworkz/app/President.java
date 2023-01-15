package com.xworkz.app;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class President {

	public static void main(String[] args) {
		
		Map<String, String> countryAndPresidentMap = new TreeMap<String, String>();
													//.for((str1, str2) -> str1.compareTo(str2));
		
		
		
		
		
		countryAndPresidentMap.put("India", "Dhraupadi Murma");
		countryAndPresidentMap.put("China", "Xi Jinping");
		countryAndPresidentMap.put("Kazakhstan", "Qasym");
		countryAndPresidentMap.put("Saudi Arabia", "Salman");
		countryAndPresidentMap.put("Iran", "Ali Khamenei");
		countryAndPresidentMap.put("Mongolia", "Khaltmaagiin");
		countryAndPresidentMap.put("Indonesia", "Joko");
		countryAndPresidentMap.put("Turkey", "Recep Tayyip");
		countryAndPresidentMap.put("Myanmar", "Min Aung");
		countryAndPresidentMap.put("Thailand", "Maha Vajiralongkorn");
		countryAndPresidentMap.put("Iraq", "Barham Salih");
		countryAndPresidentMap.put("Japan", "Naruhito");
		countryAndPresidentMap.put("Malaysia", "Abdullah Sultan");
		countryAndPresidentMap.put("Oman", "Haitham bin Tarik");
		countryAndPresidentMap.put("Syria", "Bashar");
		countryAndPresidentMap.put("Cambodia", "Norodom");
		countryAndPresidentMap.put("Bangladesh", "Abdul Hamid");
		countryAndPresidentMap.put("Nepal", "Bidhya Devi");
		countryAndPresidentMap.put("Jordan", "Abdullah");
		countryAndPresidentMap.put("Sri lanka", "Gotabaya");
		
		
		System.out.println("Sorting in Ascending order");
		countryAndPresidentMap.forEach((key, value) -> System.out.println(("key:" + key + " "+ "value:" + value )));

		
		System.out.println("Updating president if country length is greater than 10 characters");
		
		
		
		
		
		
		
		
	}

}
