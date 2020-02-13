package com.mall.meongnyang.client.mypage.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mall.meongnyang.client.member.vo.ClientCustomerVO;
import com.mall.meongnyang.client.mypage.dao.ClientMyinfoDAO;

@Service("ClientUpdateMyinfoPasswordService")
public class ClientUpdateMyinfoPasswordServiceImpl implements ClientUpdateMyinfoPasswordService{

	@Autowired
	private ClientMyinfoDAO clientMyinfoDAO;
	
	@Override
	public void updateMyinfoPassword(ClientCustomerVO clientCustomerVO) {
		clientMyinfoDAO.updateMyinfoPassword(clientCustomerVO);
		
	}

}
