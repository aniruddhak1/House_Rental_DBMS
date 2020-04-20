package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import org.springframework.jdbc.core.BeanPropertyRowMapper;

public class RentalDAO {
	
	@Autowired
    private JdbcTemplate jdbcTemplate;
	
	public List<User> list() {
	    String sql = "SELECT * FROM TENANT";
	    
	    System.out.println(jdbcTemplate);
	 
	    List<User> listSale = jdbcTemplate.query(sql, BeanPropertyRowMapper.newInstance(User.class));
	    
	    //System.out.println(listSale);
	 
	    return listSale;

	}

	public int Save() {
        return jdbcTemplate.update(
                "insert into Tenant (first_name) values('Bhakti')");
    }
}