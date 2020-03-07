package com.mall.meongnyang.client.member.service;

import com.mall.meongnyang.client.member.vo.GoogleCustomerVO;

public interface GoogleLoginService
{
    public GoogleCustomerVO googleLogin(String code);
}
