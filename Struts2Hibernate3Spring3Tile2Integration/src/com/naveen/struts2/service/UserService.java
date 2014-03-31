package com.naveen.struts2.service;

import java.util.List;

import com.naveen.struts2.model.User;


public interface UserService {
	void saveUser(User user);
	
	List<User> getUserList(); 
}
