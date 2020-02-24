package com.mall.meongnyang.client.mypage.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mall.meongnyang.client.mypage.dao.ClientMyinfoAddressDAO;
import com.mall.meongnyang.client.mypage.vo.ClientCmAddressVO;

@Service("ClientSelectMyinfoAddressService")
public class ClientSelectMyinfoAddressServiceImpl implements ClientSelectMyinfoAddressService {

	@Autowired
	private ClientMyinfoAddressDAO clientMyinfoAddressDAO;
	
	@Override
	public ClientCmAddressVO selectMyinfoAddress(ClientCmAddressVO clientCmAddressVO) {
		ClientCmAddressVO tempVO = clientMyinfoAddressDAO.selectMyinfoAddress(clientCmAddressVO);
		System.out.println(tempVO + "select");
		
		return clientMyinfoAddressDAO.selectMyinfoAddress(clientCmAddressVO);
	}

}
