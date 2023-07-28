package com.xworkz.excel.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name = "Tutorial")
public class Tutorial {
	
	  @Id
	  @Column(name = "id")
	  private long id;

	  @Column(name = "title")
	  private String title;

	  @Column(name = "description")
	  private String description;

	  @Column(name = "published")
	  private boolean published;


}
