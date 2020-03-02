package com.mall.meongnyang.admin.shopping.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mall.meongnyang.admin.shopping.dao.AdminQnaDAO;
import com.mall.meongnyang.admin.shopping.vo.AdminQnaVO;

@Service("AdminDeleteQnaService")
public class AdminDeleteQnaServiceImpl implements AdminDeleteQnaService {

	@Autowired
	private AdminQnaDAO adminQnaDAO;
	
	@Override
	public void deleteQna(AdminQnaVO adminQnaVO) {
		adminQnaDAO.deleteQna(adminQnaVO);
		
	}

}
