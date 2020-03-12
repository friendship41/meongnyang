package com.mall.meongnyang.admin.dashboard.dao;

import javax.servlet.http.HttpSession;

import com.mall.meongnyang.admin.dashboard.vo.AdminLoginVO;

public interface AdminLoginDAO {
	
	//loginCheck
	public AdminLoginVO selectLoginCheck(AdminLoginVO adminLoginVO);
	
	
	
	// Logout
	public AdminLoginVO logout(AdminLoginVO adminLoginVO);
	
}
