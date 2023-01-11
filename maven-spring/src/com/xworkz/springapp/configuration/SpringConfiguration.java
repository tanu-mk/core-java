package com.xworkz.springapp.configuration;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.xworkz.springapp.thing.Bakery;
import com.xworkz.springapp.thing.Furniture;
import com.xworkz.springapp.thing.MetroStation;
import com.xworkz.springapp.thing.Mirror;
import com.xworkz.springapp.thing.Temple;


@Configuration
@ComponentScan("com.xworkz.springapp")
public class SpringConfiguration {
	
	@Bean
	public Temple temple() {
		System.out.println("Registering Temple with Spring.....");
		Temple string1 = new Temple();
		return string1;
	}
	
	
	@Bean
	public Bakery bakery1() {
		System.out.println("Registering Bakery with Spring.....");
		Bakery string2 = new Bakery();
		return string2;  
	}
	
	
	@Bean
	public Furniture furniture() {
		System.out.println("Registering Furniture with Spring......");
		Furniture str = new Furniture();
		return str;
	}
	
	@Bean
	public Mirror mirror() {
		System.out.println("Registering Mirror with Spring.....");
		Mirror mr = new Mirror();
		return mr;
	}
	
	@Bean
	public MetroStation metroStation() {
		System.out.println("Registering MetroStation with Spring....");
		MetroStation station = new MetroStation();
		return station;
	}



	@Bean
	public Boolean getBoolean() {
		System.out.println("Registering Boolean with spring....");
		Boolean ref = new Boolean(true);
		return ref;
	}
	
	
	public Double getDouble() {
		System.out.println("Registering Double with Spring.....");
		Double db = new Double(5);
		return db;
	}
	
	
	public List<String> getArrayList(){
		System.out.println("Registering ArrayList with Spring....");
		List<String> list = new ArrayList<String>();
		return list;
	}
	
	public Map<String, Integer> getMap(){
		System.out.println("Registering Map with Spring.....");
		Map<String, Integer> map = new HashMap<String, Integer>();
		return map;
		
	}
	
	





}
		
		
	
	


