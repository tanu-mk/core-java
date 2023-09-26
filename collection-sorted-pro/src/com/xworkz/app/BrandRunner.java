package com.xworkz.app;

import java.util.Collection;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.xworkz.app.dto.BrandDto;

public class BrandRunner {
	
	public static void main(String[] args) {

		BrandDto brandDto1=new BrandDto("adidas", "shorts", 299D);
		BrandDto brandDto2=new BrandDto("nike", "track", 1299D);
		BrandDto brandDto3=new BrandDto("puma", "tshirt", 2299D);
		BrandDto brandDto4=new BrandDto("reebok", "jacket", 12299D);
		List<BrandDto> list=new LinkedList<BrandDto>();
		Collection<BrandDto> brandDtos= Stream
				.of(brandDto1,brandDto2,brandDto3,brandDto4)
				.collect(Collectors.toList());
				brandDtos.stream().sorted().forEach(d->System.out.println(d));
        System.out.println(System.lineSeparator());

        Comparator<BrandDto> comparator=(p1,p2)->Double.compare(p2.getPrice(), p1.getPrice());
        brandDtos.stream().forEach(ele->System.out.println(ele));


	}

}
