package com.mall.meongnyang.admin.shopping.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mall.meongnyang.admin.shopping.dao.AdminQnaDAO;
import com.mall.meongnyang.admin.shopping.vo.AdminQnaVO;
import org.springframework.transaction.annotation.Transactional;

@Service("AdminInsertQnaService")
public class AdminInsertQnaServiceImpl implements AdminInsertQnaService {

	@Autowired
	private AdminQnaDAO adminQnaDAO;
	
	

	@Override
	@Transactional
	public void insertAdminQnaReply(AdminQnaVO adminQnaVO) {
		
		adminQnaDAO.insertAdminQnaReply(adminQnaVO);
		adminQnaDAO.updateStep(adminQnaVO);
		adminQnaDAO.updateStepDepth(adminQnaVO);
		
	}

}
