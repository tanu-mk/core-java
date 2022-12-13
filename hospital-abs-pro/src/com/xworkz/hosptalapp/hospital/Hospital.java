package com.xworkz.hosptalapp.hospital;

import com.xworkz.hosptalapp.patient.Patient;

public interface Hospital{ 

	public boolean addPatients(Patient anotherPatient);
	
	public void getAllPatients();
	
	public void getPatientByName(String name);

}
