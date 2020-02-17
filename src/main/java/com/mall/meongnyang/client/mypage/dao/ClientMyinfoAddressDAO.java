package com.mall.meongnyang.client.mypage.dao;

import java.util.List;

import com.mall.meongnyang.client.mypage.vo.ClientCmAddressVO;

public interface ClientMyinfoAddressDAO {
	
	public void insertMyinfoAddress(ClientCmAddressVO clientCmAddressVO);
	
	public void updateMyinfoAddress(ClientCmAddressVO clientCmAddressVO);
	
	public void deleteMyinfoAddress(ClientCmAddressVO clientCmAddressVO);
	
	public List<ClientCmAddressVO> selectMyinfoAddressList(ClientCmAddressVO clientCmAddressVO);
	
	public ClientCmAddressVO selectMyinfoAddress(ClientCmAddressVO clientCmAddressVO);
}
