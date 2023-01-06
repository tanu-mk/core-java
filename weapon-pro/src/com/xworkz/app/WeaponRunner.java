package com.xworkz.app;

import java.util.Collection;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.xworkz.app.constant.Type;
import com.xworkz.app.dto.WeaponDTO;

public class WeaponRunner {
	
	public static void main(String[] args) {
		
		WeaponDTO dto1 = new WeaponDTO("Bow and Arrow", "wood", 1896, 20.5, Type.Hunting);
		WeaponDTO dto2 = new WeaponDTO("Crossbow", "wood", 1776, 25.5, Type.Firing);
		WeaponDTO dto3 = new WeaponDTO("M4 Carbine", "metal", 1987, 30.5, Type.Firing);
		WeaponDTO dto4 = new WeaponDTO("Hand Gun", "metal", 1234, 24.5, Type.Firing);
		WeaponDTO dto5 = new WeaponDTO("Sniper rifle", "metal", 1764, 22.5, Type.Firing);
		WeaponDTO dto6 = new WeaponDTO("Revolver", "metal", 1342, 10.5, Type.Hunting);
		WeaponDTO dto7 = new WeaponDTO("Shotgun", "metal", 1464, 50.5, Type.Hunting);
		WeaponDTO dto8 = new WeaponDTO("Rocket", "metal", 1123, 20.5, Type.Firing);
		WeaponDTO dto9 = new WeaponDTO("Nuclear Bomb", "uranium", 1154, 33.5, Type.Firing);
		WeaponDTO dto10 = new WeaponDTO("Tanks", "metal", 1324, 54.5, Type.Fighting);
		WeaponDTO dto11 = new WeaponDTO("Missil", "metal", 1789, 65.5, Type.Fighting);
		WeaponDTO dto12 = new WeaponDTO("Canon", "wood", 1567, 13.5, Type.Hunting);
		WeaponDTO dto13 = new WeaponDTO("Spear", "metal", 1245, 53.5, Type.Hunting);
		WeaponDTO dto14 = new WeaponDTO("Pistul", "metal", 1945, 53.5, Type.Firing);
		WeaponDTO dto15 = new WeaponDTO("Sword", "metal", 1765, 63.5, Type.Fighting);
		WeaponDTO dto16 = new WeaponDTO("SubMachineGun", "metal", 1324, 14.5, Type.Hunting);
		WeaponDTO dto17 = new WeaponDTO("Riffle", "metal", 1654, 53.5, Type.Hunting);
		WeaponDTO dto18 = new WeaponDTO("Bomb", "chemicals", 1234, 63.5, Type.Firing);
		WeaponDTO dto19 = new WeaponDTO("Machine Gun", "metal", 1432, 74.5, Type.Fighting);
		WeaponDTO dto20 = new WeaponDTO("Axe", "wood", 1543, 75.5, Type.Firing);
		
		Collection<WeaponDTO> weaponDto = Stream
										  .of(dto1, dto2, dto3, dto4, dto5, dto6, dto7, dto8, dto9, dto10, dto11,
											 dto12, dto13, dto14, dto15, dto16, dto17, dto18, dto19, dto20)
										  .collect(Collectors.toList());
		
		
		
		//Find and print all weapons by price greater than
		weaponDto
		.stream()
		.filter(dto -> dto.getPrice() > 62.5)
		.collect(Collectors.toList())
		.forEach(dto -> System.out.println(" Weapons price greater than 62.5: " + dto));
		
		
		System.out.println("==================================================");
		
		//Find and Print All weapons made by and made on
		
		System.out.println("All weapons made by and made on");
		
		weaponDto
		.stream()
		.forEach(ele -> System.out.println(ele.getMadeBy() + " "+ ele.getMadeOn()));
		
		
		System.out.println("==================================================");		
		
		
		//find and print all weapons by name sorted in desc order
		System.out.println("weapons by name sorted in desc order");
		 weaponDto
		 .stream()
		 .sorted((a1, a2) -> a2.getName().compareTo(a1.getName()))
		 .forEach(str -> System.out.println(str));
		 
		 
		 System.out.println("==================================================");	
		 
		//print all weapons sort by made by
		 System.out.println(" weapons sort by madeBy");
		 weaponDto
		 .stream()
		 .sorted((a1, a2) -> a1.getMadeBy().compareTo(a2.getMadeBy()))
		 .forEach(ele -> System.out.println(ele));
		 
		
		 System.out.println("==================================================");
		 
		 
		 //print all weapons sort by made on
		 System.out.println(" weapons sort by madeOn");
		 weaponDto
		 .stream()
		 .sorted((a1, a2) -> a1.getMadeOn().compareTo(a2.getMadeOn()))
		 .forEach(ele -> System.out.println(ele));
		 
		 
		 System.out.println("==================================================");
		 
		 
		//print all weapons sort by price
		 System.out.println(" weapons sort by price");
		 weaponDto
		 .stream()
		 .sorted((a1, a2) -> a1.getPrice().compareTo(a2.getPrice()))
		 .forEach(ele -> System.out.println(ele));
		
		
		 System.out.println("==================================================");
		
		
		
		//print all weapons sort by price in desc
		 System.out.println(" weapons sort by price in desc");
		 weaponDto
		 .stream()
		 .sorted((a1, a2) -> a2.getPrice().compareTo(a1.getPrice()))
		 .forEach(ele -> System.out.println(ele));
		 
		 
		 
		 System.out.println("==================================================");
		
		
		//print all weapons sort by name and madeOn asc order
		 System.out.println("weapons sort by name and madeOn asc order");
		 weaponDto
		 .stream()
		 .sorted((a1, a2) -> a2.getName().compareTo(a1.getName()))
		 .sorted((t1, t2) -> t1.getMadeOn().compareTo(t2.getMadeOn()))
		 .forEach(ele -> System.out.println(ele.getName() + " - "+ ele.getMadeOn()));
		 
		 
		 System.out.println("==================================================");
		 
		  
		//print all weapons sort by type , madeBy, name in desc order
		 System.out.println("weapons sort by type, madeBy and name in desc order");
		 weaponDto
		 .stream()
		 .sorted((n1,n2)->(n2.getType().compareTo(n1.getType())))
	        .sorted((n1,n2)->(n2.getMadeBy().compareTo(n1.getMadeBy())))
	        .sorted((n1,n2)->(n2.getName().compareTo(n1.getName())))
	        .forEach(t->System.out.println(t.getType()+" - "+t.getMadeBy()+" - "+t.getName()));
		
		
	}

}
