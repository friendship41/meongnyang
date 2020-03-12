package com.mall.meongnyang.client.member.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mall.meongnyang.client.member.dao.ClientLoginDAO;
import com.mall.meongnyang.client.member.vo.ClientCustomerVO;

@Service("ClientLoginService")
public class ClientSelectLoginServiceImpl implements ClientSelectLoginService{

	@Autowired
	private ClientLoginDAO clientLoginDAO;
	
	@Override
	public ClientCustomerVO selectLoginCheck(ClientCustomerVO clientCustomerVO) {
		ClientCustomerVO tempVO = clientLoginDAO.selectLoginCheck(clientCustomerVO);
		clientLoginDAO.updateLastLogin(clientCustomerVO);
		return tempVO;
	}

}
