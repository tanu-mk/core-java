package com.xworkz.eggapp.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "egg.egg_table")
public class EggDto {

	@Id
	@Column(name = "egg_id")
	private int id;
	
	@Column(name = "egg_hotelname")
	private String hotelName;
	
	@Column(name = "egg_type")
	private String eggType;
	
	@Column(name = "egg_dishname")
	private String eggDishName;
	
	@Column(name = "egg_price")
	private double price;
	
	@Column(name = "egg_quantity")
	private int quantity;
	
	@Column(name = "egg_takeaway")
	private String takeAway;
	
	
	
	
}
