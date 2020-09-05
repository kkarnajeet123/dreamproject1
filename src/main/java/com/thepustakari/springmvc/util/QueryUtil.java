package com.thepustakari.springmvc.util;

public class QueryUtil {
	
	public static final String INSERT_SQL="insert into user_tbl(first_name,last_name,email_address,phone_number, gender,address1, address2,city,state,zip_code,country) value(?,?,?,?,?,?,?,?,?,?,?)";
	public static final String DISPLAY_ALL_SQL= "select * from user_tbl";
}
