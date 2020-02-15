package com.mall.meongnyang.client.mypage.dao;

import com.mall.meongnyang.client.member.vo.ClientCustomerVO;
import com.mall.meongnyang.client.mypage.vo.ClientCmAddressVO;

public interface ClientMyinfoDAO {
	
	
	//핸드폰 넣기
	public void updateMyinfoPhone(ClientCustomerVO clientCustomerVO);
	
	
	//비밀번호 변경
	public void updateMyinfoPassword(ClientCustomerVO clientCustomerVO);
	
	//회원탈퇴
	public void deleteMyinfoCustomer(ClientCustomerVO clientCustomerVO);
}
