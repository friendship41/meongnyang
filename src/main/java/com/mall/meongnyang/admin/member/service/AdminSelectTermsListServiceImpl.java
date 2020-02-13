package com.mall.meongnyang.admin.member.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mall.meongnyang.admin.member.dao.AdminTermsDAO;
import com.mall.meongnyang.admin.member.vo.AdminTermsVO;

@Service
public class AdminSelectTermsListServiceImpl implements AdminSelectTermsListService {
	
	@Autowired
	private AdminTermsDAO adminTermsDAO;
	
	@Override
	public List<AdminTermsVO> selectTermsList(AdminTermsVO adminTermsVO) {
		return adminTermsDAO.selectTermsList(adminTermsVO);
	}

}
