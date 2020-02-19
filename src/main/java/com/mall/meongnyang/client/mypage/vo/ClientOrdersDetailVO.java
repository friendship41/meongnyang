package com.mall.meongnyang.client.mypage.vo;

import java.sql.Date;

public class ClientOrdersDetailVO {
	
	private int ordersDetailTbNo;
    private int pdSaleTbNo;
    private int ordersDetailTbAmount;
    private String pdOrderTbNo;
    private	int ordersDetailTbPrice;
    
    private String pdSaleTbProductName;
    private Date pdOrderTbOrderDate;
    
    private int pdOrderTbPayment;
    private String pdOrderTbAddress;
    private String pdOrderTbReceiver;
    private int pdOrderTbDeliveryFee;
    private int pdOrderTbUsedPoint;
    
    private String pdImageTbPath;
   
	public int getOrdersDetailTbNo() {
		return ordersDetailTbNo;
	}
	public void setOrdersDetailTbNo(int ordersDetailTbNo) {
		this.ordersDetailTbNo = ordersDetailTbNo;
	}
	public int getPdSaleTbNo() {
		return pdSaleTbNo;
	}
	public void setPdSaleTbNo(int pdSaleTbNo) {
		this.pdSaleTbNo = pdSaleTbNo;
	}
	public int getOrdersDetailTbAmount() {
		return ordersDetailTbAmount;
	}
	public void setOrdersDetailTbAmount(int ordersDetailTbAmount) {
		this.ordersDetailTbAmount = ordersDetailTbAmount;
	}
	public String getPdOrderTbNo() {
		return pdOrderTbNo;
	}
	public void setPdOrderTbNo(String pdOrderTbNo) {
		this.pdOrderTbNo = pdOrderTbNo;
	}
	public String getPdSaleTbProductName() {
		return pdSaleTbProductName;
	}
	public void setPdSaleTbProductName(String pdSaleTbProductName) {
		this.pdSaleTbProductName = pdSaleTbProductName;
	}

	public int getOrdersDetailTbPrice() {
		return ordersDetailTbPrice;
	}
	public void setOrdersDetailTbPrice(int ordersDetailTbPrice) {
		this.ordersDetailTbPrice = ordersDetailTbPrice;
	}
	public Date getPdOrderTbOrderDate() {
		return pdOrderTbOrderDate;
	}
	public void setPdOrderTbOrderDate(Date pdOrderTbOrderDate) {
		this.pdOrderTbOrderDate = pdOrderTbOrderDate;
	}
	public int getPdOrderTbPayment() {
		return pdOrderTbPayment;
	}
	public void setPdOrderTbPayment(int pdOrderTbPayment) {
		this.pdOrderTbPayment = pdOrderTbPayment;
	}
	public String getPdOrderTbAddress() {
		return pdOrderTbAddress;
	}
	public void setPdOrderTbAddress(String pdOrderTbAddress) {
		this.pdOrderTbAddress = pdOrderTbAddress;
	}
	public String getPdOrderTbReceiver() {
		return pdOrderTbReceiver;
	}
	public void setPdOrderTbReceiver(String pdOrderTbReceiver) {
		this.pdOrderTbReceiver = pdOrderTbReceiver;
	}
	public int getPdOrderTbDeliveryFee() {
		return pdOrderTbDeliveryFee;
	}
	public void setPdOrderTbDeliveryFee(int pdOrderTbDeliveryFee) {
		this.pdOrderTbDeliveryFee = pdOrderTbDeliveryFee;
	}
	public int getPdOrderTbUsedPoint() {
		return pdOrderTbUsedPoint;
	}
	public void setPdOrderTbUsedPoint(int pdOrderTbUsedPoint) {
		this.pdOrderTbUsedPoint = pdOrderTbUsedPoint;
	}
	public String getPdImageTbPath() {
		return pdImageTbPath;
	}
	public void setPdImageTbPath(String pdImageTbPath) {
		this.pdImageTbPath = pdImageTbPath;
	}
	
}
