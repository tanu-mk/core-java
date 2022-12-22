package com.xworkz.damapp;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Dam {
	
	public static void main(String[] args) {
		
		Collection<String> karnataka = new ArrayList<String>();
		karnataka.add("Tungabadra");
		karnataka.add("Sharavathi");
		karnataka.add("Hemavathi");
		karnataka.add("KrishnaRajaSagara");
		
		Collection<String> tamilNadu = new ArrayList<String>();
		tamilNadu.add("Mettur");
		tamilNadu.add("BhavaniSagar");
		tamilNadu.add("Vaigai");
		tamilNadu.add("Amaravathi");
		
		Collection<String> kerala = new ArrayList<String>();
		kerala.add("Mullaperiyar");
		kerala.add("Parambikulam");
		kerala.add("Idukki");
		kerala.add("Pothundi");
		
		Collection<String> andraPradesh = new ArrayList<String>();
		andraPradesh.add("Chitravathi");
		andraPradesh.add("Cumbum");
		andraPradesh.add("Dharmavaram");
		andraPradesh.add("Donkarai");
		
		Collection<String> telangana = new ArrayList<String>();
		telangana.add("Singur");
		telangana.add("Nizam Sagar");
		telangana.add("Sriram Sagar");
		telangana.add("Sadarmat");
		
		Collection<String> goa = new ArrayList<String>();
		goa.add("Ustem");
		goa.add("Salaulim");
		goa.add("Amthane");
		goa.add("Anjunem");
		
		Collection<String> maharashtra = new ArrayList<String>();
		maharashtra.add("Koyna");
		maharashtra.add("Walwan");
		maharashtra.add("Warna");
		maharashtra.add("Bhivpuri");
		
		Collection<String> madyaPradesh = new ArrayList<String>();
		madyaPradesh.add("Indra Sagar");
		madyaPradesh.add("Adampura");
		madyaPradesh.add("Adner");
		madyaPradesh.add("Agar Agari");
		
		Collection<String> chhattisgarh = new ArrayList<String>();
		chhattisgarh.add("Minimata");
		chhattisgarh.add("Adpather");
		chhattisgarh.add("Agariya");
		chhattisgarh.add("Ajabnagar");
		
		Collection<String> arunachalPradesh = new ArrayList<String>();
		arunachalPradesh.add("Ranganadi");
		arunachalPradesh.add("Subansiri");
		arunachalPradesh.add("Dibang");
		arunachalPradesh.add("Lamp Camp");
		
		Collection<String> assam = new ArrayList<String>();
		assam.add("Karbi Langpi");
		assam.add("Umrong");
		assam.add("Kopili");
		
		Collection<String> bihar  = new ArrayList<String>();
		bihar.add("Ajan");
		bihar.add("Amrity");
		bihar.add("Barnar");
		
		
		Collection<String> gujarat  = new ArrayList<String>();
		gujarat.add("Sardar sarovar");
		gujarat.add("Dharoi");
		gujarat.add("Ukai");
		
		
		Collection<String> haryana  = new ArrayList<String>();
		haryana.add("Ottu");
		haryana.add("Anagpur");
		haryana.add("Tajewala");
		
		
		Collection<String> himachalPradesh = new ArrayList<String>();
		himachalPradesh.add("Bassi");
		himachalPradesh.add("Bhakra");
		himachalPradesh.add("Chamera");
		
		
		Collection<String> jharkhand = new ArrayList<String>();
		jharkhand.add("Amanat");
		jharkhand.add("Anraj");
		jharkhand.add("Anjanwa");
		
		
		Collection<String> manipur  = new ArrayList<String>();
		manipur.add("Singda");
		manipur.add("Khoupum");
		manipur.add("Maphou");
		
		
		Collection<String> meghalaya  = new ArrayList<String>();
		meghalaya.add("Khandong");
		meghalaya.add("Mawphlang");
		meghalaya.add("Kyrdemkulai");
		
		
		Collection<String> mizoram  = new ArrayList<String>();
		mizoram.add("Tuirial");
		mizoram.add("Bairabi");
		mizoram.add("Serlui");
		
		
		
		Collection<String> nagaland = new ArrayList<String>();
		nagaland.add("Doyang");
		nagaland.add("Brahmaputra");
		nagaland.add("Wokha");
		
		
		Collection<String> odisha  = new ArrayList<String>();
		odisha.add("Alubani");
		odisha.add("Aradei");
		odisha.add("Badabandha");
		
		
		Collection<String> punjab = new ArrayList<String>();
		punjab.add("Chohal");
		punjab.add("Damsal");
		punjab.add("Dholbaha");
		
		
		Collection<String> rajasthan= new ArrayList<String>();
		rajasthan.add("RanaPratap");
		rajasthan.add("Mashi");
		rajasthan.add("Jawai");
		
		
		Collection<String> sikkim = new ArrayList<String>();
		sikkim.add("Rangpo");
		sikkim.add("Rongli");
		sikkim.add("Teesta");
		
		
		Collection<String> tripura  = new ArrayList<String>();
		tripura.add("Dumboor");
		tripura.add("Gumti Hydro");
		tripura.add("Amarpur");
		
		
		Collection<String> uttarPradesh  = new ArrayList<String>();
		uttarPradesh.add("Rihand");
		uttarPradesh.add("Tehri");
		uttarPradesh.add("Rajghat");
		
		
		Collection<String> uttarakhand = new ArrayList<String>();
		uttarakhand.add("Tehri");
		uttarakhand.add("Haripura");
		uttarakhand.add("Bhalu");
		
		
		Collection<String> westBengal  = new ArrayList<String>();
		westBengal.add("Farakka");
		westBengal.add("Koyna");
		westBengal.add("Nagarjuna Sagar");
		
		
		Collection<String> allStateDams = new ArrayList<String>();
		allStateDams.addAll(karnataka);
		allStateDams.addAll(tamilNadu);
		allStateDams.addAll(kerala);
		allStateDams.addAll(andraPradesh);
		allStateDams.addAll(westBengal);
		allStateDams.addAll(rajasthan);
		allStateDams.addAll(mizoram);
		allStateDams.addAll(manipur);
		allStateDams.addAll(arunachalPradesh);
		allStateDams.addAll(madyaPradesh);
		allStateDams.addAll(himachalPradesh);
		allStateDams.addAll(assam);
		allStateDams.addAll(nagaland);
		allStateDams.addAll(jharkhand);
		allStateDams.addAll(odisha);
		allStateDams.addAll(gujarat);
		allStateDams.addAll(uttarakhand);
		allStateDams.addAll(tripura);
		allStateDams.addAll(sikkim);
		allStateDams.addAll(punjab);
		allStateDams.addAll(meghalaya);
		allStateDams.addAll(haryana);
		allStateDams.addAll(telangana);
		allStateDams.addAll(goa);
		allStateDams.addAll(maharashtra);
		allStateDams.addAll(bihar);
		allStateDams.addAll(chhattisgarh);
		allStateDams.addAll(uttarPradesh);
		
		
		System.out.println("Dams in India: " + allStateDams);
		
		System.out.println("=============================================");
		
		Iterator<String> dam1 = allStateDams.iterator();
		while(dam1.hasNext()) {
			 String str1 = dam1.next();
			 	if(str1.startsWith("T")) {
			 		System.out.println("Dams starting with T: "+ str1);
			 	}
		}
		
		System.out.println("=============================================");
		
		Iterator<String> dam2 = allStateDams.iterator();
		while(dam2.hasNext()) {
			String str2 = dam2.next();		
				if(str2.endsWith("ra")) {
					System.out.println("Dams ending with ra: "+ str2);
				}
		}
		
		System.out.println("=============================================");
		
		System.out.println("Size before removing " + allStateDams.size());
		boolean removed = allStateDams.remove("Parambikulam");
		System.out.println(removed);
		boolean removed1 = allStateDams.remove("Chohal");
		System.out.println(removed1);
		System.out.println("Size after removing " + allStateDams.size());
		
		System.out.println("=============================================");
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
