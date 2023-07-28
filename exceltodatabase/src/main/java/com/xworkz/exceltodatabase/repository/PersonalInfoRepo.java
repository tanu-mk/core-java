package com.xworkz.exceltodatabase.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.xworkz.exceltodatabase.entity.PersonalInfo;

public interface PersonalInfoRepo extends JpaRepository<PersonalInfo, Integer> {

}
