package com.thepustakari.springmvc.util;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.dao.DataAccessException;

import com.thepustakari.springmvc.model.Address;
import com.thepustakari.springmvc.model.User;

public class UserExtractor {
	
	public User extractData (ResultSet rs) throws SQLException,DataAccessException {
		User user = new User();
		
		user.setUserid(rs.getInt("userid"));
		user.setFirstName(rs.getString("first_name"));
		user.setLastName(rs.getString("last_name"));
		user.setEmailAddress(rs.getString("email_address"));
		user.setPhone_num(rs.getLong("phone_number"));
		user.setGender(rs.getString("gender"));
		
		Address address = new Address();
		address.setAddress1(rs.getString("address1"));
		address.setAddress2(rs.getString("address2"));
		address.setCity(rs.getString("city"));
		address.setState(rs.getString("state"));
		address.setZipcode(rs.getInt("zip_code"));
		address.setCountry(rs.getString("country"));
		user.setAddress(address);
		
		return user;
	}

}
