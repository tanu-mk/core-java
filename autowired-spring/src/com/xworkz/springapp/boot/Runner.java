package com.xworkz.springapp.boot;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.springapp.beans.HardwareShop;
import com.xworkz.springapp.beans.OrderedItem;
import com.xworkz.springapp.beans.Pencil;
import com.xworkz.springapp.beans.Rubber;
import com.xworkz.springapp.beans.Software;
import com.xworkz.springapp.beans.SoftwareEngineering;
import com.xworkz.springapp.configuration.SpringConfiguration;

public class Runner {
	
	public static void main(String[] args) {
		
		ApplicationContext container = new AnnotationConfigApplicationContext(SpringConfiguration.class);
		String[] bean = container.getBeanDefinitionNames();
		System.out.println(Arrays.toString(bean));
		
		HardwareShop refOfHardwareShop = container.getBean(HardwareShop.class);
		System.out.println(refOfHardwareShop);
		
		System.out.println("======================================================");
		
		Software refOfSoftware = container.getBean(Software.class);
		System.out.println(refOfSoftware);
		
		System.out.println("======================================================");
		
		SoftwareEngineering refOfSoftwareEngineering = container.getBean(SoftwareEngineering.class);
		System.out.println(refOfSoftwareEngineering);
		
		System.out.println("======================================================");
		
		Pencil refOfPencil = container.getBean(Pencil.class);
		System.out.println(refOfPencil);
		
		System.out.println("======================================================");
		
		Rubber refOfRubber = container.getBean(Rubber.class);
		System.out.println(refOfRubber);
		
		System.out.println("======================================================");
		
		OrderedItem refOfItem = container.getBean(OrderedItem.class);
		System.out.println(refOfItem);
		
		
		
	}

}
