package com.mall.meongnyang.client.member.vo;

import java.sql.Date;

public class ClientTermsAgreeVO {
	private int termsAgreeTbNo;  
	private int termsTbNo; 
	private int customerTbNo;
	private String termsAgreeTbConsentStatus;
	private Date termsAgreeTbConsentDate;
	private Date termsAgreeTbChangeDate;
	
	public int getTermsAgreeTbNo() {
		return termsAgreeTbNo;
	}
	public void setTermsAgreeTbNo(int termsAgreeTbNo) {
		this.termsAgreeTbNo = termsAgreeTbNo;
	}
	public int getTermsTbNo() {
		return termsTbNo;
	}
	public void setTermsTbNo(int termsTbNo) {
		this.termsTbNo = termsTbNo;
	}
	public int getCustomerTbNo() {
		return customerTbNo;
	}
	public void setCustomerTbNo(int customerTbNo) {
		this.customerTbNo = customerTbNo;
	}
	public String getTermsAgreeTbConsentStatus() {
		return termsAgreeTbConsentStatus;
	}
	public void setTermsAgreeTbConsentStatus(String termsAgreeTbConsentStatus) {
		this.termsAgreeTbConsentStatus = termsAgreeTbConsentStatus;
	}
	public Date getTermsAgreeTbConsentDate() {
		return termsAgreeTbConsentDate;
	}
	public void setTermsAgreeTbConsentDate(Date termsAgreeTbConsentDate) {
		this.termsAgreeTbConsentDate = termsAgreeTbConsentDate;
	}
	public Date getTermsAgreeTbChangeDate() {
		return termsAgreeTbChangeDate;
	}
	public void setTermsAgreeTbChangeDate(Date termsAgreeTbChangeDate) {
		this.termsAgreeTbChangeDate = termsAgreeTbChangeDate;
	}
	
	@Override
	public String toString() {
		return "ClientTermsAgreeVO [termsAgreeTbNo=" + termsAgreeTbNo + ", termsTbNo=" + termsTbNo + ", customerTbNo="
				+ customerTbNo + ", termsAgreeTbConsentStatus=" + termsAgreeTbConsentStatus
				+ ", termsAgreeTbConsentDate=" + termsAgreeTbConsentDate + ", termsAgreeTbChangeDate="
				+ termsAgreeTbChangeDate + "]";
	}
	
	
}
