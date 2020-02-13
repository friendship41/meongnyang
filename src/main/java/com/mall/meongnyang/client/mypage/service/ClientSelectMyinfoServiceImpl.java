package com.mall.meongnyang.client.mypage.service;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mall.meongnyang.client.mypage.dao.ClientMyinfoDAO;
import com.mall.meongnyang.client.mypage.vo.ClientCmAddressVO;


@Service("ClientSelectMyinfoService")
public class ClientSelectMyinfoServiceImpl implements ClientSelectMyinfoService {

	
	@Autowired
	private ClientMyinfoDAO clientMyinfoDAO;
	
	
	
	@Override
	public ClientCmAddressVO selectMyinfo(ClientCmAddressVO clientCmAddressVO) {
		
		return null;
	}

}
