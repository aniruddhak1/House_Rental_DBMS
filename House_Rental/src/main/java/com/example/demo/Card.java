package com.example.demo;

public class Card {
	
	private int id;
	private int user_id;
	private String type;
	private String card_number;
	private int valid_month;
	private int valid_year;
	private int cvv;
	private int postal_code;
	private String active;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getCard_number() {
		return card_number;
	}
	public void setCard_number(String card_number) {
		this.card_number = card_number;
	}
	public int getValid_month() {
		return valid_month;
	}
	public void setValid_month(int valid_month) {
		this.valid_month = valid_month;
	}
	public int getValid_year() {
		return valid_year;
	}
	public void setValid_year(int valid_year) {
		this.valid_year = valid_year;
	}
	public int getCvv() {
		return cvv;
	}
	public void setCvv(int cvv) {
		this.cvv = cvv;
	}
	public int getPostal_code() {
		return postal_code;
	}
	public void setPostal_code(int postal_code) {
		this.postal_code = postal_code;
	}
	public String getActive() {
		return active;
	}
	public void setActive(String active) {
		this.active = active;
	}
		
}
