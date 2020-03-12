package com.mall.meongnyang.admin.shopping.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mall.meongnyang.admin.shopping.dao.AdminQnaDAO;
import com.mall.meongnyang.admin.shopping.vo.AdminQnaVO;

@Service("AdminSelectQnaService")
public class AdminSelectQnaServiceImpl implements AdminSelectQnaService {

	@Autowired
	private AdminQnaDAO adminQnaDAO;
	
	@Override
	public AdminQnaVO selectQna(AdminQnaVO adminQnaVO) {
		
		return adminQnaDAO.selectQna(adminQnaVO);
	}

}
