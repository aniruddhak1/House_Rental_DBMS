package com.example.demo;

import java.sql.Date;

public class Lease {
	
	private int id;
	private int house_id;
	private Date lease_sign_date;
	private Date lease_start_date;
	private Date lease_end_date;
	private int lease_amount;
	private int user_id;
	private int balance;
	private String active;
	
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getHouse_id() {
		return house_id;
	}
	public void setHouse_id(int house_id) {
		this.house_id = house_id;
	}
	public Date getLease_sign_date() {
		return lease_sign_date;
	}
	public void setLease_sign_date(Date lease_sign_date) {
		this.lease_sign_date = lease_sign_date;
	}
	public Date getLease_start_date() {
		return lease_start_date;
	}
	public void setLease_start_date(Date lease_start_date) {
		this.lease_start_date = lease_start_date;
	}
	public Date getLease_end_date() {
		return lease_end_date;
	}
	public void setLease_end_date(Date lease_end_date) {
		this.lease_end_date = lease_end_date;
	}
	public int getLease_amount() {
		return lease_amount;
	}
	public void setLease_amount(int lease_amount) {
		this.lease_amount = lease_amount;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public String getActive() {
		return active;
	}
	public void setActive(String active) {
		this.active = active;
	}

}
