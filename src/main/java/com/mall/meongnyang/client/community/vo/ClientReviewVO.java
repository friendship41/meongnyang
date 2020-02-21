package com.mall.meongnyang.client.community.vo;

import java.sql.Date;

import org.springframework.web.multipart.MultipartFile;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;

public class ClientReviewVO {

	private int reviewTbNo;
	private int customerTbNo;
	private String productTbCode;
	private String reviewTbContent;
	private String reviewTbWriter;	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "Asia/Seoul")
	private Date reviewTbRegDate;
	private double reviewTbRating;
	private String reviewTbImgPath;
	
	private String productTbName;
	private int count;
	
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	@JsonIgnore
	private MultipartFile file;
	
	private int startRow = 1;
	private int endRow = 9;
	
	public MultipartFile getFile() {
		return file;
	}
	public void setFile(MultipartFile file) {
		this.file = file;
	}
	public int getReviewTbNo() {
		return reviewTbNo;
	}
	public void setReviewTbNo(int reviewTbNo) {
		this.reviewTbNo = reviewTbNo;
	}
	public int getCustomerTbNo() {
		return customerTbNo;
	}
	public void setCustomerTbNo(int customerTbNo) {
		this.customerTbNo = customerTbNo;
	}
	public String getProductTbCode() {
		return productTbCode;
	}
	public void setProductTbCode(String productTbCode) {
		this.productTbCode = productTbCode;
	}
	public String getReviewTbContent() {
		return reviewTbContent;
	}
	public void setReviewTbContent(String reviewTbContent) {
		this.reviewTbContent = reviewTbContent;
	}
	public String getReviewTbWriter() {
		return reviewTbWriter;
	}
	public void setReviewTbWriter(String reviewTbWriter) {
		this.reviewTbWriter = reviewTbWriter;
	}
	public Date getReviewTbRegDate() {
		return reviewTbRegDate;
	}
	public void setReviewTbRegDate(Date reviewTbRegDate) {
		this.reviewTbRegDate = reviewTbRegDate;
	}
	public double getReviewTbRating() {
		return reviewTbRating;
	}
	public void setReviewTbRating(double reviewTbRating) {
		this.reviewTbRating = reviewTbRating;
	}
	public String getReviewTbImgPath() {
		return reviewTbImgPath;
	}
	public void setReviewTbImgPath(String reviewTbImgPath) {
		this.reviewTbImgPath = reviewTbImgPath;
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
	public String getProductTbName() {
		return productTbName;
	}
	public void setProductTbName(String productTbName) {
		this.productTbName = productTbName;
	}
	@Override
	public String toString() {
		return "ClientReviewVO [reviewTbNo=" + reviewTbNo + ", customerTbNo=" + customerTbNo + ", productTbCode="
				+ productTbCode + ", reviewTbContent=" + reviewTbContent + ", reviewTbWriter=" + reviewTbWriter
				+ ", reviewTbRegDate=" + reviewTbRegDate + ", reviewTbRating=" + reviewTbRating + ", reviewTbImgPath="
				+ reviewTbImgPath + ", productTbName=" + productTbName + ", count=" + count + ", file=" + file
				+ ", startRow=" + startRow + ", endRow=" + endRow + "]";
	}
}
