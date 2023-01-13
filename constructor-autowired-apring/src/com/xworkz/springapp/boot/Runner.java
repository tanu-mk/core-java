package com.xworkz.springapp.boot;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.springapp.beans.Engine;
import com.xworkz.springapp.beans.Ghost;
import com.xworkz.springapp.beans.NewsPaper;
import com.xworkz.springapp.beans.Snake;
import com.xworkz.springapp.configuration.SpringConfiguration;

public class Runner {
	
	public static void main(String[] args) {
		
		ApplicationContext spring = new AnnotationConfigApplicationContext(SpringConfiguration.class); 
		  String[] beanNames = spring.getBeanDefinitionNames();
		  System.out.println(Arrays.toString(beanNames));
		  
		  NewsPaper refOfPaper = spring.getBean(NewsPaper.class);
		  System.out.println(refOfPaper);
		  System.out.println(refOfPaper.getPrice());
		  
		  Snake refOfSnake = spring.getBean(Snake.class);
		  System.out.println(refOfSnake);
		  
		  Engine refOfEngine = spring.getBean(Engine.class);
		  System.out.println(refOfEngine);
		  System.out.println(refOfEngine.getStrokes());
		  
		  Ghost refOfGhost = spring.getBean(Ghost.class);
		  System.out.println(refOfGhost);
		
	}

}
