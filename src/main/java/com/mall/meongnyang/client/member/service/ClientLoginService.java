package com.mall.meongnyang.client.member.service;

import com.mall.meongnyang.client.member.vo.ClientCustomerVO;

public interface ClientLoginService {
	public ClientCustomerVO selectLoginCheck(ClientCustomerVO clientCustomerVO);
}
