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
			return jdbcTemplate.update("insert into users (FIRST_NAME,LAST_NAME,CONTACT_NUMBER,EMAIL_ID,USER_TYPE,GENDER,COUNTRY,CITY,STATE,POSTAL_CODE,SSN,PASSWORD,ADDRESS) values(?,?,?,?,?,?,?,?,?,?,?,?,?)",
					//"TAniruddha","TK","4455","a@k","Male",45,"Buffalo",87587,548);
					user.getFirstname(),user.getLastname(),user.getPhoneno(),user.getEmail(),user.getType(),user.getGender(),user.getCountry(),user.getCity(),user.getState(),Integer.parseInt(user.getPostal()),user.getSsn(),user.getPassword(),user.getAddress());
		}
	
	public User login(User user){
		System.out.println(user.getEmail());
		
		String email=user.getEmail();

		String sql = "SELECT * FROM Users WHERE EMAIL_ID ='"+email+"'";

	    
		User output = (User) jdbcTemplate.queryForObject(
	            sql,  new UserRowMapper());


	    if((user.getEmail().equals(output.getEmail())) && (user.getPassword().equals(output.getPassword()))) {
	    	return output;
	    }
	    else {
	    	return new User();
	    }
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
	
	public List<House> allhouses(){
		
		String sql = "SELECT * FROM HOUSE";

	    System.out.println("Before house jdbc");
		List<House> output = jdbcTemplate.query(
                sql,
                new HouseRowMapper());
		System.out.println("After house jdbc");

	    return output;
	    }
	
	public List<House> ownerhouses(int oid){
		
		String sql = "SELECT * FROM HOUSE where user_id="+oid;
		System.out.println(sql);

	    System.out.println("Before house jdbc");
		List<House> output = jdbcTemplate.query(
                sql,
                new HouseRowMapper());
		System.out.println("After house jdbc");

	    return output;
		}
	
	public int addhouse(int oid, House house){
		
		return jdbcTemplate.update("insert into house (STREET_NAME,HOUSE_NUMBER,COUNTRY,CITY,STATE,POSTAL_CODE,NUMBER_OF_ROOMS,UTILITIES_INCLUDED,RENT,AVAILABLE,USER_ID) values(?,?,?,?,?,?,?,?,?,?,?)",
				house.getStreet_name(),house.getHouse_number(),house.getCountry(),house.getCity(),house.getState(),house.getPostal_code(),house.getNumber_of_rooms(),house.getUtilities_included(),house.getRent(),house.getAvailable(),house.getUser_id());
		}
	
	public int addCard(int oid, Card card){
		
		return jdbcTemplate.update("insert into card_details (USER_ID,TYPE,CARD_NUMBER,VALID_MONTH,VALID_YEAR,CVV,POSTAL_CODE,ACTIVE) values((select id from users where email_id = ?),?,?,?,?,?,?,'YES')",
				card.getEmail_id(),card.getType(),card.getCard_number(),card.getValid_month(),card.getValid_year(),card.getCvv(),card.getPostal_code());
		}
	
	public int addACH(int oid, ACH ach){
		
		return jdbcTemplate.update("insert into ach_transfer (USER_ID,ROUTING_NUMBER,ACCOUNT_NUMBER,ACCOUNT_TYPE,BANK_NAME,ACCOUNT_NAME,ACTIVE) values((select id from users where email_id = ?),?,?,?,?,?,'YES')",
				ach.getEmail_id(),ach.getRouting_number(),ach.getAccount_number(),ach.getAccount_type(),ach.getBank_name(),ach.getAccount_name());
		}
	
	public int makePayment(int oid, PaymentDetails pd){
		
		jdbcTemplate.update("update lease set BALANCE=BALANCE - ? where id=(select l.id as lease_id from lease l join users u on l.user_id = u.id where email_id = ?)",pd.getPayment_amount(),pd.getEmail_id());
		
		return jdbcTemplate.update("insert into payment_details (LEASE_ID,USER_ID,PAYMENT_AMOUNT,CURRENT_BALANCE,PAYMENT_MODE,PAYMENT_MODE_ID,PAYMENT_DATE,MEMO) values((select l.id as lease_id from lease l join users u on l.user_id = u.id where email_id = ?),(select id from users where email_id = ?),?,?,?,?,?,?)",
				pd.getEmail_id(),pd.getEmail_id(),pd.getPayment_amount(),pd.getCurrent_balance(),pd.getPayment_mode(),pd.getPayment_mode_id(),pd.getPayment_date(),pd.getMemo());
		}
	
	public List<PaymentDetails> displayPayments(int uid){
		
		String sql = "SELECT * FROM payment_details where user_id="+uid;

	    System.out.println("Before lease jdbc");
		List<PaymentDetails> output = jdbcTemplate.query(
                sql,
                new PaymentDetailsRowMapper());
		System.out.println("After lease jdbc");

	    return output;
	    }
	
	public int signLease(int oid, Lease lease){ //havent used oid here
		
		jdbcTemplate.update("update house set AVAILABLE='NO' where id=?",lease.getHouse_id());
		
		return jdbcTemplate.update("insert into lease (HOUSE_ID,LEASE_SIGN_DATE,LEASE_START_DATE,LEASE_END_DATE,LEASE_AMOUNT,USER_ID,ACTIVE,BALANCE) values(?,?,?,?,?,?,?,?)",
				lease.getHouse_id(),lease.getLease_sign_date(),lease.getLease_start_date(),lease.getLease_end_date(),lease.getLease_amount(),lease.getUser_id(),lease.getActive(),12*lease.getLease_amount());
		}
	
	public List<Lease> displayLease(int uid){
		
		String sql = "SELECT * FROM LEASE where user_id="+uid;

	    System.out.println("Before lease jdbc");
		List<Lease> output = jdbcTemplate.query(
                sql,
                new LeaseRowMapper());
		System.out.println("After lease jdbc");

	    return output;
	    }
	
	public int deleteHouse(int oid, House house){
		
		return jdbcTemplate.update("delete from house where ID="+house.getId());
				
		}
	
	public int editHouse(int oid, House house){
		
		return jdbcTemplate.update("update house set STREET_NAME=?,HOUSE_NUMBER=?,COUNTRY=?,CITY=?,STATE=?,POSTAL_CODE=?,NUMBER_OF_ROOMS=?,UTILITIES_INCLUDED=?,RENT=?,AVAILABLE=? where ID=?",
				house.getStreet_name(),house.getHouse_number(),house.getCountry(),house.getCity(),house.getState(),house.getPostal_code(),house.getNumber_of_rooms(),house.getUtilities_included(),house.getRent(),house.getAvailable(),house.getId());
				
		}
	
}
