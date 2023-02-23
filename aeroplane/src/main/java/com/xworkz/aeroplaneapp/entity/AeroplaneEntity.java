package com.xworkz.aeroplaneapp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "egg.aeroplane_info")
public class AeroplaneEntity {
	@Id
	@Column(name = "aeroplane_id")
	private int id;
	
	@Column(name = "aeroplane_companyName")
	private String companyName;
	
	@Column(name = "aeroplane_planeName")
	private String planeName;
	
	@Column(name = "aeroplane_cost")
	private double cost;
	
	@Column(name = "aeroplane_type")
	private String type;
	
	@Column(name = "aeroplane_country")
	private String country;
	
	


}
