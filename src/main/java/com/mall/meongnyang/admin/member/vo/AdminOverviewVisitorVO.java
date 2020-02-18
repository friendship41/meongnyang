package com.mall.meongnyang.admin.member.vo;

public class AdminOverviewVisitorVO {

	String userCountTbDate;
	int userCountTbVisitors;
	int userCountTbJoiners;
	
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
