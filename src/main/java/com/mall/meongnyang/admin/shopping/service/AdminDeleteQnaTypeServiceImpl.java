package com.mall.meongnyang.admin.shopping.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mall.meongnyang.admin.shopping.dao.AdminQnaTypeDAO;
import com.mall.meongnyang.admin.shopping.vo.AdminQnaTypeVO;

@Service("AdminDeleteQnaTypeService")
public class AdminDeleteQnaTypeServiceImpl implements AdminDeleteQnaTypeService {

	@Autowired
	private AdminQnaTypeDAO adminQnaTypeDAO;
	
	@Override
	public void deleteQnaType(AdminQnaTypeVO adminQnaTypeVO) {
		adminQnaTypeDAO.deleteQnaType(adminQnaTypeVO);
		
	}

}
