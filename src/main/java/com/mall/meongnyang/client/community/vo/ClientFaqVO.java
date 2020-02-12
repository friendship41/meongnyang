package com.mall.meongnyang.client.community.vo;

public class ClientFaqVO {
	
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
		return "ClientFaqVO [faqTbNo=" + faqTbNo + ", faqTbTitle=" + faqTbTitle + ", faqTbContent=" + faqTbContent
				+ "]";
	}
	
	
}
