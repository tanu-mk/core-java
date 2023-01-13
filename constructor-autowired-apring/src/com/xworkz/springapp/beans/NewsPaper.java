package com.xworkz.springapp.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class NewsPaper {
	
	@Autowired
	private int id;
	private String name;
	private String ownerName;
	@Autowired
	@Qualifier("newsPaperLanguage")
	private String language;
	private double price;
	
	
	//@Autowired(optional)
	public NewsPaper(@Qualifier("newsPaperName")String name, @Qualifier("newsPaperOwnerName")String ownerName) {
		super();
		this.name = name;
		this.ownerName = ownerName;
	}
	
	
	public double getPrice() {
		return price;
	}

	@Autowired
	public void setPrice(double price) {
		this.price = price;
	}


	@Override
	public String toString() {
		return "NewsPaper [id=" + id + ", name=" + name + ", ownerName=" + ownerName + ", language=" + language
				+ ", price=" + price + "]";
	}



	
	
	

}
