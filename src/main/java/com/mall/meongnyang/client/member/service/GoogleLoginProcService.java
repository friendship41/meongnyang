package com.mall.meongnyang.client.member.service;

import com.mall.meongnyang.client.member.vo.ClientCustomerVO;
import com.mall.meongnyang.client.member.vo.GoogleCustomerVO;

public interface GoogleLoginProcService
{
    public ClientCustomerVO googleLoginProc(GoogleCustomerVO googleCustomerVO);
}
