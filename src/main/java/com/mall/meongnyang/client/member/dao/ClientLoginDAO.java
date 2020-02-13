package com.mall.meongnyang.client.member.dao;

import com.mall.meongnyang.client.member.vo.ClientCustomerVO;

public interface ClientLoginDAO {
	public ClientCustomerVO selectLoginCheck(ClientCustomerVO clientCustomerVO);
	
	public ClientCustomerVO logout(ClientCustomerVO clientCustomerVO);
	
	public int insertRegistry(ClientCustomerVO clientCustomerVO);
}
