package com.example.demo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
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

	public int Register(User user) {
		System.out.println("UserType is: "+user.getType());
		if(user.getType().equals("tenant")) {
			int i=jdbcTemplate.update("insert into tenant (FIRST_NAME,LAST_NAME,CONTACT_NUMBER,EMAIL_ID,GENDER,COUNTRY_CODE,CITY,POSTAL_CODE,SSN) values(?,?,?,?,?,?,?,?,?)",
					//"TAniruddha","TK","4455","a@k","Male",45,"Buffalo",87587,548);
					user.getFirstname(),user.getLastname(),user.getPhoneno(),user.getEmail(),user.getGender(),Integer.parseInt(user.getCountry()),user.getCity(),Integer.parseInt(user.getPostal()),user.getSsn());
			if(i==1) {
				return jdbcTemplate.update("insert into login_details (USER_TYPE,USER_ID,USERNAME,PASSWORD) values(?,?,?,?)",
						user.getType(),0,user.getUsername(),user.getPassword());
			}
		}
		if(user.getType().equals("owner")) {
			System.out.println("About to insert");
			int i = jdbcTemplate.update("insert into owner (FIRST_NAME,LAST_NAME,CONTACT_NUMBER,EMAIL_ID,GENDER,COUNTRY_CODE,CITY,POSTAL_CODE,SSN) values(?,?,?,?,?,?,?,?,?)",
					//"TAniruddha","TK","4455","a@k","male",45,"Buffalo",87587,"548");
					user.getFirstname(),user.getLastname(),user.getPhoneno(),user.getEmail(),user.getGender(),Integer.parseInt(user.getCountry()),user.getCity(),Integer.parseInt(user.getPostal()),user.getSsn());
			System.out.println(i);
			if(i==1) {
				return jdbcTemplate.update("insert into login_details (USER_TYPE,USER_ID,USERNAME,PASSWORD) values(?,?,?,?)",
						user.getType(),4,user.getUsername(),user.getPassword());
			}
		}
        return 2;
    }
	
	public User login(User user){
		System.out.println(user.getEmail());
		
		String email=user.getEmail();

		String sql = "SELECT * FROM Users";

	    User output = (User) jdbcTemplate.queryForObject(
	            sql,  new UserRowMapper());

	    return output;
       }
	
	/*public User login(User user) {
        
        String query = "select name from users where email_id=?"; 
        Object[] inputs = new Object[] {user.getEmail()};
        User logindetails = jdbcTemplate.queryForObject(query, inputs, User.class);
        return logindetails;
    }
	
	public List<User> login(User user) {*/
		
		
		
		/*String sql = "SELECT * FROM USERS WHERE EMAIL_ID = ?";	
		//return (User) jdbcTemplate.queryForObject(sql,new Object[], new BeanPropertyRowMapper(User.class));
		
	    System.out.println(jdbcTemplate);	 
	    List<User> output= jdbcTemplate.query(sql, new Object[]{user.getEmail()}, BeanPropertyRowMapper.newInstance(User.class));
	    System.out.println(output.size());
	    return output;
	    //System.out.println(logindetails);	 
	    //return logindetails;
	}*/
}
