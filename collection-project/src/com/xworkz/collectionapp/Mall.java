package com.xworkz.collectionapp;

import java.util.Collection;
import java.util.Collections;
import java.util.TreeSet;

public class Mall {

	public static void main(String[] args) {
		
		String mall1 = "PVP square";
		String mall2 = "Trend Set";
		String mall3 = "CMR Central";
		String mall4 = "Texvalley";
		String mall5 = "Unity One";
		String mall6 = "Axis";
		String mall7 = "Pacific";
		String mall8 = "Metro junction";
		String mall9 = "Fun Republic";
		String mall10 = "Logix";
		String mall11 = "Worlds square";
		String mall12 = "Royal";
		String mall13 = "Pro zone";
		String mall14 = "Select city walk";
		String mall15 = "Vigas";
		String mall16 = "Quest";
		String mall17 = "Mani square";
		String mall18 = "Acropolis";
		String mall19 = "MGF";
		String mall20 = "IN orbit";
		String mall21 = "City centre";
		String mall22 = "Grand vence";
		String mall23 = "Esplanande one";
		String mall24 = "Viviana";
		String mall25 = "VR Punjab";
		String mall26 = "South city";
		String mall27 = "Magneto";
		String mall28 = "Elanta";
		String mall29 = "R city";
		String mall30 = "Amanora";
		String mall31 = "world trade park";
		String mall32 = "Ambience";
		String mall33 = "DB City";
		String mall34 = "DLF";
		String mall35 = "LuLu";
		String mall36 = "GT";
		String mall37 = "Mantri square";
		String mall38 = "Nexas";
		String mall39 = "Orion";
		String mall40 = "Garuda";
		
		//class which extends interface
		Collection<String> collection  = new TreeSet();
		
		collection.add(mall40);
		collection.add(mall39);
		collection.add(mall38);
		collection.add(mall37);
		collection.add(mall36);
		collection.add(mall35);
		collection.add(mall34);
		collection.add(mall33);
		collection.add(mall32);
		collection.add(mall31);
		collection.add(mall30);
		collection.add(mall29);
		collection.add(mall28);
		collection.add(mall27);
		collection.add(mall26);
		collection.add(mall25);
		
	
		System.out.println(collection.size());
		
		collection.clear();
		
		System.out.println("After clear method..........");
		System.out.println(collection.size());
		
		
	}
	
}
