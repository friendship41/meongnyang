package com.mall.meongnyang.admin.shopping.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mall.meongnyang.admin.shopping.dao.AdminQnaTypeDAO;
import com.mall.meongnyang.admin.shopping.vo.AdminQnaTypeVO;

@Service("AdminUpdateQnaTypeService")
public class AdminUpdateQnaTypeServiceImpl implements AdminUpdateQnaTypeService {

	@Autowired
	private AdminQnaTypeDAO adminQnaTypeDAO;
	
	@Override
	public void updateQnaType(AdminQnaTypeVO adminQnaTypeVO) {
		// TODO Auto-generated method stub
		
	}

}
