package com.mall.meongnyang.admin.shopping.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mall.meongnyang.admin.shopping.dao.AdminFaqDAO;
import com.mall.meongnyang.admin.shopping.vo.AdminFaqVO;

@Service
public class AdminInsertFaqServiceImpl implements AdminInsertFaqService {
	@Autowired
	private AdminFaqDAO adminFaqDAO;
	
	@Override
	public void insertFaq(AdminFaqVO vo) {
		adminFaqDAO.insertFaq(vo);
	}

}
