package com.mall.meongnyang.admin.member.vo;

import java.sql.Date;

import javax.xml.crypto.Data;

public class AdminMemberVO {

	private String customerTbEmail; 
	private String customerTbName;
	private Date customerTbLastLogin;
	private String customerTbState;
	public String getCustomerTbEmail() {
		return customerTbEmail;
	}
	public void setCustomerTbEmail(String customerTbEmail) {
		this.customerTbEmail = customerTbEmail;
	}
	public String getCustomerTbName() {
		return customerTbName;
	}
	public void setCustomerTbName(String customerTbName) {
		this.customerTbName = customerTbName;
	}
	public Date getCustomerTbLastLogin() {
		return customerTbLastLogin;
	}
	public void setCustomerTbLastLogin(Date customerTbLastLogin) {
		this.customerTbLastLogin = customerTbLastLogin;
	}
	public String getCustomerTbState() {
		return customerTbState;
	}
	public void setCustomerTbState(String customerTbState) {
		this.customerTbState = customerTbState;
	}
	
	
	

}
