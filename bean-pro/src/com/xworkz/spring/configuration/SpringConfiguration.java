package com.xworkz.spring.configuration;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.xworkz.spring.bean.Actor;
import com.xworkz.spring.bean.Rocket;
//import com.xworkz.spring.boot.Season;
import com.xworkz.spring.bean.Season;

@Configuration
@ComponentScan("com.xworkz.spring")
public class SpringConfiguration {
	
	@Bean
	public Actor actorFilm() {
		System.out.println("Registering  another Actor through film name");
		Actor actor = new Actor("Yash", "Kannda", 46);
		return actor;
	}
	
	@Bean
	public Rocket anotherRocket() {
		System.out.println("Registering another Rocket through Spring");
		Rocket rocket = new Rocket();
		return rocket;
	}
	
	@Bean
	public Season anotherSeason() {
		System.out.println("Registering another season through spring");
		Season season = new Season();
		return season;
	}

}
