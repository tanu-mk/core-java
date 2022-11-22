package com.xworkz.encapsulationapp;

import com.xworkz.encapsulationapp.classfiles.TvChannelsDTO;

public class TvChannelsTester {
	
	public static void main(String t[]) {
		
		TvChannelsDTO tv = new TvChannelsDTO();
		tv.setNoOfKannadaChannels(75);
		System.out.println(tv.getNoOfKannadaChannels());
		
		tv.setTotalNoOfChannels(398);
		System.out.println(tv.getTotalNoOfChannels());
		
		
	}

}
