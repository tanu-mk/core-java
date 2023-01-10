package com.xworkz.spring.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.spring.bean.Actor;
import com.xworkz.spring.bean.Rocket;
import com.xworkz.spring.bean.Season;
import com.xworkz.spring.configuration.SpringConfiguration;

public class Runner {
	
	public static void main(String[] args) {
		
		
		ApplicationContext container = new AnnotationConfigApplicationContext(SpringConfiguration.class);
		
		System.out.println("Initializing Through Constructors");
		
		Actor actorRef = container.getBean( "actor", Actor.class);
		System.out.println(actorRef);
		System.out.println(actorRef.getName());
		System.out.println(actorRef.getLanguage());
		System.out.println(actorRef.getAge());
		
		Actor actorRefByMovie = container.getBean("actorFilm", Actor.class);
		System.out.println(actorRefByMovie);
		System.out.println(actorRefByMovie.getName());
		System.out.println(actorRefByMovie.getLanguage());
		System.out.println(actorRefByMovie.getAge());
		
		System.out.println("==========================================");
		
		System.out.println("Initializing Through Literals");
		
		Rocket rocketRef = container.getBean("rocket", Rocket.class);
		System.out.println(rocketRef);
		System.out.println(rocketRef.getName());
		System.out.println(rocketRef.getCountry());
		System.out.println(rocketRef.getBudget());
		
		Rocket anotherRocket = container.getBean("anotherRocket" , Rocket.class);
		System.out.println(anotherRocket);
		anotherRocket.setName("Falcon 9");
		System.out.println(anotherRocket.getName());
		anotherRocket.setCountry("USA");
		System.out.println(anotherRocket.getCountry());
		anotherRocket.setBudget(456);
		System.out.println(anotherRocket.getBudget());
		
		System.out.println("==========================================");
		
		
		System.out.println("Initializing Through Setters");
		
		Season seasonRef = container.getBean("season", Season.class);
		System.out.println(seasonRef);
		System.out.println(seasonRef.getName());
		System.out.println(seasonRef.getStartingMonth());
		System.out.println(seasonRef.getDuration());
		
		Season seasonRef1 = container.getBean("anotherSeason", Season.class);
		System.out.println(seasonRef1);
		seasonRef1.setName("Autumn");
		System.out.println(seasonRef1.getName());
		seasonRef1.setStartingMonth("August");
		System.out.println(seasonRef1.getStartingMonth());
		seasonRef1.setDuration(2);
		System.out.println(seasonRef1.getDuration());
		
		
		
		
	}

}
