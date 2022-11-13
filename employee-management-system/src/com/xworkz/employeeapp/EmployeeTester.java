package com.xworkz.employeeapp;

public class EmployeeTester {

	public static void main(String t[]) {

		Employee.companyName = "Amazon";
		Employee.companyAddress = "Sarjapur";

		Employee emp = new Employee("AWS123", "Anu", "A+");

		System.out.println("Employee deatils");
		System.out.println(emp.employeeId + " " + emp.employeeName + " " + emp.bloodGroup);
		System.out.println(Employee.companyName);
		System.out.println(Employee.companyAddress);

		Employee emp1 = new Employee("AWS12456", "Manu", "O+");

		System.out.println("Employee deatils");
		System.out.println(emp1.employeeId + " " + emp1.employeeName + " " + emp1.bloodGroup);
		System.out.println(Employee.companyName);
		System.out.println(Employee.companyAddress);

		Employee emp2 = new Employee("AWS12", "Dhanu", "AB+");

		System.out.println("Employee deatils");
		System.out.println(emp2.employeeId + " " + emp2.employeeName + " " + emp2.bloodGroup);
		System.out.println(Employee.companyName);
		System.out.println(Employee.companyAddress);
	}

}










