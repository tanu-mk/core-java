package com.xworkz.inheritanceapp;

import com.xworkz.inheritanceapp.Base.SearchEngine;

public class SearchEngineTester {
	
	public static void main(String t[]) {
	
	SearchEngine search = new SearchEngine();
	search.toSearchInformation("Bing","Trackable results" );
	
	
	SearchEngine search2 = new SearchEngine();
	search2.toSearchInformation("Baidu","Sustainable clicks" );
	

}
}