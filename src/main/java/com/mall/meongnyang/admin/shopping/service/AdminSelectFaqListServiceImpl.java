package com.mall.meongnyang.admin.shopping.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mall.meongnyang.admin.shopping.dao.AdminFaqDAO;
import com.mall.meongnyang.admin.shopping.vo.AdminFaqVO;

@Service
public class AdminSelectFaqListServiceImpl implements AdminSelectFaqListService {

	@Autowired
	private AdminFaqDAO adminFaqDAO;

	@Override
	public List<AdminFaqVO> selectFaqList() {
		return adminFaqDAO.selectFaqList();
	}

}
