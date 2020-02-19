package com.mall.meongnyang.client.mypage.vo;

public class ClientOrdersDetailVO {
	
	private int ordersDetailTbNo;
    private int pdSaleTbNo;
    private int ordersDetailTbAmount;
    private String pdOrderTbNo;
   
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
	@Override
	public String toString() {
		return "ClientOrdersDetailVO [ordersDetailTbNo=" + ordersDetailTbNo + ", pdSaleTbNo=" + pdSaleTbNo
				+ ", ordersDetailTbAmount=" + ordersDetailTbAmount + ", pdOrderTbNo=" + pdOrderTbNo + "]";
	}
}
