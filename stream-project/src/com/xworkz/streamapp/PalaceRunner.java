package com.xworkz.streamapp;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

import com.xworkz.streamapp.dto.PalaceDTO;

public class PalaceRunner {
	
	public static void main(String[] args) {
		
		Collection<PalaceDTO> palace = new ArrayList();
		palace.add(new PalaceDTO("Leela Palace", "Old Airport Road", true, 300 ));
		palace.add(new PalaceDTO("Mysuru Palace", "Mysuru", false, 250 ));
		palace.add(new PalaceDTO("Bangalore Palace", "Bangalore", false, 180 ));
		
		
		
		//Find all PalaceDTO which is not destroyed
		 palace
		.stream()
		.filter(dto -> !dto.isDestroyed())
		.collect(Collectors.toList())
		.forEach(ele -> System.out.println(ele));
		
		
		
	}

}
