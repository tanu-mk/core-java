package com.xworkz.chatsapp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "egg.chats_info")
public class ChatsEntity {

	@Id
	@Column(name = "chats_id")
	private int id;
	
	@Column(name = "chats_shopName")
	private String shopName;
	
	@Column(name = "chats_gstin")
	private String gstin;
	
	@Column(name = "chats_chatName")
	private String chatName;
	
	@Column(name = "chats_type")
	private String type;
	
	@Column(name = "chats_price")
	private Double price;
		
}
