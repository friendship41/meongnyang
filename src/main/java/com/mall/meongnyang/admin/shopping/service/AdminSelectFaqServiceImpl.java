package com.mall.meongnyang.admin.shopping.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mall.meongnyang.admin.shopping.dao.AdminFaqDAO;
import com.mall.meongnyang.admin.shopping.vo.AdminFaqVO;

@Service
public class AdminSelectFaqServiceImpl implements AdminSelectFaqService {

	@Autowired
	private AdminFaqDAO adminFaqDAO;
	
	@Override
	public AdminFaqVO selectFaq(int num) {
		return adminFaqDAO.selectFaq(num);
	}
}
