package com.mall.meongnyang.admin.member.vo;

import java.sql.Date;

public class AdminOverviewVisitorVO {

	String userCountTbDate;
	int userCountTbVisitors;
	int userCountTbJoiners;
	
	Date StartDate; //시작선택일
	Date EndDate;//마지막선택일 
	
	
	public Date getStartDate() {
		return StartDate;
	}
	public void setStartDate(Date startDate) {
		StartDate = startDate;
	}
	public Date getEndDate() {
		return EndDate;
	}
	public void setEndDate(Date endDate) {
		EndDate = endDate;
	}
	
	
	public String getUserCountTbDate() {
		return userCountTbDate;
	}
	public void setUserCountTbDate(String userCountTbDate) {
		this.userCountTbDate = userCountTbDate;
	}
	public int getUserCountTbVisitors() {
		return userCountTbVisitors;
	}
	public void setUserCountTbVisitors(int userCountTbVisitors) {
		this.userCountTbVisitors = userCountTbVisitors;
	}
	public int getUserCountTbJoiners() {
		return userCountTbJoiners;
	}
	public void setUserCountTbJoiners(int userCountTbJoiners) {
		this.userCountTbJoiners = userCountTbJoiners;
	}
	
	
	
//	public AdminOverviewVisitorVO(String userCountTbDate, int userCountTbVisitors, int userCountTbJoiners) {
//		super();
//		this.userCountTbDate = userCountTbDate;
//		this.userCountTbVisitors = userCountTbVisitors;
//		this.userCountTbJoiners = userCountTbJoiners;
//	}
	@Override
	public String toString() {
		return "AdminOverviewVisitorVO [userCountTbDate=" + userCountTbDate + ", userCountTbVisitors="
				+ userCountTbVisitors + ", userCountTbJoiners=" + userCountTbJoiners + "]";
	}
	
	
}
