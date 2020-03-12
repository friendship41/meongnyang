package com.mall.meongnyang.client.member.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mall.meongnyang.client.member.dao.ClientLoginDAO;
import com.mall.meongnyang.client.member.vo.ClientCustomerVO;

@Service("ClientUpdateRegistryStateService")
public class ClientUpdateRegistryStateServiceImpl implements ClientUpdateRegistryStateService {

	@Autowired
	private ClientLoginDAO clientLoginDAO;
	
	@Override
	public void updateState(ClientCustomerVO clientCustomerVO) {
		clientLoginDAO.updateState(clientCustomerVO);

	}

}
