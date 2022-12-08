package com.xworkz.showroomapp;

import java.util.Scanner;

import com.xworkz.showroomapp.constant.Gender;
import com.xworkz.showroomapp.manager.Manager;
import com.xworkz.showroomapp.showroom.Showroom;

public class ShowroomTester {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size");
		int size = sc.nextInt();
		Showroom room = new Showroom(size);
		
		
		//Read
		
	for(int i=0; i<size; i++) {
		Manager manager = new Manager();
		
		System.out.println("Enter manager name");
			manager.setName(sc.next());
			
		System.out.println("Enter manager id");
			manager.setId(sc.nextInt());
			
		System.out.println("Enter manager gender");
			//String gender = sc.next();
		manager.setGender(Gender.valueOf(sc.next()));
		
		System.out.println("Enter manager address");
			manager.setAddress(sc.next());
			
		System.out.println("Enter manager blood group");
			manager.setBloodGroup(sc.next());
		
		room.addManagers(manager);
		
	}	
		
	
		//update
	
		room.getAllManagers();
	
		System.out.println("Enter the Manager address");
			room.getManagerNameByAddress(sc.next());
		
		System.out.println("Enter the updated address of manager");
			String name = sc.next();
			String address = sc.next();
		room.updateManagerAddressByName(name, address);	
		
		room.getAllManagers();
		
		
		
		// delete
		

		System.out.println("Enter the manager name u want to delete");
		String Name = sc.next();
		
		room.deleteManagerByName(Name);
		
		room.getNewAllManagers();
		
		
		
		
		
		
		
	}

}
