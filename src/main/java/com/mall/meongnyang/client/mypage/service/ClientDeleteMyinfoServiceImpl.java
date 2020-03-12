package com.mall.meongnyang.client.mypage.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mall.meongnyang.client.member.vo.ClientCustomerVO;
import com.mall.meongnyang.client.mypage.dao.ClientMyinfoDAO;


@Service("ClientDeleteMyinfoService")
public class ClientDeleteMyinfoServiceImpl implements ClientDeleteMyinfoService{

	@Autowired
	private ClientMyinfoDAO clientMyinfoDAO;
	
	@Override
	public void deleteMyinfo(ClientCustomerVO clientCustomerVO) {
		
		clientMyinfoDAO.deleteMyinfoCustomer(clientCustomerVO);
		
	}

}
