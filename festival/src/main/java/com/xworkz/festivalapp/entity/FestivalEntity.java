package main.java.com.xworkz.festivalapp.entity;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@Table(name = "egg.festival_info")
@NamedQuery(name = "findByIdAndName" , query = "select table from FestivalEntity table where table.id = :i  and table.name = :n")
@NamedQuery(name = "findByNameAndRegionAndMainGod" , query = "select ft from FestivalEntity ft where ft.name = :n  and ft.region = :r  and ft.mainGod = :g")
@NamedQuery(name = "findByMainGod" , query = "select ft from FestivalEntity ft where ft.mainGod = :m ")
@NamedQuery(name = "findTotalDaysByName" , query = "select ft.totalDays from FestivalEntity ft where ft.name = :tn ")
@NamedQuery(name = "findRegionAndMainGodByNameAndId" , query = "select ft.region, ft.mainGod from FestivalEntity ft where ft.name = :n and ft.id = :i ")
@NamedQuery(name = "findMainGodAndTotalDaysByName", query = "select ft.mainGod, ft.totalDays from FestivalEntity ft where ft.name = :p")
@NamedQuery(name = "findTotal" , query = "select count(ft) from FestivalEntity ft")
@NamedQuery(name = "findMaxTotalDays" , query = "select max(ft.totalDays) from FestivalEntity ft")
public class FestivalEntity {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "festival_id")
	private Integer id;
	
	@Column(name = "festival_name")
	private String name;
	
	@Column(name = "festival_region")
	private String region;
	
	@Column(name = "festival_sweet")
	private String sweet;
	
	@Column(name = "festival_mainGod")
	private String mainGod;
	
	@Column(name = "festival_totalDays")
	private Integer totalDays;
	
	
	public FestivalEntity(String name, String region, String sweet, String mainGod, Integer totalDays) {
		super();
		
		this.name = name;
		this.region = region;
		this.sweet = sweet;
		this.mainGod = mainGod;
		this.totalDays = totalDays;
	}
	
	
	
	
	

}
