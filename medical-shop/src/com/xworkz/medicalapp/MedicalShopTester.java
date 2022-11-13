package com.xworkz.medicalapp;

import com.xworkz.medicalapp.MedicalShopTester;
import com.xworkz.medicalapp.medical.MedicalShop;


public class MedicalShopTester {
	
	public static void main(String t[]) {
		
		String staffNames[] = new String[3] ;
		staffNames[0] = "Narang";
		staffNames[1] = "Sarang";
		staffNames[2] = "Bajarang";
		
		long staffContactNo[] = new long[3] ;
		staffContactNo[0] = 8908908908l;
		staffContactNo[1] = 8908907577l;
		staffContactNo[2] = 7453826458l;
		
		String medicineNames[] = new String[3] ;
		medicineNames[0] = "Paracetamol";
		medicineNames[1] = "Dart";
		medicineNames[2] = "Citrozen";
	
		String cosmetics[] = new String[2] ;
		cosmetics[0] = "Nivea Bodylotion" ;
		cosmetics[1] = "Himalaya Lipcare" ;
		
		String billingMethod[] = new String[3] ;
		billingMethod[0] = "Cash";
		billingMethod[1] = "PhonePay" ; 
		billingMethod[2] = "Debit card";
		
	MedicalShop med = new MedicalShop("SNDTRB64835", "Marathahalli", "Apollo Pharmacy", staffNames,  
			                           staffContactNo, medicineNames, cosmetics , 8, billingMethod ) ;
	
	med.displayInfo() ; 

}
}


