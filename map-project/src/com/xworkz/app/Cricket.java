package com.xworkz.app;

import java.util.HashMap;
import java.util.Map;

public class Cricket {

	public static void main(String[] args) {
		
		Map<String, Integer> cricketAndScoresMap = new HashMap<String, Integer>();
		cricketAndScoresMap.put("M S Dhoni", 6767);
		cricketAndScoresMap.put("Sachin Tendulkar",6733);
		cricketAndScoresMap.put("Dravid", 7734);
		cricketAndScoresMap.put("Hardik Pandya", 4533);
		cricketAndScoresMap.put("Yuvraj Singh", 5573);
		
		System.out.println("Remove an entry if total runs less than 6000");
		cricketAndScoresMap.forEach((ele1, ele2) -> {
									if(ele2 < 6000) {
										System.out.println(cricketAndScoresMap.remove(ele1 + ele2));
									}
		});
		
		System.out.println("================================");
		
		System.out.println("Sort in desc order");

	}

}
