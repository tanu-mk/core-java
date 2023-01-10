package com.xworkz.spring.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.spring.configuration.SpringConfiguration;
import com.xworkz.spring.thing.Application;
import com.xworkz.spring.thing.Area;
import com.xworkz.spring.thing.Bus;
import com.xworkz.spring.thing.Chocolate;
import com.xworkz.spring.thing.City;
import com.xworkz.spring.thing.Cycle;
import com.xworkz.spring.thing.Fish;
import com.xworkz.spring.thing.Girl;
import com.xworkz.spring.thing.God;
import com.xworkz.spring.thing.Mall;
import com.xworkz.spring.thing.Mask;
import com.xworkz.spring.thing.Milk;
import com.xworkz.spring.thing.Park;
import com.xworkz.spring.thing.Patient;
import com.xworkz.spring.thing.Road;
import com.xworkz.spring.thing.Temple;

public class Runner {
	
	public static void main(String[] args) {
		
		ApplicationContext spring1 = new AnnotationConfigApplicationContext(SpringConfiguration.class);
		
		Road ref1 = spring1.getBean(Road.class);
		System.out.println(ref1);
		
		Bus ref2 = spring1.getBean(Bus.class);
		System.out.println(ref2);
		

		Application ref3 = spring1.getBean(Application.class);
		System.out.println(ref3);
		

		Area ref4 = spring1.getBean(Area.class);
		System.out.println(ref4);
		

		Chocolate ref5 = spring1.getBean(Chocolate.class);
		System.out.println(ref5);
		

		City ref6 = spring1.getBean(City.class);
		System.out.println(ref6);
		

		Cycle ref7 = spring1.getBean(Cycle.class);
		System.out.println(ref7);
		

		Fish ref8 = spring1.getBean(Fish.class);
		System.out.println(ref8);
		

		Girl ref9 = spring1.getBean(Girl.class);
		System.out.println(ref9);
		

		God ref10 = spring1.getBean(God.class);
		System.out.println(ref10);
		

		Mall ref11 = spring1.getBean(Mall.class);
		System.out.println(ref11);
		

		Mask ref12 = spring1.getBean(Mask.class);
		System.out.println(ref12);
		

		Milk ref14 = spring1.getBean(Milk.class);
		System.out.println(ref14);
		

		Park ref15 = spring1.getBean(Park.class);
		System.out.println(ref15);
		

		Patient ref16 = spring1.getBean(Patient.class);
		System.out.println(ref16);
		

		Temple ref17 = spring1.getBean(Temple.class);
		System.out.println(ref17);
		

		Application ref18 = spring1.getBean(Application.class);
		System.out.println(ref18);
		

		
		
	}

}
