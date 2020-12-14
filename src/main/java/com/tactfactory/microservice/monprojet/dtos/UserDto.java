package com.tactfactory.microservice.monprojet.dtos;

import com.tactfactory.microservice.monprojet.entities.User;

public class UserDto {

	private User user;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "UserDto [user=" + user + "]";
	}

}
