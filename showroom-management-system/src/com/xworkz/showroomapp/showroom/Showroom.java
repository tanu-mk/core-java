package com.xworkz.showroomapp.showroom;

import com.xworkz.showroomapp.manager.Manager;

public class Showroom extends Manager{
	
	public Manager managers[];
	public int index;
	public Manager newManagers[];
	
	public Showroom(int size) {
		
		managers = new Manager[size];
		
	}
	
	
	public boolean addManagers(Manager anotherManager) {
		
		boolean isManagerAdded = false;
		
			if(anotherManager != null) {
				System.out.println("Manager is added");	
				managers[index++] = anotherManager;
				isManagerAdded = true;
			}
		
			return isManagerAdded;
		}

		
	public void getAllManagers() {
		
		for(int i=0; i<managers.length; i++) {
			
			System.out.println(managers[i].getName() + " "+ managers[i].getId() + " "+ managers[i].getGender() +" "+ managers[i].getAddress() + " "+ managers[i].getBloodGroup());
		}
	}
		
	
	public void getManagerNameByAddress(String newAddress) {
		System.out.println("Inside getManagerNameByAddress");
		
			for(int j=0; j<managers.length; j++) {
				
				if(managers[j].getAddress().equals(newAddress))
					System.out.println(managers[j].getName() + " "+ managers[j].getId() + " "+ managers[j].getGender() +" "+ managers[j].getAddress() + " "+ managers[j].getBloodGroup());
					
				else {
					System.out.println("Anthavru yaru ella sumne hoge");
				}
			}
		
	}
	
	
	public boolean updateManagerAddressByName(String newName, String newAddress) {
		
		boolean isUpdated = false;
		
		for(int j=0; j<managers.length; j++) {
				
				if(managers[j].getName().equals(newName)) {
					System.out.println("Updated version of address");
					managers[j].setAddress(newAddress);
					return true;
				}
			}
		
		return isUpdated;
		
	}
		
		
	public boolean deleteManagerByName(String newName) {
		
		boolean isDeleted = false;
		
			 newManagers = new Manager[managers.length-1];
			 	for(int j=0 , h=0; j<managers.length; j++) {
				 
			 		if(!managers[j].getName().equals(newName))
			 			newManagers[h] = managers[j];
			 			h++;
			 			return true;
			 }
			
		return isDeleted;
	}
		
	
	public void getNewAllManagers() {
		
		for(int i=0; i<newManagers.length; i++) {
			
			System.out.println(newManagers[i].getName() + " "+ newManagers[i].getId() + " "+ newManagers[i].getGender() +" "+ newManagers[i].getAddress() + " "+ newManagers[i].getBloodGroup());
		}
	}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}


