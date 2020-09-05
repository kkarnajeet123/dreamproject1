package com.thepustakari.springmvc.service;

import java.util.List;

import com.thepustakari.springmvc.model.User;
import com.thepustakari.springmvc.model.Userlogin;

public interface UserService {
	
	List <User>displayList();
	void saveUserAccount(User user);

}
