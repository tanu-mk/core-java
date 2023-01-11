package com.xworkz.springapp.boot;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.springapp.configuration.SpringConfiguration;
import com.xworkz.springapp.thing.Bakery;
import com.xworkz.springapp.thing.Furniture;
import com.xworkz.springapp.thing.MetroStation;
import com.xworkz.springapp.thing.Mirror;
import com.xworkz.springapp.thing.Temple;

public class Runner {
	
	public static void main(String[] args) {
		
		ApplicationContext spring = new AnnotationConfigApplicationContext(SpringConfiguration.class);
		
		
		String[] ref = spring.getBeanDefinitionNames();
		System.out.println(ref);
		
		Temple str = spring.getBean(Temple.class);
		System.out.println(str.hashCode());
		
		Bakery str1 = spring.getBean("bakery", Bakery.class);
		System.out.println(str1);
		
		Furniture str2 = spring.getBean(Furniture.class);
		System.out.println(str2);
		
		MetroStation str3 = spring.getBean(MetroStation.class);
		System.out.println(str3);
		
		Mirror str4 = spring.getBean(Mirror.class);
		System.out.println(str4);
		
		System.out.println("===============================================");
		
		Boolean[] values = {false, true, false, true, false};
		System.out.println(Arrays.toString(values));
		
		System.out.println("===============================================");
		
		Double[] db = {12.2, 32.5, 223.53, 122.2, 198D};
		System.out.println(Arrays.toString(db));
		
		System.out.println("================================================");
		
		List<String> lst = new ArrayList<String>();
		lst.add("Kantara");
		lst.add("KGF");
		lst.add("GG");
		lst.add("Googly");
		lst.add("Kranthi");
		System.out.println(lst);
		
		
		System.out.println("=================================================");
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("Lucky", 113);
		map.put("Sampathige Saval", 123);
		map.put("Milana", 117);
		map.put("Love Mocktail", 107);
		map.put("Dia", 127);
		System.out.println(map);
		
		
		
		
	}

}
