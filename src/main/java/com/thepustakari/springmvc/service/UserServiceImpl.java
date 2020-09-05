package com.thepustakari.springmvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.thepustakari.springmvc.dao.UserDao;
import com.thepustakari.springmvc.model.User;
import com.thepustakari.springmvc.model.Userlogin;

public class UserServiceImpl implements UserService {
	@Autowired
	private UserDao userdao;
	
	@Override
	public void saveUserAccount(User newuserregister) {
		
		userdao.saveUserAccount(newuserregister);
	}



	@Override
	public List<User> displayList() {
		return userdao.displayList();
	
	}

}
