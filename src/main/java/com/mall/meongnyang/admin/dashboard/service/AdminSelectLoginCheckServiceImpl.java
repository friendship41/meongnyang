package com.mall.meongnyang.admin.dashboard.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mall.meongnyang.admin.dashboard.dao.AdminLoginDAO;
import com.mall.meongnyang.admin.dashboard.vo.AdminLoginVO;

@Service("AdminSelectLoginCheck")
public class AdminSelectLoginCheckServiceImpl implements AdminSelectLoginCheckService{

	@Autowired
	private AdminLoginDAO adminLoginDAO;
	
	@Override
	public AdminLoginVO selectLoginCheck(AdminLoginVO adminLoginVO) {
				
		AdminLoginVO tempVO = adminLoginDAO.selectLoginCheck(adminLoginVO);
				
		return tempVO;
		
	}
	
}
