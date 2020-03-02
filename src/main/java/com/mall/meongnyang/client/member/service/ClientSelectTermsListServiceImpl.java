package com.mall.meongnyang.client.member.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mall.meongnyang.admin.member.vo.AdminTermsVO;
import com.mall.meongnyang.client.member.dao.ClientTermsDAO;

@Service
public class ClientSelectTermsListServiceImpl implements ClientSelectTermsListService {
	
	@Autowired
	private ClientTermsDAO clientTermsDAO;
	
	@Override
	public List<AdminTermsVO> selectTermsNecessaryList(AdminTermsVO adminTermsVO) {
		
		return clientTermsDAO.selectTermsNecessaryList(adminTermsVO);
	}

	@Override
	public List<AdminTermsVO> selectTermsOptionList(AdminTermsVO adminTermsVO) {
		
		return clientTermsDAO.selectTermsOptionList(adminTermsVO);
	}
	
}
