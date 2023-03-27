package com.xworkz.app.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "egg.signup_table")
public class SignUpEntity {
	
	@Column(name = "s_id")
	private Integer id;
	
	@Column(name = "s_userId")
	private String userId;
	
	@Column(name = "s_email")
	private String email;
	
	@Column(name = "s_mobileNumber")
	private Integer mobileNumber;
	
	@Column(name = "s_password")
	private String password;
	
	@Column(name = "s_createdBy")
	private String createdBy;
	
	@Column(name = "s_createdDate")
	private LocalDateTime createdDate;
	
	@Column(name = "s_updatedBy")
	private  String updatedBy;
	
	@Column(name = "s_updatedDate")
	private LocalDateTime updatedDate;
	
}
