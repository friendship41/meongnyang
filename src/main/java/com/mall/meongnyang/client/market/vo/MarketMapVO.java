package com.mall.meongnyang.client.market.vo;

public class MarketMapVO {
	
	private int customerTbNo;
	private int marketTbNo;
	private String marketTbTitle;
	private String marketTbSellOrBuy;
	private int cmAddressTbNo;
	private double cmAddressTbLat; //위도
	private double cmAddressTbLng; //경도
	
	
	public int getCustomerTbNo() {
		return customerTbNo;
	}
	public void setCustomerTbNo(int customerTbNo) {
		this.customerTbNo = customerTbNo;
	}
	public int getMarketTbNo() {
		return marketTbNo;
	}
	public String getMarketTbTitle() {
		return marketTbTitle;
	}
	public String getMarketTbSellOrBuy() {
		return marketTbSellOrBuy;
	}
	public int getCmAddressTbNo() {
		return cmAddressTbNo;
	}
	public double getCmAddressTbLat() {
		return cmAddressTbLat;
	}
	public double getCmAddressTbLng() {
		return cmAddressTbLng;
	}
	public void setMarketTbNo(int marketTbNo) {
		this.marketTbNo = marketTbNo;
	}
	public void setMarketTbTitle(String marketTbTitle) {
		this.marketTbTitle = marketTbTitle;
	}
	public void setMarketTbSellOrBuy(String marketTbSellOrBuy) {
		this.marketTbSellOrBuy = marketTbSellOrBuy;
	}
	public void setCmAddressTbNo(int cmAddressTbNo) {
		this.cmAddressTbNo = cmAddressTbNo;
	}
	public void setCmAddressTbLat(double cmAddressTbLat) {
		this.cmAddressTbLat = cmAddressTbLat;
	}
	public void setCmAddressTbLng(double cmAddressTbLng) {
		this.cmAddressTbLng = cmAddressTbLng;
	}
	@Override
	public String toString() {
		return "MarketMapVO [marketTbNo=" + marketTbNo + ", marketTbTitle=" + marketTbTitle + ", marketTbSellOrBuy="
				+ marketTbSellOrBuy + ", cmAddressTbNo=" + cmAddressTbNo + ", cmAddressTbLat=" + cmAddressTbLat
				+ ", cmAddressTbLng=" + cmAddressTbLng + "]";
	}
	
}
