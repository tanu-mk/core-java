package com.xworkz.soldierapp.dto;

import java.io.Serializable;
import java.time.LocalDateTime;


public abstract class AbstractAuditDto implements Serializable {

	private String createdBy;
	private LocalDateTime createdAt;
	private String updatedBy;
	private LocalDateTime updatedAt;
}
