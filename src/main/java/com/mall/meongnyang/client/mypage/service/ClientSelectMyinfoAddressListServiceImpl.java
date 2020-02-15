package com.mall.meongnyang.client.mypage.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mall.meongnyang.client.mypage.dao.ClientMyinfoAddressDAO;
import com.mall.meongnyang.client.mypage.vo.ClientCmAddressVO;

@Service("ClientSelectMyinfoAddressList")
public class ClientSelectMyinfoAddressListServiceImpl implements ClientSelectMyinfoAddressListService {
	
	@Autowired
	private ClientMyinfoAddressDAO clientMyinfoAddressDAO;
	
	@Override
	public List<ClientCmAddressVO> selectMyinfoAddressList(ClientCmAddressVO clientCmAddressVO) {
		return clientMyinfoAddressDAO.selectMyinfoAddressList(clientCmAddressVO);
	}

}
