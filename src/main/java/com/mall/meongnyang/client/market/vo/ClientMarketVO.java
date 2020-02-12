package com.mall.meongnyang.client.market.vo;

import java.sql.Date;

public class ClientMarketVO {
	
	private int marketTbNo;
	private int customerTbNo;
	private String marketTbTitle;
	private String marketTbContent;
	private Date marketTbRegDate;
	private int marketTbReadCount;
	private String marketTbSellOrBuy;
	private String marketTbImgPath;
	
	public int getMarketTbNo() {
		return marketTbNo;
	}
	public void setMarketTbNo(int marketTbNo) {
		this.marketTbNo = marketTbNo;
	}
	public int getCustomerTbNo() {
		return customerTbNo;
	}
	public void setCustomerTbNo(int customerTbNo) {
		this.customerTbNo = customerTbNo;
	}
	public String getMarketTbTitle() {
		return marketTbTitle;
	}
	public void setMarketTbTitle(String marketTbTitle) {
		this.marketTbTitle = marketTbTitle;
	}
	public String getMarketTbContent() {
		return marketTbContent;
	}
	public void setMarketTbContent(String marketTbContent) {
		this.marketTbContent = marketTbContent;
	}
	public Date getMarketTbRegDate() {
		return marketTbRegDate;
	}
	public void setMarketTbRegDate(Date marketTbRegDate) {
		this.marketTbRegDate = marketTbRegDate;
	}
	public int getMarketTbReadCount() {
		return marketTbReadCount;
	}
	public void setMarketTbReadCount(int marketTbReadCount) {
		this.marketTbReadCount = marketTbReadCount;
	}
	public String getMarketTbSellOrBuy() {
		return marketTbSellOrBuy;
	}
	public void setMarketTbSellOrBuy(String marketTbSellOrBuy) {
		this.marketTbSellOrBuy = marketTbSellOrBuy;
	}
	public String getMarketTbImgPath() {
		return marketTbImgPath;
	}
	public void setMarketTbImgPath(String marketTbImgPath) {
		this.marketTbImgPath = marketTbImgPath;
	}

}
