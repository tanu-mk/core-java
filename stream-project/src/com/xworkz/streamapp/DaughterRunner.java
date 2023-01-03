package com.xworkz.streamapp;

import java.util.ArrayList;
import java.util.Collection;

import com.xworkz.streamapp.dto.DaughterDTO;

public class DaughterRunner {
	
	public static void main(String[] args) {
		
		Collection<DaughterDTO> daughter = new ArrayList();
		daughter.add(new DaughterDTO("Priya", 89089089089L, 20, true ));
		daughter.add(new DaughterDTO("Anu", 89085689089L, 24, true ));
		daughter.add(new DaughterDTO("Shritha", 89087789089L, 27, true ));
		
	}

}
