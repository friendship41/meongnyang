package com.mall.meongnyang.admin.shopping.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mall.meongnyang.admin.shopping.dao.AdminFaqDAO;
import com.mall.meongnyang.admin.shopping.vo.AdminFaqVO;

@Service
public class AdminUpdateFaqServiceImpl implements AdminUpdateFaqService {

	@Autowired
	private AdminFaqDAO adminFaqDAO;
	
	@Override
	public void updateFaq(AdminFaqVO vo) {
		adminFaqDAO.updateFaq(vo);
	}

}
