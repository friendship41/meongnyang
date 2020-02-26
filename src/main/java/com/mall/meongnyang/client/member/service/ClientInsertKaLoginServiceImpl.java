package com.mall.meongnyang.client.member.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mall.meongnyang.client.member.dao.ClientLoginDAO;
import com.mall.meongnyang.client.member.vo.ClientCustomerVO;

@Service
public class ClientInsertKaLoginServiceImpl implements ClientInsertKaLoginService{

	@Autowired
	private ClientLoginDAO clientLoginDAO;
	
	@Override
	public void insertKakao(ClientCustomerVO clientCustomerVO) {
		// 카카오로그인
		
		clientLoginDAO.insertKakao(clientCustomerVO);
		
	}
	

}
