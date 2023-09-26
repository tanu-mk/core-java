package com.xworkz.app.dto;

import java.io.Serializable;
import java.time.LocalDateTime;

public class MovieDto implements Serializable, Comparable<MovieDto> {
	
	
	private String name;
	private Double budget;
	private String language;
	private Double boxOffice;
	private LocalDateTime release;

	public MovieDto() {
		// TODO Auto-generated constructor stub
	}

	public MovieDto(String name, Double budget, String language, Double boxOffice, LocalDateTime release) {
		super();
		this.name = name;
		this.budget = budget;
		this.language = language;
		this.boxOffice = boxOffice;
		this.release = release;
	}

	@Override
	public String toString() {
		return "MovieDto [name=" + name + ", budget=" + budget + ", language=" + language + ", boxOffice=" + boxOffice
				+ ", release=" + release + "]";
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj!=null) {
			if(obj instanceof MovieDto) {
				MovieDto dto=(MovieDto) obj;
				if(dto.name.equals(this.name)) {
					System.out.println("name matches : "+dto);
				}
			}
		}
		return false;
	}

	@Override
	public int compareTo(MovieDto o) {
		return this.name.compareTo(o.name);
	}

	public String getName() {
		return name;
	}

	public Double getBudget() {
		return budget;
	}

	public String getLanguage() {
		return language;
	}

	public Double getBoxOffice() {
		return boxOffice;
	}

	public LocalDateTime getRelease() {
		return release;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setBudget(Double budget) {
		this.budget = budget;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public void setBoxOffice(Double boxOffice) {
		this.boxOffice = boxOffice;
	}

	public void setRelease(LocalDateTime release) {
		this.release = release;
	}
	
	
	

}
