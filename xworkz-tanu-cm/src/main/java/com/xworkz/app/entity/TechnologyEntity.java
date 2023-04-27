package com.xworkz.app.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter

@Table(name = "egg.t_technology")
@NamedQuery(name="searchByTechName", query="select ent from TechnologyEntity ent where ent.technologyName=:techName or ent.languange=:lang or ent.version=:ver or ent.owner=:own or ent.supportFrom=:sf or ent.supportTo=:st or ent.licenseNo=:ln or ent.openSource=:os or ent.osType=:pt and ent.signUpEntity.userId=:tuid")
public class TechnologyEntity {
	
	@Id
	@Column(name = "t_id")
	private int id;
	
	@Column(name = "t_technologyName")
	private String technologyName;
	
	@Column(name = "t_language")
	private String languange;
	
	@Column(name = "t_version")
	private String version;
	
	@Column(name = "t_owner")
	private String owner;
	
	@Column(name = "t_supportFrom")
	private String supportFrom;
	
	@Column(name = "t_supportTo")
	private String supportTo;
	
	@Column(name = "t_license")
	private String licenseNo;
	
	@Column(name = "t_openSource")
	private String openSource;
	
	@Column(name = "t_osType")
	private String osType;
	
	@Column(name = "t_createdBy")
	private String createdBy;
	
	@Column(name = "t_createdDate")
	private LocalDateTime createdDate;
	
	@Column(name = "t_updatedBy")
	private  String updatedBy;
	
	@Column(name = "t_updatedDate")
	private LocalDateTime updatedDate;
	
	@ManyToOne(fetch = FetchType.LAZY, optional =false)
	@JoinColumn(name = "s_userId", referencedColumnName = "s_userId")
	private SignUpEntity signUpEntity;
	
	
	
	


}
