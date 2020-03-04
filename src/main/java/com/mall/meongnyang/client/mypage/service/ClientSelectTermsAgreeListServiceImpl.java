package com.mall.meongnyang.client.mypage.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mall.meongnyang.client.member.vo.ClientTermsAgreeVO;
import com.mall.meongnyang.client.mypage.dao.ClientTermsAgreeDAO;

@Service("ClientselectTermsAgreeListService")
public class ClientSelectTermsAgreeListServiceImpl implements ClientSelectTermsAgreeListService {

	@Autowired
	private ClientTermsAgreeDAO clientTermsAgreeDAO;

	@Override
	public ClientTermsAgreeVO selectTermsAgree(ClientTermsAgreeVO clientTermsAgreeVO) {
		ClientTermsAgreeVO tempVO = clientTermsAgreeDAO.selectTermsAgree(clientTermsAgreeVO);
		
		return tempVO;
	}
	
	

}
