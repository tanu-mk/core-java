package com.xworkz.inheritanceapp;

import com.xworkz.inheritanceapp.Base.RunMachine;

public class RunMachineTester {
	
	public static void main(String t[]) {
		
		RunMachine run = new RunMachine();
		run.toRun("Dravid");
		
		RunMachine run8 = new RunMachine();
		run8.toRun("Dhoni");
	}

}
