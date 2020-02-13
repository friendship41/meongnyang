package com.mall.meongnyang.client.mypage.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mall.meongnyang.client.mypage.dao.ClientMyinfoDAO;
import com.mall.meongnyang.client.mypage.vo.ClientCmAddressVO;

@Service("ClientUpdateMyinfoService")
public class ClientInsertMyinfoPhoneServiceImpl implements ClientInsertMyinfoPhoneService {

	@Autowired
	private ClientMyinfoDAO clientMyinfoDAO;

	@Override
	public ClientCmAddressVO insertMyinfoPhone(ClientCmAddressVO clientCmAddressVO) {
		ClientCmAddressVO tempVO = clientMyinfoDAO.insertMyinfoPhone(clientCmAddressVO);
		
		return tempVO;
	}
	
	
	

}
