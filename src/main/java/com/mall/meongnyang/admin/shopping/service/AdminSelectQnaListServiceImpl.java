package com.mall.meongnyang.admin.shopping.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mall.meongnyang.admin.shopping.dao.AdminQnaDAO;
import com.mall.meongnyang.admin.shopping.vo.AdminQnaVO;

@Service("AdminSelectQnaListService")
public class AdminSelectQnaListServiceImpl implements AdminSelectQnaListService {

	@Autowired
	private AdminQnaDAO adminQnaDAO;
	
	@Override
	public AdminQnaVO selectQnaList(AdminQnaVO adminQnaVO) {
		// TODO Auto-generated method stub
		return null;
	}

}
