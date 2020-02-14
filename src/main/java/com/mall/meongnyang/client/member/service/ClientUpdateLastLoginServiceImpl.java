package com.mall.meongnyang.client.member.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mall.meongnyang.client.member.vo.ClientCustomerVO;

@Service("ClientUpdateLastLoginService")
public class ClientUpdateLastLoginServiceImpl implements ClientUpdateLastLoginService {

	@Autowired
	private ClientUpdateLastLoginService clientUpdateLastLoginService;
	
	@Override
	public void updateLastLogin(ClientCustomerVO clientCustomerVO) {
		clientUpdateLastLoginService.updateLastLogin(clientCustomerVO);
		
	}

}
