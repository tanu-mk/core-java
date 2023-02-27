package com.xworkz.chatsapp.repository;

import com.xworkz.chatsapp.entity.ChatsEntity;

public interface ChatsRepository {
	
	boolean save(ChatsEntity entity);
	
	default ChatsEntity findById(int id) {
		System.out.println("Running findById in repo...");
		return null;
	}

}
