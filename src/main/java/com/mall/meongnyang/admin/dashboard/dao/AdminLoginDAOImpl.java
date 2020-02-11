package com.mall.meongnyang.admin.dashboard.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mall.meongnyang.admin.dashboard.vo.AdminLoginVO;

@Repository("AdminLoginDAO")
public class AdminLoginDAOImpl implements AdminLoginDAO{

	@Autowired
	private SqlSessionTemplate sqlSessionTemplate;
	
	@Override
	public AdminLoginVO selectLogin(AdminLoginVO adminLoginVO) {
		
		return sqlSessionTemplate.selectOne("AdminLoginDAO.selectLogin", adminLoginVO); 
	}
	
}
