package com.mall.meongnyang.client.mypage.vo;

public class ClientCmAddressVO {
	private int cmAddressTbNo;
	private int customerTbNo;
	private String cmAddressTbNickname;
	private String cmAddressTbPostcode;
	private String cmAddressTbAddress1;
	private String cmAddressTbAddress2;
	private String cmAddressTbPhone;
	private double cmAddressTbLat;
	private double cmAddressTbLng;

	public int getCmAddressTbNo() {
		return cmAddressTbNo;
	}
	public void setCmAddressTbNo(int cmAddressTbNo) {
		this.cmAddressTbNo = cmAddressTbNo;
	}
	public int getCustomerTbNo() {
		return customerTbNo;
	}
	public void setCustomerTbNo(int customerTbNo) {
		this.customerTbNo = customerTbNo;
	}
	public String getCmAddressTbNickname() {
		return cmAddressTbNickname;
	}
	public void setCmAddressTbNickname(String cmAddressTbNickname) {
		this.cmAddressTbNickname = cmAddressTbNickname;
	}
	public String getCmAddressTbPostcode() {
		return cmAddressTbPostcode;
	}
	public void setCmAddressTbPostcode(String cmAddressTbPostcode) {
		this.cmAddressTbPostcode = cmAddressTbPostcode;
	}
	public String getCmAddressTbAddress1() {
		return cmAddressTbAddress1;
	}
	public void setCmAddressTbAddress1(String cmAddressTbAddress1) {
		this.cmAddressTbAddress1 = cmAddressTbAddress1;
	}
	public String getCmAddressTbAddress2() {
		return cmAddressTbAddress2;
	}
	public void setCmAddressTbAddress2(String cmAddressTbAddress2) {
		this.cmAddressTbAddress2 = cmAddressTbAddress2;
	}
	public String getCmAddressTbPhone() {
		return cmAddressTbPhone;
	}
	public void setCmAddressTbPhone(String cmAddressTbPhone) {
		this.cmAddressTbPhone = cmAddressTbPhone;
	}

	public double getCmAddressTbLat()
	{
		return cmAddressTbLat;
	}

	public void setCmAddressTbLat(double cmAddressTbLat)
	{
		this.cmAddressTbLat = cmAddressTbLat;
	}

	public double getCmAddressTbLng()
	{
		return cmAddressTbLng;
	}

	public void setCmAddressTbLng(double cmAddressTbLng)
	{
		this.cmAddressTbLng = cmAddressTbLng;
	}

	@Override
	public String toString()
	{
		return "ClientCmAddressVO{" +
				"cmAddressTbNo=" + cmAddressTbNo +
				", customerTbNo=" + customerTbNo +
				", cmAddressTbNickname='" + cmAddressTbNickname + '\'' +
				", cmAddressTbPostcode='" + cmAddressTbPostcode + '\'' +
				", cmAddressTbAddress1='" + cmAddressTbAddress1 + '\'' +
				", cmAddressTbAddress2='" + cmAddressTbAddress2 + '\'' +
				", cmAddressTbPhone='" + cmAddressTbPhone + '\'' +
				", cmAddressTbLat=" + cmAddressTbLat +
				", cmAddressTbLng=" + cmAddressTbLng +
				'}';
	}
}
