package com.example.demo;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class PaymentDetailsRowMapper implements RowMapper<PaymentDetails>{
	
	@Override
    public PaymentDetails mapRow(ResultSet rs, int rowNum) throws SQLException {

        System.out.println("Entering method paymentdetailsmapper");
        PaymentDetails pd = new PaymentDetails();
        pd.setId(rs.getInt("ID"));
        pd.setLease_payment_id(rs.getInt("LEASE_ID"));
        pd.setUser_id(rs.getInt("USER_ID"));
        pd.setPayment_amount(rs.getInt("PAYMENT_AMOUNT"));
        pd.setCurrent_balance(rs.getInt("CURRENT_BALANCE"));
        pd.setPayment_mode(rs.getString("PAYMENT_MODE"));
        pd.setPayment_mode_id(rs.getInt("PAYMENT_MODE_ID"));
        pd.setPayment_date(rs.getDate("PAYMENT_DATE"));
        pd.setMemo(rs.getString("MEMO"));
    	
        System.out.println("Exiting method paymentdetailsmapper "+pd.getUser_id());
        return pd;

    }

}