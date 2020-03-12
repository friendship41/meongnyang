package com.mall.meongnyang.admin.dashboard.vo;

public class AdminLoginVO {
	private String adminsTbId;
	private String adminsTbPassword;
	private String adminsTbPosition;
	private String adminsTbEmploymentStatus;
	
	
	public String getAdminsTbId() {
		return adminsTbId;
	}
	public void setAdminsTbId(String adminsTbId) {
		this.adminsTbId = adminsTbId;
	}
	public String getAdminsTbPassword() {
		return adminsTbPassword;
	}
	public void setAdminsTbPassword(String adminsTbPassword) {
		this.adminsTbPassword = adminsTbPassword;
	}
	public String getAdminsTbPosition() {
		return adminsTbPosition;
	}
	public void setAdminsTbPosition(String adminsTbPosition) {
		this.adminsTbPosition = adminsTbPosition;
	}
	public String getAdminsTbEmploymentStatus() {
		return adminsTbEmploymentStatus;
	}
	public void setAdminsTbEmploymentStatus(String adminsTbEmploymentStatus) {
		this.adminsTbEmploymentStatus = adminsTbEmploymentStatus;
	}
	@Override
	public String toString() {
		return "AdminLoginVO [adminsTbId=" + adminsTbId + ", adminsTbPassword=" + adminsTbPassword
				+ ", adminsTbPosition=" + adminsTbPosition + ", adminsTbEmploymentStatus=" + adminsTbEmploymentStatus
				+ ", getAdminsTbId()=" + getAdminsTbId() + ", getAdminsTbPassword()=" + getAdminsTbPassword()
				+ ", getAdminsTbPosition()=" + getAdminsTbPosition() + ", getAdminsTbEmploymentStatus()="
				+ getAdminsTbEmploymentStatus() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	
	
	
	
}
