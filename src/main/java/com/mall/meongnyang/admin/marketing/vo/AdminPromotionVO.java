package com.mall.meongnyang.admin.marketing.vo;

import java.sql.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class AdminPromotionVO {
	private int promotionTbCode;
	private String promotionTbName;
	private String promotionTbContent;
	@JsonFormat(pattern = "yyyy-MM-dd")
	private Date promotionTbStartDate;
	@JsonFormat(pattern = "yyyy-MM-dd")
	private Date promotionTbEndDate;
	private int promotionTbDiscountRate;
	

    private String productTbCode; 
    private String pdSaleTbProductName;
    private int pdSaleTbSalesPrice;
    private int pdSaleTbReceivedAmount;
    private int pdSaleTbRemainingAmount;
    private int pdSaleTbDiscountRate;
	
	private String productCategoryTbParent;
    private String productCategoryTbMedian;
    private String productCategoryTbSub;
    
    private String category;
	
	public int getPromotionTbCode() {
		return promotionTbCode;
	}
	public void setPromotionTbCode(int promotionTbCode) {
		this.promotionTbCode = promotionTbCode;
	}
	public String getPromotionTbName() {
		return promotionTbName;
	}
	public void setPromotionTbName(String promotionTbName) {
		this.promotionTbName = promotionTbName;
	}
	public String getPromotionTbContent() {
		return promotionTbContent;
	}
	public void setPromotionTbContent(String promotionTbContent) {
		this.promotionTbContent = promotionTbContent;
	}
	public Date getPromotionTbStartDate() {
		return promotionTbStartDate;
	}
	public void setPromotionTbStartDate(Date promotionTbStartDate) {
		this.promotionTbStartDate = promotionTbStartDate;
	}
	public Date getPromotionTbEndDate() {
		return promotionTbEndDate;
	}
	public void setPromotionTbEndDate(Date promotionTbEndDate) {
		this.promotionTbEndDate = promotionTbEndDate;
	}
	public int getPromotionTbDiscountRate() {
		return promotionTbDiscountRate;
	}
	public void setPromotionTbDiscountRate(int promotionTbDiscountRate) {
		this.promotionTbDiscountRate = promotionTbDiscountRate;
	}
	public String getProductTbCode() {
		return productTbCode;
	}
	public void setProductTbCode(String productTbCode) {
		this.productTbCode = productTbCode;
	}
	public String getPdSaleTbProductName() {
		return pdSaleTbProductName;
	}
	public void setPdSaleTbProductName(String pdSaleTbProductName) {
		this.pdSaleTbProductName = pdSaleTbProductName;
	}
	public int getPdSaleTbSalesPrice() {
		return pdSaleTbSalesPrice;
	}
	public void setPdSaleTbSalesPrice(int pdSaleTbSalesPrice) {
		this.pdSaleTbSalesPrice = pdSaleTbSalesPrice;
	}
	public int getPdSaleTbReceivedAmount() {
		return pdSaleTbReceivedAmount;
	}
	public void setPdSaleTbReceivedAmount(int pdSaleTbReceivedAmount) {
		this.pdSaleTbReceivedAmount = pdSaleTbReceivedAmount;
	}
	public int getPdSaleTbRemainingAmount() {
		return pdSaleTbRemainingAmount;
	}
	public void setPdSaleTbRemainingAmount(int pdSaleTbRemainingAmount) {
		this.pdSaleTbRemainingAmount = pdSaleTbRemainingAmount;
	}
	public int getPdSaleTbDiscountRate() {
		return pdSaleTbDiscountRate;
	}
	public void setPdSaleTbDiscountRate(int pdSaleTbDiscountRate) {
		this.pdSaleTbDiscountRate = pdSaleTbDiscountRate;
	}
	public String getProductCategoryTbParent() {
		return productCategoryTbParent;
	}
	public void setProductCategoryTbParent(String productCategoryTbParent) {
		this.productCategoryTbParent = productCategoryTbParent;
	}
	public String getProductCategoryTbMedian() {
		return productCategoryTbMedian;
	}
	public void setProductCategoryTbMedian(String productCategoryTbMedian) {
		this.productCategoryTbMedian = productCategoryTbMedian;
	}
	public String getProductCategoryTbSub() {
		return productCategoryTbSub;
	}
	public void setProductCategoryTbSub(String productCategoryTbSub) {
		this.productCategoryTbSub = productCategoryTbSub;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	@Override
	public String toString() {
		return "AdminPromotionVO [promotionTbCode=" + promotionTbCode + ", promotionTbName=" + promotionTbName
				+ ", promotionTbContent=" + promotionTbContent + ", promotionTbStartDate=" + promotionTbStartDate
				+ ", promotionTbEndDate=" + promotionTbEndDate + ", promotionTbDiscountRate=" + promotionTbDiscountRate
				+ ", productTbCode=" + productTbCode + ", pdSaleTbProductName=" + pdSaleTbProductName
				+ ", pdSaleTbSalesPrice=" + pdSaleTbSalesPrice + ", pdSaleTbReceivedAmount=" + pdSaleTbReceivedAmount
				+ ", pdSaleTbRemainingAmount=" + pdSaleTbRemainingAmount + ", pdSaleTbDiscountRate="
				+ pdSaleTbDiscountRate + ", productCategoryTbParent=" + productCategoryTbParent
				+ ", productCategoryTbMedian=" + productCategoryTbMedian + ", productCategoryTbSub="
				+ productCategoryTbSub + "]";
	}
	
	
}
