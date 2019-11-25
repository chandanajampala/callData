package com.example.demo;

import java.util.ArrayList;
import java.util.List;

public class EntityList {
	List<userEntity> users;
	
	 public List<userEntity> getUsers() {
		return users;
	}

	public void setUsers(List<userEntity> users) {
		this.users = users;
	}

	
	 
    public EntityList() {
        users = new ArrayList<>();
    }
 
}
