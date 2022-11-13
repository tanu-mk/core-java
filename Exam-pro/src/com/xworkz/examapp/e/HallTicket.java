package com.xworkz.examapp.e;

public class HallTicket {
	
	private String candidateName;
	private String subjectNames[];
	private String usnNo;
	private String universityName;
	
	public HallTicket() {
		
		System.out.println("Hall Ticket constructor is invoked");
	}
	
	
	
	public HallTicket(String candidateName, String subjectNames[], String usnNo, String universityName) {
		
	this.candidateName = candidateName;
	this.subjectNames = subjectNames;
	this.usnNo = usnNo;
	this.universityName = universityName;
		
	}
	
	public void displayDetails() {
		
		System.out.println("Candidate name is: "+ this.candidateName);
		System.out.println("University name is: "+ this.universityName);
		System.out.println("Candidate usn is: "+ this.usnNo);
		
		System.out.println("List of Subjects are: ");
		
		for(int i=0; i<subjectNames.length; i++) {
			System.out.println(subjectNames[i]);
		}
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
