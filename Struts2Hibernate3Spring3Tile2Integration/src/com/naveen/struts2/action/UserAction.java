package com.naveen.struts2.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.naveen.struts2.bean.UserBean;
import com.naveen.struts2.service.UserService;
import com.naveen.struts2.utils.CommonUtility;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;


public class UserAction extends ActionSupport implements ModelDriven<UserBean>{

	private static final long serialVersionUID = 1L;
	
	@Autowired
	private UserBean userBean;
	@Autowired
	private UserService userService;
	private List<UserBean> users;

	public String execute()	{
		users = CommonUtility.createUserBeanList(userService.getUserList());
		return "user";
	}
	
	public String addUser(){
		userService.saveUser(CommonUtility.createModel(userBean));
		users = CommonUtility.createUserBeanList(userService.getUserList());
		return "addUser";
	}
	public String listUser(){
		users = CommonUtility.createUserBeanList(userService.getUserList());
		return "users";
	}
	
	@Override
	public UserBean getModel() {
		return userBean;
	}
	public String alia() { 
		return "alia";
	}
	public String rebacca() { 
		return "rebacca"; 
	}
	public String user() { 
		return "user"; 
	}

	public List<UserBean> getUsers() {
		return users;
	}

	public void setUsers(List<UserBean> users) {
		this.users = users;
	}
	
}