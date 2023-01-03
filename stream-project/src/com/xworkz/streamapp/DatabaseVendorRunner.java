package com.xworkz.streamapp;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

import com.xworkz.streamapp.constant.Type;
import com.xworkz.streamapp.dto.DatabaseVendorDTO;

public class DatabaseVendorRunner {
	
	public static void main(String[] args) {
		
		Collection<DatabaseVendorDTO> database = new ArrayList();
		database.add(new DatabaseVendorDTO("DB2 Everyplace", "Suhas", "640GB", 170, Type.IBM));
		database.add(new DatabaseVendorDTO("Access", "Rahul", "1000GB", 70, Type.SQL));
		database.add(new DatabaseVendorDTO("Rdb", "Deepa", "1731GB", 100, Type.Microsoft));
		
		
		//DatabaseVendorDTO convert developedBy to upper case and print all the DTO
		database
		.stream()
		.map(dto -> dto.developedBy.toUpperCase())
		.collect(Collectors.toList())
		.forEach(ele -> System.out.println(ele));
		
		
		
		
		System.out.println("=========================================");
		
		//DatabaseVendorDTO where licenseCost is less than 100 and type SQL
		 database
		.stream()
		.filter(dto -> dto.licenseCost < 100 && dto.type == Type.SQL)
		.collect(Collectors.toList())
		.forEach(ele -> System.out.println(ele));
		
		System.out.println("=========================================");
		
		//Print all DatabaseVendorDTO types
		 database
		.stream()
		.map(dto -> dto.getType())
		.collect(Collectors.toList())
		.forEach(ele -> System.out.println(ele));
		
	}

}
