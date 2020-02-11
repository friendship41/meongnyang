package com.mall.meongnyang.admin.marketing.vo;

import java.sql.Date;

public class AdminPromotionVO {
	private int promotionTbCode;
	private String promotionTbName;
	private String promotionTbContent;
	private Date promotionTbStartDate;
	private Date promotionTbEndDate;
	
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
	
	
}
