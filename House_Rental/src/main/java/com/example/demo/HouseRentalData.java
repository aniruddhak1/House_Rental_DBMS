package com.example.demo;

public class HouseRentalData {
	
	private int ld_id;
	private String ld_user_type;
	private int ld_user_id;
	private String ld_username;
	private String ld_password;
	
	private int o_id;
	private String o_first_name;
	private String o_last_name;
	private int o_contact_number;
	private String o_email_id;
	private String o_created_at;
	private int o_country_code;
	private String o_city;
	private int o_postal_code;
	private String o_SSN;
	
	private int t_id;
	private String t_first_name;
	private String t_last_name;
	private int t_contact_number;
	private String t_email_id;
	private String t_gender;
	private String t_created_at;
	private int t_country_code;
	private String t_city;
	private int t_postal_code;
	private String t_SSN;
	
	private int owns_id;
	private int owns_owner_id;
	private int owns_house_id;
	
	private int h_id;
	private String  h_street_name;
	private int h_house_number;
	private int h_number_of_rooms;
	private String h_utilities_included;
	private float h_rent;
	private String h_available;
	
	private int l_id;
	private int l_house_id;
	private String l_lease_sign_date;
	private String l_lease_start_date;
	private String l_lease_end_date;
	private float l_amount;
	private int l_tenant_id;
	private String l_active;
	
	private int pd_id;
	private int pd_lease_payment_id;
	private int pd_tenant_id;
	private float pd_payment_amount;
	private float pd_current_balance;
	private String pd_payment_mode;
	private int pd_payment_mode_id;
	private String pd_payment_date;
	private String pd_user_type;
	private int pd_user_id;
	private String pd_memo;
	
	private int acht_id;
	private int acht_tenant_id;
	private String acht_routing_number;
	private String acht_account_number;
	private String acht_account_type;
	private String acht_bank_name;
	private String acht_account_name;
	private String acht_active;
	
	private int cd_id;
	private int cd_tenant_id;
	private String cd_type;
	private String cd_card_number;
	private int cd_valid_month;
	private int cd_valid_year;
	private int cd_cvv;
	private int cd_postal_code;
	private String cd_active;
	
	private int lp_id;
	private int lp_lease_id;
	private float lp_lease_payment_amount;
	private float lp_initial_balance;
	private float lp_current_balance;
	private String lp_due_date;
	private String lp_memo;
	
