package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import org.springframework.jdbc.core.BeanPropertyRowMapper;

@Repository
@Transactional
public class RentalDAO {
	
	@Autowired
    private JdbcTemplate jdbcTemplate;
	
	public RentalDAO(JdbcTemplate jdbcTemplate) {
		super();
		this.jdbcTemplate = jdbcTemplate;
	}

	public List<User> list() {
	    String sql = "SELECT * FROM TENANT";
	    
	    System.out.println(jdbcTemplate);
	 
	    List<User> listSale = jdbcTemplate.query(sql, BeanPropertyRowMapper.newInstance(User.class));
	    
	    System.out.println(listSale);
	 
	    return listSale;

	}

	public String Register(User user) {
		if(user.getType()=="tenant") {
			jdbcTemplate.update("insert into tenant (FIRST_NAME,LAST_NAME,CONTACT_NUMBER,EMAIL_ID,GENDER,COUNTRY_CODE,CITY,POSTAL_CODE,SSN) values(?,?,?,?,?,?,?,?,?)",
					user.getFirstname(),user.getLastname(),user.getPhoneno(),user.getEmail(),user.getGender(),user.getCountry_code(),user.getCity(),user.getPostal(),user.getSsn());
		}
		else if(user.getType()=="owner") {
			jdbcTemplate.update("insert into tenant (FIRST_NAME,LAST_NAME,CONTACT_NUMBER,EMAIL_ID,GENDER,COUNTRY_CODE,CITY,POSTAL_CODE,SSN) values(?,?,?,?,?,?,?,?,?)",
					user.getFirstname(),user.getLastname(),user.getPhoneno(),user.getEmail(),user.getGender(),user.getCountry_code(),user.getCity(),user.getPostal(),user.getSsn());
		}
        return "Success";
    }
}
