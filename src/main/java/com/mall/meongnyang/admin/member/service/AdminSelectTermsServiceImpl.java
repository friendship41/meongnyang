package com.mall.meongnyang.admin.member.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mall.meongnyang.admin.member.dao.AdminTermsDAO;
import com.mall.meongnyang.admin.member.vo.AdminTermsVO;

@Service
public class AdminSelectTermsServiceImpl implements AdminSelectTermsService {
	@Autowired
	private AdminTermsDAO admintermsDAO;
	@Override
	public AdminTermsVO selectTerms(AdminTermsVO adminTermsVO) {
		
		return admintermsDAO.selectTerms(adminTermsVO);
	}

}
