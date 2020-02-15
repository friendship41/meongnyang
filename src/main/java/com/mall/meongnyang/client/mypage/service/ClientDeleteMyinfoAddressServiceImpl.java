package com.mall.meongnyang.client.mypage.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mall.meongnyang.client.mypage.dao.ClientMyinfoAddressDAO;
import com.mall.meongnyang.client.mypage.vo.ClientCmAddressVO;

@Service("ClientDeleteMyinfoAddressService")
public class ClientDeleteMyinfoAddressServiceImpl implements ClientDeleteMyinfoAddressService {

	@Autowired
	private ClientMyinfoAddressDAO clientMyinfoAddressDAO;
	
	@Override
	public void deleteMyinfoAddress(ClientCmAddressVO clientCmAddressVO) {
		clientMyinfoAddressDAO.deleteMyinfoAddress(clientCmAddressVO);
		
	}

}
