package com.mall.meongnyang.admin.shopping.vo;

import java.sql.Date;

public class AdminQnaVO {
	private int qnaTbNo;
	private int pdSaleTbNo;
	private int qnaTypeTbNo;
	private int customerTbNo;
	private String qnaTbTitle;
	private String qnaTbContent;
	private Date qnaTbRegDate;
	private int qnaTbReadcount;
	private String qnaTbSecret;
	private int qnaTbRef;
	private int qnaTbStep;
	private int qnaTbDepth;
	private String qnaTbStatus;
	private int rnum;
	private String customerTbEmail;
	private String customerTbName;
	
	
	public String getCustomerTbEmail() {
		return customerTbEmail;
	}
	public void setCustomerTbEmail(String customerTbEmail) {
		this.customerTbEmail = customerTbEmail;
	}
	public String getCustomerTbName() {
		return customerTbName;
	}
	public void setCustomerTbName(String customerTbName) {
		this.customerTbName = customerTbName;
	}
	public int getRnum() {
		return rnum;
	}
	public void setRnum(int rnum) {
		this.rnum = rnum;
	}
	private int startRow; 
	private int endRow; 
	
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
	public String getQnaTbStatus() {
		return qnaTbStatus;
	}
	public void setQnaTbStatus(String qnaTbStatus) {
		this.qnaTbStatus = qnaTbStatus;
	}
	public int getQnaTbNo() {
		return qnaTbNo;
	}
	public void setQnaTbNo(int qnaTbNo) {
		this.qnaTbNo = qnaTbNo;
	}
	public int getPdSaleTbNo() {
		return pdSaleTbNo;
	}
	public void setPdSaleTbNo(int pdSaleTbNo) {
		this.pdSaleTbNo = pdSaleTbNo;
	}
	public int getQnaTypeTbNo() {
		return qnaTypeTbNo;
	}
	public void setQnaTypeTbNo(int qnaTypeTbNo) {
		this.qnaTypeTbNo = qnaTypeTbNo;
	}
	public int getCustomerTbNo() {
		return customerTbNo;
	}
	public void setCustomerTbNo(int customerTbNo) {
		this.customerTbNo = customerTbNo;
	}
	public String getQnaTbTitle() {
		return qnaTbTitle;
	}
	public void setQnaTbTitle(String qnaTbTitle) {
		this.qnaTbTitle = qnaTbTitle;
	}
	public String getQnaTbContent() {
		return qnaTbContent;
	}
	public void setQnaTbContent(String qnaTbContent) {
		this.qnaTbContent = qnaTbContent;
	}
	public Date getQnaTbRegDate() {
		return qnaTbRegDate;
	}
	public void setQnaTbRegDate(Date qnaTbRegDate) {
		this.qnaTbRegDate = qnaTbRegDate;
	}
	public int getQnaTbReadcount() {
		return qnaTbReadcount;
	}
	public void setQnaTbReadcount(int qnaTbReadcount) {
		this.qnaTbReadcount = qnaTbReadcount;
	}
	public String getQnaTbSecret() {
		return qnaTbSecret;
	}
	public void setQnaTbSecret(String qnaTbSecret) {
		this.qnaTbSecret = qnaTbSecret;
	}
	public int getQnaTbRef() {
		return qnaTbRef;
	}
	public void setQnaTbRef(int qnaTbRef) {
		this.qnaTbRef = qnaTbRef;
	}
	public int getQnaTbStep() {
		return qnaTbStep;
	}
	public void setQnaTbStep(int qnaTbStep) {
		this.qnaTbStep = qnaTbStep;
	}
	public int getQnaTbDepth() {
		return qnaTbDepth;
	}
	public void setQnaTbDepth(int qnaTbDepth) {
		this.qnaTbDepth = qnaTbDepth;
	}
	
	@Override
	public String toString() {
		return "AdminQnaVO [qnaTbNo=" + qnaTbNo + ", pdSaleTbNo=" + pdSaleTbNo + ", qnaTypeTbNo=" + qnaTypeTbNo
				+ ", customerTbNo=" + customerTbNo + ", qnaTbTitle=" + qnaTbTitle + ", qnaTbContent=" + qnaTbContent
				+ ", qnaTbRegDate=" + qnaTbRegDate + ", qnaTbReadcount=" + qnaTbReadcount + ", qnaTbSecret="
				+ qnaTbSecret + ", qnaTbRef=" + qnaTbRef + ", qnaTbStep=" + qnaTbStep + ", qnaTbDepth=" + qnaTbDepth
				+ ", qnaTbStatus=" + qnaTbStatus + ", rnum=" + rnum + ", customerTbEmail=" + customerTbEmail
				+ ", customerTbName=" + customerTbName + ", startRow=" + startRow + ", endRow=" + endRow + "]";
	}
	
	
	
}
