package com.thepustakari.springmvc.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import com.thepustakari.springmvc.model.User;
import com.thepustakari.springmvc.model.Userlogin;
import com.thepustakari.springmvc.util.QueryUtil;
import com.thepustakari.springmvc.util.UserRowMapper;

public class UserDaoImpl implements UserDao {
	@Autowired
	private DataSource dataSource;
	
	public JdbcTemplate getJdbcTemplate() {
		return new JdbcTemplate(dataSource);
	}
	
	@Override
	public void saveUserAccount(User newuserregister) {
		
		getJdbcTemplate().update(QueryUtil.INSERT_SQL, new Object[] {newuserregister.getFirstName(),
				newuserregister.getLastName(),newuserregister.getEmailAddress(),
				newuserregister.getPhone_num(),newuserregister.getGender(),
				newuserregister.getAddress().getAddress1(),
				newuserregister.getAddress().getAddress2(),
				newuserregister.getAddress().getCity(),
				newuserregister.getAddress().getState(),
				newuserregister.getAddress().getZipcode(),
				newuserregister.getAddress().getCountry()});
	}



	@Override
	public List<User> displayList() {
		List<User> list= getJdbcTemplate().query(QueryUtil.DISPLAY_ALL_SQL, new UserRowMapper());
		return list;
	}
	


}
