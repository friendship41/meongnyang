package com.mall.meongnyang.admin.shopping.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mall.meongnyang.admin.shopping.dao.AdminQnaDAO;
import com.mall.meongnyang.admin.shopping.vo.AdminQnaVO;

@Service("AdminUpdateQnaService")
public class AdminUpdateQnaServiceImpl implements AdminUpdateQnaService {

	@Autowired
	private AdminQnaDAO adminQnaDAO;
	
	@Override
	public void updateQna(AdminQnaVO adminQnaVO) {
		adminQnaDAO.updateQna(adminQnaVO);
		
	}

}
