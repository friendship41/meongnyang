package com.mall.meongnyang.admin.shopping.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mall.meongnyang.admin.shopping.dao.AdminQnaTypeDAO;
import com.mall.meongnyang.admin.shopping.vo.AdminQnaTypeVO;

@Service("AdminSelectQnaTypeService")
public class AdminSelectQnaTypeServiceImpl implements AdminSelectQnaTypeService {

	@Autowired
	private AdminQnaTypeDAO adminQnaTypeDAO;
	
	@Override
	public AdminQnaTypeVO selectQnaType(AdminQnaTypeVO adminQnaTypeVO) {
		// TODO Auto-generated method stub
		return null;
	}

}
