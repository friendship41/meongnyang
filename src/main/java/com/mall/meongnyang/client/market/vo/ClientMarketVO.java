package com.mall.meongnyang.client.market.vo;

import java.sql.Date;

import org.springframework.web.multipart.MultipartFile;

public class ClientMarketVO {
	
	private int marketTbNo;
	private int customerTbNo;
	private String marketTbTitle;
	private String marketTbContent;
	private Date marketTbRegDate;
	private int marketTbReadCount;
	private String marketTbSellOrBuy;
	private String marketTbImgPath;
	private String cmAddressTbNo;
	
	private MultipartFile uploadFile;
	
	
	private int startRow; //현재페이지의 시작글번호
	private int endRow; //현재페이지의 끝 글번호
	
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
	public MultipartFile getUploadFile() {
		return uploadFile;
	}
	public void setUploadFile(MultipartFile uploadFile) {
		this.uploadFile = uploadFile;
	}

	public int getStartRow() {
		return startRow;
	}
	public void setStartRow(int startRow) {
		this.startRow = startRow;
	}
	public int getEndRow() {
		return endRow;
	}
	public void setEndRow(int endRow) {
		this.endRow = endRow;
	}

	public String getCmAddressTbNo() {
		return cmAddressTbNo;
	}
	public void setCmAddressTbNo(String cmAddressTbNo) {
		this.cmAddressTbNo = cmAddressTbNo;
	}
	@Override
	public String toString() {
		return "ClientMarketVO [marketTbNo=" + marketTbNo + ", customerTbNo=" + customerTbNo + ", marketTbTitle="
				+ marketTbTitle + ", marketTbContent=" + marketTbContent + ", marketTbRegDate=" + marketTbRegDate
				+ ", marketTbReadCount=" + marketTbReadCount + ", marketTbSellOrBuy=" + marketTbSellOrBuy
				+ ", marketTbImgPath=" + marketTbImgPath + ", cmAddressTbNo=" + cmAddressTbNo + ", uploadFile="
				+ uploadFile + ", startRow=" + startRow + ", endRow=" + endRow + "]";
	}
	
}
