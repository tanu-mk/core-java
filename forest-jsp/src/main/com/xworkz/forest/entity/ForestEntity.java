package com.xworkz.forest.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@Entity
@Table(name = "egg.forest_info")
@NamedQuery(name = "findByName" , query = "select gt from ForestEntity gt where gt.name = 'Bhadra'")
@NamedQuery(name= "findByNameAndStateAndArea" , query = "select gt from ForestEntity gt where gt.name = 'Bannerghatta' and gt.country = 'India' and gt.area = 765.9")
@NamedQuery(name = "findByCountry" , query = "select gt from ForestEntity gt where gt.country = 'Europe' ")
@NamedQuery(name = "findAreaByName" , query = "select gt.area from ForestEntity gt where gt.name = 'Dandeli'")
@NamedQuery(name = "findNameById" , query = "select gt.name from ForestEntity gt where gt.id = 7")
@NamedQuery(name = "findStateByNameAndArea" , query = "select gt.country from ForestEntity gt where gt.name = 'Nagarhole' and gt.area = 7453.98 ")
@NamedQuery(name = "findIdByNameAndState" , query = "select gt.id from ForestEntity gt where gt.name = 'Nilgiri' and gt.country = 'India' ")
@NamedQuery(name = "findMaxArea", query = "select max(gt.area) from ForestEntity gt")
@NamedQuery(name = "findCount" , query = "select count (gt) from ForestEntity gt")
public class ForestEntity {
	
	public ForestEntity() {
		super();
		
	}

	public ForestEntity(Integer id, String name, String type, Double area, String country) {
		super();
		this.id = id;
		this.name = name;
		this.type = type;
		this.area = area;
		this.country = country;
	}

	@Id
	@Column(name = "forest_id")
	private Integer id;
	
	@Column(name = "forest_name")
	private String name;
	
	@Column(name = "forest_type")
	private String type;
	
	@Column(name = "forest_area")
	private Double area;
	
	@Column(name = "forest_country")
	private String country; 

}
