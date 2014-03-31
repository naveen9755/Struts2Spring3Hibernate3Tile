package com.naveen.struts2.dao;

import java.util.List;

import com.naveen.struts2.model.User;


public interface UserDao {
	void saveUser(User user);
	
	List<User> getUserList(); 
}
