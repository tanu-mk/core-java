package com.xworkz.spring.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.spring.configuration.SpringConfiguration;
import com.xworkz.spring.dto.FirstAidDto;
import com.xworkz.spring.dto.MicelleDto;
import com.xworkz.spring.dto.ResortDto;
import com.xworkz.spring.service.FirstAidService;
import com.xworkz.spring.service.MicelleService;
import com.xworkz.spring.service.ResortService;

public class Runner {

	public static void main(String[] args) {
		
		ApplicationContext container = new AnnotationConfigApplicationContext(SpringConfiguration.class);
		
		FirstAidService service1 = container.getBean(FirstAidService.class);
		boolean saved1 = service1.validateAndSave(new FirstAidDto());
		System.out.println("Saved " + saved1);
		
		System.out.println(System.lineSeparator());
		
		MicelleService service2 = container.getBean(MicelleService.class);
		boolean saved2 = service2.validateAndSave(new MicelleDto());
		System.out.println("Saved " + saved2);
		
		System.out.println(System.lineSeparator());
		
		ResortService service3 = container.getBean(ResortService.class);
		boolean saved3 = service3.validateAndSave(new ResortDto());
		System.out.println("Saved " + saved3);

	}

}
