package com.example.demo;

public class House {
	
	private int id;
	private String street_name;
	private int house_number;
	private String country;
	private String city;
	private String state;
	private int postal_code;
	private int number_of_rooms;
	private String utilities_included;
	private int rent;
	private String available;
	private int user_id;
	
	public House() {
		
	}

	public House(int id, String street_name, int house_number, String country, String city, String state,
			int postal_code, int number_of_rooms, String utilities_included, int rent, String available) {
		super();
		this.id = id;
		this.street_name = street_name;
		this.house_number = house_number;
		this.country = country;
		this.city = city;
		this.state = state;
		this.postal_code = postal_code;
		this.number_of_rooms = number_of_rooms;
		this.utilities_included = utilities_included;
		this.rent = rent;
		this.available = available;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getStreet_name() {
		return street_name;
	}
	public void setStreet_name(String street_name) {
		this.street_name = street_name;
	}
	public int getHouse_number() {
		return house_number;
	}
	public void setHouse_number(int house_number) {
		this.house_number = house_number;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getPostal_code() {
		return postal_code;
	}
	public void setPostal_code(int postal_code) {
		this.postal_code = postal_code;
	}
	public int getNumber_of_rooms() {
		return number_of_rooms;
	}
	public void setNumber_of_rooms(int number_of_rooms) {
		this.number_of_rooms = number_of_rooms;
	}
	public String getUtilities_included() {
		return utilities_included;
	}
	public void setUtilities_included(String utilities_included) {
		this.utilities_included = utilities_included;
	}
	public int getRent() {
		return rent;
	}
	public void setRent(int rent) {
		this.rent = rent;
	}
	public String getAvailable() {
		return available;
	}
	public void setAvailable(String available) {
		this.available = available;
	}

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	
}
