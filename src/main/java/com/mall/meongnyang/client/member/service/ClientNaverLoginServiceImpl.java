package com.mall.meongnyang.client.member.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mall.meongnyang.client.member.dao.ClientLoginDAO;
import com.mall.meongnyang.client.member.vo.ClientCustomerVO;

@Service
public class ClientNaverLoginServiceImpl implements ClientNaverLoginService{

	@Autowired
	ClientLoginDAO clientLoginDAO;
	


	@Override
	public void insertNaver(ClientCustomerVO clientCustomerVO) {
		// TODO Auto-generated method stub
		clientLoginDAO.insertNaver(clientCustomerVO);
		
	}
	
	
	

}
