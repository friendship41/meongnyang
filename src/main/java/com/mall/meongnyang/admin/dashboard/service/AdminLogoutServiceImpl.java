package com.mall.meongnyang.admin.dashboard.service;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mall.meongnyang.admin.dashboard.dao.AdminLoginDAO;
import com.mall.meongnyang.admin.dashboard.vo.AdminLoginVO;

@Service("AdminLogoutService")
public class AdminLogoutServiceImpl implements AdminLogoutService{

	@Autowired
	private AdminLoginDAO adminLoginDAO;

	@Override
	public AdminLoginVO logout(AdminLoginVO adminLoginVO) {
		AdminLoginVO tempVO = adminLoginDAO.logout(adminLoginVO);
		return tempVO;
	}

	
	
	

}
