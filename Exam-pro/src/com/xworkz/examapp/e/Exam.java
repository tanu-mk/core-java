package com.xworkz.examapp.e;

public class Exam {
	
	public HallTicket hallTicket;
	public int fees;
	
	public Exam() {
		
		System.out.println("Exam constructor is invoked");
	}
	         
	public boolean allow(HallTicket hallTicket) {   //reference of another class
		
		boolean isAllowed = false;
		
		System.out.println("Inside allow method");
		
		System.out.println("fees paid is "+ this.fees);
		if(fees >= 1200) {
			System.out.println("fees is paid");
			
			if(hallTicket != null) {
				this.hallTicket = hallTicket;
				
				System.out.println("Details of Candidate Hallticket are");
					this. hallTicket.displayDetails();
					
				 isAllowed = true;
				
				System.out.println("All ticket is issued......U can write the exam");
			}
			
			else {
				
				System.out.println(" No Hallticket found");
			}
			
		
		}
			
			else {
				
				System.out.println("First pay the fees");
			}
		
			 return isAllowed;
			
		}
		
 }


  