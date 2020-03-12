package com.mall.meongnyang.client.member.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mall.meongnyang.client.member.dao.ClientLoginDAO;
import com.mall.meongnyang.client.member.vo.ClientCustomerVO;

@Service("ClientLogoutService")
public class ClientLogoutServiceImpl implements ClientLogoutService{

	@Autowired
	private ClientLoginDAO clientLoginDAO;
	
	@Override
	public ClientCustomerVO logout(ClientCustomerVO clientCustomerVO) {
		ClientCustomerVO tempVO = clientLoginDAO.selectLoginCheck(clientCustomerVO);
		return tempVO;
	}

}
