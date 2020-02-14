package com.mall.meongnyang.client.mypage.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mall.meongnyang.client.mypage.dao.ClientMyinfoAddressDAO;
import com.mall.meongnyang.client.mypage.vo.ClientCmAddressVO;

@Service("ClientInsertMyinfoAddressService")
public class ClientInsertMyinfoAddressServiceImpl implements ClientInsertMyinfoAddressService {

	@Autowired
	private ClientMyinfoAddressDAO clientMyinfoAddressDAO;
	
	@Override
	public void insertMyinfoAddress(ClientCmAddressVO clientCmAddressVO) {
		
		
	}

}
