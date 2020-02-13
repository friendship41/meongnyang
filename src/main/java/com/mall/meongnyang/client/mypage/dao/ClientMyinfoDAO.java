package com.mall.meongnyang.client.mypage.dao;

import com.mall.meongnyang.client.member.vo.ClientCustomerVO;
import com.mall.meongnyang.client.mypage.vo.ClientCmAddressVO;

public interface ClientMyinfoDAO {
	//정보 얻어오기
	public ClientCmAddressVO selectMyinfo(ClientCmAddressVO clientCmAddressVO);
	
	//핸드폰 넣기
	public void updateMyinfoPhone(ClientCustomerVO clientCustomerVO);
	
	//비밀번호 변경
	public void updateMyinfoPassword(ClientCustomerVO clientCustomerVO);
	
	
}
