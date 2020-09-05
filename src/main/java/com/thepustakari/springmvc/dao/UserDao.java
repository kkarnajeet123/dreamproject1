package com.thepustakari.springmvc.dao;

import java.util.List;

import com.thepustakari.springmvc.model.User;
import com.thepustakari.springmvc.model.Userlogin;

public interface UserDao {

	List <User>displayList();
	void saveUserAccount(User newuserregister);

}
