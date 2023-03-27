package com.xworkz.app.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "egg.tourist_info")
@NamedQuery(name = "findByDestination" , query ="select mp from TouristEntity mp where mp.destination = :d")
@NamedQuery(name = "list" , query = "select ent from TouristEntity ent")
@NamedQuery(name = "searchByTwoProperties", query = "select ent from TouristEntity ent where ent.destination = :d or ent.state = :s")
public class TouristEntity {
	
	@Id
	@Column(name = "tourist_id")
	private int id;
	
	@Column(name = "tourist_destination")
	private String destination;
	
	@Column(name = "tourist_kilometers")
	private Double kilometers;
	
	@Column(name = "tourist_state")
	private String state;
	
	@Column(name = "tourist_famousFor")
	private String famousFor;
	
	@Column(name = "tourist_bestTimeToVisit")
	private String bestTimeToVisit;
	
	
	
	
	
	

}
