package com.mall.meongnyang.client.member.dao;

import com.mall.meongnyang.client.member.vo.ClientCustomerVO;

public interface ClientLoginDAO {
	public ClientCustomerVO selectLoginCheck(ClientCustomerVO clientCustomerVO);
	
	public ClientCustomerVO logout(ClientCustomerVO clientCustomerVO);
	
	public int insertRegistry(ClientCustomerVO clientCustomerVO);
	
	
	
	//로그인시 last login sysdate 추가
	public void updateLastLogin(ClientCustomerVO clientCustomerVO);
}
