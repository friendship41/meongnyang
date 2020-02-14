package com.mall.meongnyang.client.member.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mall.meongnyang.client.member.dao.ClientLoginDAO;
import com.mall.meongnyang.client.member.vo.ClientCustomerVO;
@Service("ClientUpdateJoinDateService")
public class ClientUpdateJoinDateServiceImpl implements ClientUpdateJoinDateService {

	@Autowired
	private ClientLoginDAO clientLoginDAO;
	
	@Override
	public void updateJoinDate(ClientCustomerVO clientCustomerVO) {
		clientLoginDAO.updateJoinDate(clientCustomerVO);
		
	}

}
