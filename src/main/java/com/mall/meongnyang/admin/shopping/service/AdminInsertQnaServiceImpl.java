package com.mall.meongnyang.admin.shopping.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mall.meongnyang.admin.shopping.dao.AdminQnaDAO;
import com.mall.meongnyang.admin.shopping.vo.AdminQnaVO;

@Service("AdminInsertQnaService")
public class AdminInsertQnaServiceImpl implements AdminInsertQnaService {

	@Autowired
	private AdminQnaDAO adminQnaDAO;
	
	@Override
	public void insertQna(AdminQnaVO adminQnaVO) {
		adminQnaDAO.insertQna(adminQnaVO);
		adminQnaDAO.updateStep(adminQnaVO);
		adminQnaDAO.updateStepDepth(adminQnaVO);
		
	}

}
