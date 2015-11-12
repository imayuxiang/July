package com.July.service;

import com.July.model.User;

public interface UserService {
	public User getUserById(int id);
	
	public void saveUser(User user);
}
