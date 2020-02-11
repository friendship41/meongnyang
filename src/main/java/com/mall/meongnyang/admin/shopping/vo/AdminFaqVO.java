package com.mall.meongnyang.admin.shopping.vo;

public class AdminFaqVO {
	
	private int faqTbNo;
	private String faqTbTitle;
	private String faqTbContent;

	public int getFaqTbNo() {
		return faqTbNo;
	}
	public void setFaqTbNo(int faqTbNo) {
		this.faqTbNo = faqTbNo;
	}
	public String getFaqTbTitle() {
		return faqTbTitle;
	}
	public void setFaqTbTitle(String faqTbTitle) {
		this.faqTbTitle = faqTbTitle;
	}
	public String getFaqTbContent() {
		return faqTbContent;
	}
	public void setFaqTbContent(String faqTbContent) {
		this.faqTbContent = faqTbContent;
	}
	@Override
	public String toString() {
		return "AdminFaqVO [faqTbNO=" + faqTbNo + ", faqTbTitle=" + faqTbTitle + ", faqTbContent=" + faqTbContent + "]";
	}

}
