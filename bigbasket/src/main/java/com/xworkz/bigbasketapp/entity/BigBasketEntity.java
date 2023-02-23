package com.xworkz.bigbasketapp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "egg.bigbasket_info")
public class BigBasketEntity {
	
	@Id
	@Column(name = "bigbasket_id")
	private int id;
	
	@Column(name = "bigbasket_firstName")
	private String firstName;
	
	@Column(name = "bigbasket_lastName")
	private String lastName;
	
	@Column(name = "bigbasket_area")
	private String area;
	
	@Column(name = "bigbasket_email")
	private String email;
	
	@Column(name = "bigbasket_contactNumber")
	private long contactNumber;
	
	@Column(name = "bigbasket_password")
	private String password;
	
	@Column(name = "bigbasket_itemList")
	private String itemList;
	
	@Column(name = "bigbasket_takeAway")
	private String takeAway;
	
	
	
	

}
