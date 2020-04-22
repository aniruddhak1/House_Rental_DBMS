package com.example.demo;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class UserRowMapper implements RowMapper<User>{

	    @Override
	    public User mapRow(ResultSet rs, int rowNum) throws SQLException {

	        System.out.println("Entering method rowmapper");
	    	User user = new User();
	        user.setId(rs.getInt("ID"));
	        user.setFirstname(rs.getString("FIRST_NAME"));
	        user.setLastname(rs.getString("LAST_NAME"));
	        user.setPhoneno(rs.getString("CONTACT_NUMBER"));
	        user.setEmail(rs.getString("EMAIL_ID"));
	        user.setType(rs.getString("USER_TYPE"));
	        user.setGender(rs.getString("GENDER"));
	        user.setCountry(rs.getString("COUNTRY"));
	        user.setCity(rs.getString("CITY"));
	        user.setPostal(String.valueOf(rs.getInt("POSTAL_CODE")));
	        user.setSsn(rs.getString("SSN"));
	        user.setPassword(rs.getString("PASSWORD"));
	        user.setAddress(rs.getString("ADDRESS"));
	        System.out.println("Exiting method rowmapper"+user.getPassword());
	        return user;

	    }

}
