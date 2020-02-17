package com.mall.meongnyang.admin.member.vo;

import java.sql.Date;

public class AdminTermsVO {
	private int termsTbNo;
	private String adminsTbId;
	private String termsTbTitle;
	private String termsTbContent;
	private String termsTbNecessary;
	private Date termsTbRegDate;
	private Date termsTbExpireDate;
	private Date termsTbChangeDate;
	private Date termsTbApplyDate;
	
	public int getTermsTbNo() {
		return termsTbNo;
	}
	public void setTermsTbNo(int termsTbNo) {
		this.termsTbNo = termsTbNo;
	}
	public String getAdminsTbId() {
		return adminsTbId;
	}
	public void setAdminsTbId(String adminsTbId) {
		this.adminsTbId = adminsTbId;
	}
	public String getTermsTbTitle() {
		return termsTbTitle;
	}
	public void setTermsTbTitle(String termsTbTitle) {
		this.termsTbTitle = termsTbTitle;
	}
	public String getTermsTbContent() {
		return termsTbContent;
	}
	public void setTermsTbContent(String termsTbContent) {
		this.termsTbContent = termsTbContent;
	}
	public String getTermsTbNecessary() {
		return termsTbNecessary;
	}
	public void setTermsTbNecessary(String termsTbNecessary) {
		this.termsTbNecessary = termsTbNecessary;
	}
	public Date getTermsTbRegDate() {
		return termsTbRegDate;
	}
	public void setTermsTbRegDate(Date termsTbRegDate) {
		this.termsTbRegDate = termsTbRegDate;
	}
	public Date getTermsTbExpireDate() {
		return termsTbExpireDate;
	}
	public void setTermsTbExpireDate(Date termsTbExpireDate) {
		this.termsTbExpireDate = termsTbExpireDate;
	}
	public Date getTermsTbChangeDate() {
		return termsTbChangeDate;
	}
	public void setTermsTbChangeDate(Date termsTbChangeDate) {
		this.termsTbChangeDate = termsTbChangeDate;
	}
	public Date getTermsTbApplyDate() {
		return termsTbApplyDate;
	}
	public void setTermsTbApplyDate(Date termsTbApplyDate) {
		this.termsTbApplyDate = termsTbApplyDate;
	}
	
	@Override
	public String toString() {
		return "AdminTermsVO [termsTbNo=" + termsTbNo + ", adminsTbId=" + adminsTbId + ", termsTbTitle=" + termsTbTitle
				+ ", termsTbContent=" + termsTbContent + ", termsTbNecessary=" + termsTbNecessary + ", termsTbRegDate="
				+ termsTbRegDate + ", termsTbExpireDate=" + termsTbExpireDate + ", termsTbChangeDate="
				+ termsTbChangeDate + ", termsTbApplyDate=" + termsTbApplyDate + "]";
	}
	
	
}
