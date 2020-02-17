package com.mall.meongnyang.client.market.vo;

import java.sql.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class ClientMarketCommentVO {
	
	private int marketCommentTbNo;
	private int marketTbNo;
	private String marketCommentTbContent;
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "Asia/Seoul")
	private Date marketCommentTbRegDate;
	private int marketCommentTbRef;
	private int marketCommentTbStep;
	private int marketCommentTbDepth;
	private int customerTbNo;
	
	public int getMarketCommentTbNo() {
		return marketCommentTbNo;
	}
	public void setMarketCommentTbNo(int marketCommentTbNo) {
		this.marketCommentTbNo = marketCommentTbNo;
	}
	public int getMarketTbNo() {
		return marketTbNo;
	}
	public void setMarketTbNo(int marketTbNo) {
		this.marketTbNo = marketTbNo;
	}
	public String getMarketCommentTbContent() {
		return marketCommentTbContent;
	}
	public void setMarketCommentTbContent(String marketCommentTbContent) {
		this.marketCommentTbContent = marketCommentTbContent;
	}
	public Date getMarketCommentTbRegDate() {
		return marketCommentTbRegDate;
	}
	public void setMarketCommentTbRegDate(Date marketCommentTbRegDate) {
		this.marketCommentTbRegDate = marketCommentTbRegDate;
	}
	public int getMarketCommentTbRef() {
		return marketCommentTbRef;
	}
	public void setMarketCommentTbRef(int marketCommentTbRef) {
		this.marketCommentTbRef = marketCommentTbRef;
	}
	public int getMarketCommentTbStep() {
		return marketCommentTbStep;
	}
	public void setMarketCommentTbStep(int marketCommentTbStep) {
		this.marketCommentTbStep = marketCommentTbStep;
	}
	public int getMarketCommentTbDepth() {
		return marketCommentTbDepth;
	}
	public void setMarketCommentTbDepth(int marketCommentTbDepth) {
		this.marketCommentTbDepth = marketCommentTbDepth;
	}
	public int getCustomerTbNo() {
		return customerTbNo;
	}
	public void setCustomerTbNo(int customerTbNo) {
		this.customerTbNo = customerTbNo;
	}

	@Override
	public String toString() {
		return "ClientMarketCommentVO [marketCommentTbNo=" + marketCommentTbNo + ", marketTbNo=" + marketTbNo
				+ ", marketCommentTbContent=" + marketCommentTbContent + ", marketCommentTbRegDate="
				+ marketCommentTbRegDate + ", marketCommentTbRef=" + marketCommentTbRef + ", marketCommentTbStep="
				+ marketCommentTbStep + ", marketCommentTbDepth=" + marketCommentTbDepth + ", customerTbNo="
				+ customerTbNo + "]";
	}
}
