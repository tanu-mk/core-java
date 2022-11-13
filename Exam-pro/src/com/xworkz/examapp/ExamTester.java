package com.xworkz.examapp;

import com.xworkz.examapp.e.Exam;
import com.xworkz.examapp.e.HallTicket;

public class ExamTester {

	
	public static void main(String t[]) {
		
		String subjectNames[] = {"OS", "m1", "hd", "vlsi"};
		
		HallTicket hallTicket = new HallTicket("Priya", subjectNames, "18CS0007", "Dabba Vtu");
		
		Exam exam = new Exam();
		exam.fees = 1200;
		
		boolean isAllowed = exam.allow(hallTicket);
		
		System.out.println("Allowed to write a exam: "+ isAllowed);
		
		
		
		HallTicket hallTicket1 = new HallTicket("Anu",subjectNames, "18CS00065", "Dabba VTU");
		
		Exam exam1 = new Exam();
		exam1.fees = 1300;
		
		 boolean isAllowed1 = exam1.allow(hallTicket1);	
		 
		 System.out.println("Allowed to write the exam "+ isAllowed1);
		
		
		
		
		
		
	}
}