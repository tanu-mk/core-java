package com.xworkz.employeeapp;

public class Employee {
	
	static public String companyName;
	static public String companyAddress;
	

	public String employeeId;
	public String employeeName;
	public String bloodGroup;
	
	
	//Default constructor
	public Employee() {
		
	}
	
	//Parameterised constructor
	public Employee(String empId , String nM , String bGroup) {
		employeeId = empId;          //this.employeeId = employeeId;
		employeeName = nM;           //this.employeeName = employeeName;
	    bloodGroup = bGroup;         //this.bloodGroup = bloodGroup;
		
	}
	
	public void toHelpOrgToGrow() {
		
		System.out.println("Namde Company");
	}
	
}
