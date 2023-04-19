package com.xworkz.app.entity;

import java.time.LocalDateTime;
import java.time.LocalTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "egg.signup_table")
@NamedQuery(name = "findByCount", query = "select count(*) from SignUpEntity ent where ent.userId=:u or ent.email=:e or ent.mobileNumber=:m")
@NamedQuery(name = "userId", query = "select count(*) from SignUpEntity ent where ent.userId=:userBy")
@NamedQuery(name = "emailId",query = "select count(*) from  SignUpEntity ent where ent.email=:emailBy")
@NamedQuery(name = "mobileId",query = "select count(*) from  SignUpEntity ent where ent.mobileNumber=:mobileBy")
@NamedQuery(name = "IdandPassword", query = "select ent from SignUpEntity ent where ent.userId=:u")
@NamedQuery(name = "lockCount", query = "update SignUpEntity ent set ent.lockCount=:c where ent.userId=:u")
@NamedQuery(name = "email", query = "select ent from SignUpEntity ent where ent.email=:ed")
@NamedQuery(name = "updatePassword", query = "update SignUpEntity ent set ent.password=:p, ent.resetPassword=:rp, ent.passwordChangedTime=:pct where ent.userId=:ud")
public class SignUpEntity {
	
	@Id
	@Column(name = "s_id")
	private int id;
	
	@Column(name = "s_userId")
	private String userId;
	
	@Column(name = "s_email")
	private String email;
	
	@Column(name = "s_mobileNumber")
	private long mobileNumber;
	
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
	
	@Column(name = "s_lockCount")
	private int lockCount;
	
	@Column(name = "s_resetPassword")
	private Boolean resetPassword;
	
	@Column(name = "s_passwordChangedTime")
	private LocalTime passwordChangedTime;
	
	@Column(name = "s_picName")
	private String picName;
	
}

