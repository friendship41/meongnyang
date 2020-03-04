package com.mall.meongnyang.client.mypage.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mall.meongnyang.client.member.vo.ClientTermsAgreeVO;
import com.mall.meongnyang.client.mypage.dao.ClientTermsAgreeDAO;

@Service("ClientUpdateTermsAgreeListService")
public class ClientUpdateTermsAgreeListServiceImpl implements ClientUpdateTermsAgreeListService {

	@Autowired
	private ClientTermsAgreeDAO clientTermsAgreeDAO;
	
	@Override
	public void updateTermsAgreeList(ClientTermsAgreeVO clientTermsAgreeVO) {
		clientTermsAgreeDAO.updateTermsAgree(clientTermsAgreeVO);

	}

}
