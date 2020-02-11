package com.mall.meongnyang.admin.dashboard.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mall.meongnyang.admin.dashboard.dao.AdminLoginDAO;
import com.mall.meongnyang.admin.dashboard.vo.AdminLoginVO;

@Service("AdminLoginService")
public class AdminSelectLoginServiceImpl implements AdminSelectLoginService{

	@Autowired
	private AdminLoginDAO adminLoginDAO;
	
	@Override
	public AdminLoginVO selectLogin(AdminLoginVO adminLoginVO) {
		
		return adminLoginDAO.selectLogin(adminLoginVO);
	}

}
