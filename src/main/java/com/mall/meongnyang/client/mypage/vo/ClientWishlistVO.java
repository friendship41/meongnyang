package com.mall.meongnyang.client.mypage.vo;

public class ClientWishlistVO {
	private int wishlistTbNo;
	private int customerTbNo;
	private int pdSaleTbNo;
	
	private int pdSaleTbSalesPrice;
	private String pdSaleTbProductName;
	private int pdSaleTbRemainingAmount;
	
	public int getWishlistTbNo() {
		return wishlistTbNo;
	}
	public void setWishlistTbNo(int wishlistTbNo) {
		this.wishlistTbNo = wishlistTbNo;
	}
	public int getCustomerTbNo() {
		return customerTbNo;
	}
	public void setCustomerTbNo(int customerTbNo) {
		this.customerTbNo = customerTbNo;
	}
	public int getPdSaleTbNo() {
		return pdSaleTbNo;
	}
	public void setPdSaleTbNo(int pdSaleTbNo) {
		this.pdSaleTbNo = pdSaleTbNo;
	}		
	public int getPdSaleTbSalesPrice() {
		return pdSaleTbSalesPrice;
	}
	public void setPdSaleTbSalesPrice(int pdSaleTbSalesPrice) {
		this.pdSaleTbSalesPrice = pdSaleTbSalesPrice;
	}
	public String getPdSaleTbProductName() {
		return pdSaleTbProductName;
	}
	public void setPdSaleTbProductName(String pdSaleTbProductName) {
		this.pdSaleTbProductName = pdSaleTbProductName;
	}
	public int getPdSaleTbRemainingAmount() {
		return pdSaleTbRemainingAmount;
	}
	public void setPdSaleTbRemainingAmount(int pdSaleTbRemainingAmount) {
		this.pdSaleTbRemainingAmount = pdSaleTbRemainingAmount;
	}
	@Override
	public String toString() {
		return "ClientWishlistVO [wishlistTbNo=" + wishlistTbNo + ", customerTbNo=" + customerTbNo + ", pdSaleTbNo="
				+ pdSaleTbNo + ", pdSaleTbSalesPrice=" + pdSaleTbSalesPrice + ", pdSaleTbProductName="
				+ pdSaleTbProductName + ", pdSaleTbRemainingAmount=" + pdSaleTbRemainingAmount + "]";
	}
	
	
		
	
	
}
