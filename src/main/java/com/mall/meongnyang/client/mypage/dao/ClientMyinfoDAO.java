package com.mall.meongnyang.client.mypage.dao;

import com.mall.meongnyang.client.mypage.vo.ClientCmAddressVO;

public interface ClientMyinfoDAO {
	//정보 얻어오기
	public ClientCmAddressVO selectMyinfo(ClientCmAddressVO clientCmAddressVO);
	
	//정보 수정
	public ClientCmAddressVO updateMyinfo(ClientCmAddressVO clientCmAddressVO);
}
