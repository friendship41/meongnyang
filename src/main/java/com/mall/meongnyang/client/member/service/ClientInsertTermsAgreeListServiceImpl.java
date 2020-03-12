package com.mall.meongnyang.client.member.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mall.meongnyang.client.member.dao.ClientTermsDAO;
import com.mall.meongnyang.client.member.vo.ClientTermsAgreeVO;

@Service
public class ClientInsertTermsAgreeListServiceImpl implements ClientInsertTermsAgreeListService {

	@Autowired
	private ClientTermsDAO clientTermsDAO;
	
	@Override
	public void insertTermsAgreeListService(ClientTermsAgreeVO clientTermsAgreeVO) {
	
		clientTermsDAO.insertTermsAgreeList(clientTermsAgreeVO);
	}

}