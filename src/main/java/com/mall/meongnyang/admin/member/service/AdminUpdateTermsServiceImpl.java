package com.mall.meongnyang.admin.member.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mall.meongnyang.admin.member.dao.AdminTermsDAO;
import com.mall.meongnyang.admin.member.vo.AdminTermsVO;

@Service
public class AdminUpdateTermsServiceImpl implements AdminUpdateTermsService {
	@Autowired
	private AdminTermsDAO adminTermsDAO;
	
	@Override
	public void updateTerms(AdminTermsVO adminTermsVO) {
		if("true".equals(adminTermsVO.getTermsTbNecessary())) {
			adminTermsVO.setTermsTbNecessary("Y");
		}else if(adminTermsVO.getTermsTbNecessary()==null) {
			adminTermsVO.setTermsTbNecessary("N");
		}
		adminTermsDAO.updateTerms(adminTermsVO);
	}

}