	public int getLd_id() {
		return ld_id;
	}
	public void setLd_id(int ld_id) {
		this.ld_id = ld_id;
	}
	public String getLd_user_type() {
		return ld_user_type;
	}
	public void setLd_user_type(String ld_user_type) {
		this.ld_user_type = ld_user_type;
	}
	public int getLd_user_id() {
		return ld_user_id;
	}
	public void setLd_user_id(int ld_user_id) {
		this.ld_user_id = ld_user_id;
	}
	public String getLd_username() {
		return ld_username;
	}
	public void setLd_username(String ld_username) {
		this.ld_username = ld_username;
	}
	public String getLd_password() {
		return ld_password;
	}
	public void setLd_password(String ld_password) {
		this.ld_password = ld_password;
	}
	public int getO_id() {
		return o_id;
	}
	public void setO_id(int o_id) {
		this.o_id = o_id;
	}
	public String getO_first_name() {
		return o_first_name;
	}
	public void setO_first_name(String o_first_name) {
		this.o_first_name = o_first_name;
	}
	public String getO_last_name() {
		return o_last_name;
	}
	public void setO_last_name(String o_last_name) {
		this.o_last_name = o_last_name;
	}
	public int getO_contact_number() {
		return o_contact_number;
	}
	public void setO_contact_number(int o_contact_number) {
		this.o_contact_number = o_contact_number;
	}
	public String getO_email_id() {
		return o_email_id;
	}
	public void setO_email_id(String o_email_id) {
		this.o_email_id = o_email_id;
	}
	public String getO_created_at() {
		return o_created_at;
	}
	public void setO_created_at(String o_created_at) {
		this.o_created_at = o_created_at;
	}
	public int getO_country_code() {
		return o_country_code;
	}
	public void setO_country_code(int o_country_code) {
		this.o_country_code = o_country_code;
	}
	public String getO_city() {
		return o_city;
	}
	public void setO_city(String o_city) {
		this.o_city = o_city;
	}
	public int getO_postal_code() {
		return o_postal_code;
	}
	public void setO_postal_code(int o_postal_code) {
		this.o_postal_code = o_postal_code;
	}
	public String getO_SSN() {
		return o_SSN;
	}
	public void setO_SSN(String o_SSN) {
		this.o_SSN = o_SSN;
	}
	public int getT_id() {
		return t_id;
	}
	public void setT_id(int t_id) {
		this.t_id = t_id;
	}
	public String getT_first_name() {
		return t_first_name;
	}
	public void setT_first_name(String t_first_name) {
		this.t_first_name = t_first_name;
	}
	public String getT_last_name() {
		return t_last_name;
	}
	public void setT_last_name(String t_last_name) {
		this.t_last_name = t_last_name;
	}
	public int getT_contact_number() {
		return t_contact_number;
	}
	public void setT_contact_number(int t_contact_number) {
		this.t_contact_number = t_contact_number;
	}
	public String getT_email_id() {
		return t_email_id;
	}
	public void setT_email_id(String t_email_id) {
		this.t_email_id = t_email_id;
	}
	public String getT_gender() {
		return t_gender;
	}
	public void setT_gender(String t_gender) {
		this.t_gender = t_gender;
	}
	public String getT_created_at() {
		return t_created_at;
	}
	public void setT_created_at(String t_created_at) {
		this.t_created_at = t_created_at;
	}
	public int getT_country_code() {
		return t_country_code;
	}
	public void setT_country_code(int t_country_code) {
		this.t_country_code = t_country_code;
	}
	public String getT_city() {
		return t_city;
	}
	public void setT_city(String t_city) {
		this.t_city = t_city;
	}
	public int getT_postal_code() {
		return t_postal_code;
	}
	public void setT_postal_code(int t_postal_code) {
		this.t_postal_code = t_postal_code;
	}
	public String getT_SSN() {
		return t_SSN;
	}
	public void setT_SSN(String t_SSN) {
		this.t_SSN = t_SSN;
	}
	public int getOwns_id() {
		return owns_id;
	}
	public void setOwns_id(int owns_id) {
		this.owns_id = owns_id;
	}
	public int getOwns_owner_id() {
		return owns_owner_id;
	}
	public void setOwns_owner_id(int owns_owner_id) {
		this.owns_owner_id = owns_owner_id;
	}
	public int getOwns_house_id() {
		return owns_house_id;
	}
	public void setOwns_house_id(int owns_house_id) {
		this.owns_house_id = owns_house_id;
	}
	public int getH_id() {
		return h_id;
	}
	public void setH_id(int h_id) {
		this.h_id = h_id;
	}
	public String getH_street_name() {
		return h_street_name;
	}
	public void setH_street_name(String h_street_name) {
		this.h_street_name = h_street_name;
	}
	public int getH_house_number() {
		return h_house_number;
	}
	public void setH_house_number(int h_house_number) {
		this.h_house_number = h_house_number;
	}
	public int getH_number_of_rooms() {
		return h_number_of_rooms;
	}
	public void setH_number_of_rooms(int h_number_of_rooms) {
		this.h_number_of_rooms = h_number_of_rooms;
	}
	public String getH_utilities_included() {
		return h_utilities_included;
	}
	public void setH_utilities_included(String h_utilities_included) {
		this.h_utilities_included = h_utilities_included;
	}
	public float getH_rent() {
		return h_rent;
	}
	public void setH_rent(float h_rent) {
		this.h_rent = h_rent;
	}
	public String getH_available() {
		return h_available;
	}
	public void setH_available(String h_available) {
		this.h_available = h_available;
	}
	public int getL_id() {
		return l_id;
	}
	public void setL_id(int l_id) {
		this.l_id = l_id;
	}
	public int getL_house_id() {
		return l_house_id;
	}
	public void setL_house_id(int l_house_id) {
		this.l_house_id = l_house_id;
	}
	public String getL_lease_sign_date() {
		return l_lease_sign_date;
	}
	public void setL_lease_sign_date(String l_lease_sign_date) {
		this.l_lease_sign_date = l_lease_sign_date;
	}
	public String getL_lease_start_date() {
		return l_lease_start_date;
	}
	public void setL_lease_start_date(String l_lease_start_date) {
		this.l_lease_start_date = l_lease_start_date;
	}
	public String getL_lease_end_date() {
		return l_lease_end_date;
	}
	public void setL_lease_end_date(String l_lease_end_date) {
		this.l_lease_end_date = l_lease_end_date;
	}
	public float getL_amount() {
		return l_amount;
	}
	public void setL_amount(float l_amount) {
		this.l_amount = l_amount;
	}
	public int getL_tenant_id() {
		return l_tenant_id;
	}
	public void setL_tenant_id(int l_tenant_id) {
		this.l_tenant_id = l_tenant_id;
	}
	public String getL_active() {
		return l_active;
	}
	public void setL_active(String l_active) {
		this.l_active = l_active;
	}
	public int getPd_id() {
		return pd_id;
	}
	public void setPd_id(int pd_id) {
		this.pd_id = pd_id;
	}
	public int getPd_lease_payment_id() {
		return pd_lease_payment_id;
	}
	public void setPd_lease_payment_id(int pd_lease_payment_id) {
		this.pd_lease_payment_id = pd_lease_payment_id;
	}
	public int getPd_tenant_id() {
		return pd_tenant_id;
	}
	public void setPd_tenant_id(int pd_tenant_id) {
		this.pd_tenant_id = pd_tenant_id;
	}
	public float getPd_payment_amount() {
		return pd_payment_amount;
	}
	public void setPd_payment_amount(float pd_payment_amount) {
		this.pd_payment_amount = pd_payment_amount;
	}
	public float getPd_current_balance() {
		return pd_current_balance;
	}
	public void setPd_current_balance(float pd_current_balance) {
		this.pd_current_balance = pd_current_balance;
	}
	public String getPd_payment_mode() {
		return pd_payment_mode;
	}
	public void setPd_payment_mode(String pd_payment_mode) {
		this.pd_payment_mode = pd_payment_mode;
	}
	public int getPd_payment_mode_id() {
		return pd_payment_mode_id;
	}
	public void setPd_payment_mode_id(int pd_payment_mode_id) {
		this.pd_payment_mode_id = pd_payment_mode_id;
	}
	public String getPd_payment_date() {
		return pd_payment_date;
	}
	public void setPd_payment_date(String pd_payment_date) {
		this.pd_payment_date = pd_payment_date;
	}
	public String getPd_user_type() {
		return pd_user_type;
	}
	public void setPd_user_type(String pd_user_type) {
		this.pd_user_type = pd_user_type;
	}
	public int getPd_user_id() {
		return pd_user_id;
	}
	public void setPd_user_id(int pd_user_id) {
		this.pd_user_id = pd_user_id;
	}
	public String getPd_memo() {
		return pd_memo;
	}
	public void setPd_memo(String pd_memo) {
		this.pd_memo = pd_memo;
	}
	public int getAcht_id() {
		return acht_id;
	}
	public void setAcht_id(int acht_id) {
		this.acht_id = acht_id;
	}
	public int getAcht_tenant_id() {
		return acht_tenant_id;
	}
	public void setAcht_tenant_id(int acht_tenant_id) {
		this.acht_tenant_id = acht_tenant_id;
	}
	public String getAcht_routing_number() {
		return acht_routing_number;
	}
	public void setAcht_routing_number(String acht_routing_number) {
		this.acht_routing_number = acht_routing_number;
	}
	public String getAcht_account_number() {
		return acht_account_number;
	}
	public void setAcht_account_number(String acht_account_number) {
		this.acht_account_number = acht_account_number;
	}
	public String getAcht_account_type() {
		return acht_account_type;
	}
	public void setAcht_account_type(String acht_account_type) {
		this.acht_account_type = acht_account_type;
	}
	public String getAcht_bank_name() {
		return acht_bank_name;
	}
	public void setAcht_bank_name(String acht_bank_name) {
		this.acht_bank_name = acht_bank_name;
	}
	public String getAcht_account_name() {
		return acht_account_name;
	}
	public void setAcht_account_name(String acht_account_name) {
		this.acht_account_name = acht_account_name;
	}
	public String getAcht_active() {
		return acht_active;
	}
	public void setAcht_active(String acht_active) {
		this.acht_active = acht_active;
	}
	public int getCd_id() {
		return cd_id;
	}
	public void setCd_id(int cd_id) {
		this.cd_id = cd_id;
	}
	public int getCd_tenant_id() {
		return cd_tenant_id;
	}
	public void setCd_tenant_id(int cd_tenant_id) {
		this.cd_tenant_id = cd_tenant_id;
	}
	public String getCd_type() {
		return cd_type;
	}
	public void setCd_type(String cd_type) {
		this.cd_type = cd_type;
	}
	public String getCd_card_number() {
		return cd_card_number;
	}
	public void setCd_card_number(String cd_card_number) {
		this.cd_card_number = cd_card_number;
	}
	public int getCd_valid_month() {
		return cd_valid_month;
	}
	public void setCd_valid_month(int cd_valid_month) {
		this.cd_valid_month = cd_valid_month;
	}
	public int getCd_valid_year() {
		return cd_valid_year;
	}
	public void setCd_valid_year(int cd_valid_year) {
		this.cd_valid_year = cd_valid_year;
	}
	public int getCd_cvv() {
		return cd_cvv;
	}
	public void setCd_cvv(int cd_cvv) {
		this.cd_cvv = cd_cvv;
	}
	public int getCd_postal_code() {
		return cd_postal_code;
	}
	public void setCd_postal_code(int cd_postal_code) {
		this.cd_postal_code = cd_postal_code;
	}
	public String getCd_active() {
		return cd_active;
	}
	public void setCd_active(String cd_active) {
		this.cd_active = cd_active;
	}
	public int getLp_id() {
		return lp_id;
	}
	public void setLp_id(int lp_id) {
		this.lp_id = lp_id;
	}
	public int getLp_lease_id() {
		return lp_lease_id;
	}
	public void setLp_lease_id(int lp_lease_id) {
		this.lp_lease_id = lp_lease_id;
	}
	public float getLp_lease_payment_amount() {
		return lp_lease_payment_amount;
	}
	public void setLp_lease_payment_amount(float lp_lease_payment_amount) {
		this.lp_lease_payment_amount = lp_lease_payment_amount;
	}
	public float getLp_initial_balance() {
		return lp_initial_balance;
	}
	public void setLp_initial_balance(float lp_initial_balance) {
		this.lp_initial_balance = lp_initial_balance;
	}
	public float getLp_current_balance() {
		return lp_current_balance;
	}
	public void setLp_current_balance(float lp_current_balance) {
		this.lp_current_balance = lp_current_balance;
	}
	public String getLp_due_date() {
		return lp_due_date;
	}
	public void setLp_due_date(String lp_due_date) {
		this.lp_due_date = lp_due_date;
	}
	public String getLp_memo() {
		return lp_memo;
	}
	public void setLp_memo(String lp_memo) {
		this.lp_memo = lp_memo;
	}
}
