package com.mall.meongnyang.client.mypage.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mall.meongnyang.client.mypage.vo.ClientCmAddressVO;

@Repository("ClientMyinfoDAO")
public class ClientMyinfoDAOImpl implements ClientMyinfoDAO {

	@Autowired
	private SqlSessionTemplate sqlSessionTemplate;
	
	
	@Override
	public ClientCmAddressVO selectMyinfo(ClientCmAddressVO clientCmAddressVO) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ClientCmAddressVO updateMyinfo(ClientCmAddressVO clientCmAddressVO) {
		// TODO Auto-generated method stub
		return null;
	}

}
