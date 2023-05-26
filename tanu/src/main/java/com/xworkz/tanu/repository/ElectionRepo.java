package com.xworkz.tanu.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.xworkz.tanu.entity.ElectionEntity;

public interface ElectionRepo extends JpaRepository<ElectionEntity, Integer> {

}
