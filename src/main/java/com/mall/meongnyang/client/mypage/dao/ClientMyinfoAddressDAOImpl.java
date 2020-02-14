package com.mall.meongnyang.client.mypage.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mall.meongnyang.client.mypage.vo.ClientCmAddressVO;

@Repository("ClientMyinfoAddressDAO")
public class ClientMyinfoAddressDAOImpl implements ClientMyinfoAddressDAO {

	@Autowired
	private SqlSessionTemplate sqlSessionTemplate;
	
	@Override
	public void insertMyinfoAddress(ClientCmAddressVO clientCmAddressVO) {
		
		
	}

	@Override
	public void updateMyinfoAddress(ClientCmAddressVO clientCmAddressVO) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteMyinfoAddress(ClientCmAddressVO clientCmAddressVO) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<ClientCmAddressVO> selectMyinfoAddressList(ClientCmAddressVO clientCmAddressVO) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ClientCmAddressVO selectMyinfoAddress(ClientCmAddressVO clientCmAddressVO) {
		// TODO Auto-generated method stub
		return null;
	}

}
