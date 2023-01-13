package com.xworkz.springapp.beans;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Ghost {
	
	private int id;
	private String name;
	private String gender;
	private double age;
	private LocalDate birthDate;
	private LocalDate deathDate;
	private String color;
	private boolean isDangerous;
	private String type;
	private boolean isPhysicallyPresent;
	@Autowired
	@Qualifier("ghostEyeType")
	private String eyeType;
	@Autowired
	@Qualifier("ghostEyeColor")
	private String eyeColor;
	@Autowired
	@Qualifier("ghostIsItFrightening")
	private boolean isItFrightening;
	@Autowired
	@Qualifier("ghostCreatureFeature")
	private String creatureFeature;
	@Autowired
	@Qualifier("ghostMovieName")
	private String movieName;
	@Autowired
	@Qualifier("ghostNoOfSeries")
	private int noOfSeries;
	@Autowired
	@Qualifier("ghostCharaterName")
	private String characterName;
	@Autowired
	@Qualifier("ghostImaginaryCreature")
	private String imaginaryCreature;
	@Autowired
	@Qualifier("ghostSynonym")
	private String synonymOfGhost;
	@Autowired
	@Qualifier("ghostAntonym")
	private String antonymOfGhost;
	
	
	public Ghost(@Qualifier("ghostId")int id, @Qualifier("ghostName")String name, @Qualifier("ghostGender")String gender, @Qualifier("ghostAge")double age, @Qualifier("ghostBirthDate")LocalDate birthDate, @Qualifier("ghostDeathDate")LocalDate deathDate, @Qualifier("ghostColor")String color,
			@Qualifier("isGhostDangerous")boolean isDangerous, @Qualifier("ghostType")String type, @Qualifier("isGhostPhysicallyPresent")boolean isPhysicallyPresent) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.birthDate = birthDate;
		this.deathDate = deathDate;
		this.color = color;
		this.isDangerous = isDangerous;
		this.type = type;
		this.isPhysicallyPresent = isPhysicallyPresent;
	}


	@Override
	public String toString() {
		return "Ghost [id=" + id + ", name=" + name + ", gender=" + gender + ", age=" + age + ", birthDate=" + birthDate
				+ ", deathDate=" + deathDate + ", color=" + color + ", isDangerous=" + isDangerous + ", type=" + type
				+ ", isPhysicallyPresent=" + isPhysicallyPresent + ", eyeType=" + eyeType + ", eyeColor=" + eyeColor
				+ ", isItFrightening=" + isItFrightening + ", creatureFeature=" + creatureFeature + ", movieName="
				+ movieName + ", noOfSeries=" + noOfSeries + ", characterName=" + characterName + ", imaginaryCreature="
				+ imaginaryCreature + ", synonymOfGhost=" + synonymOfGhost + ", antonymOfGhost=" + antonymOfGhost + "]";
	}
	
	
	
	
	

}
