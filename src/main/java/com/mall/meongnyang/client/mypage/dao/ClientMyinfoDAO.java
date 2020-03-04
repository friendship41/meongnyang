package com.mall.meongnyang.client.mypage.dao;

import com.mall.meongnyang.client.member.vo.ClientCustomerVO;

public interface ClientMyinfoDAO {
	
	
	
	public void updateMyinfoPhone(ClientCustomerVO clientCustomerVO);
	
	
	
	public void updateMyinfoPassword(ClientCustomerVO clientCustomerVO);
	
	
	public void deleteMyinfoCustomer(ClientCustomerVO clientCustomerVO);
	
	
}
