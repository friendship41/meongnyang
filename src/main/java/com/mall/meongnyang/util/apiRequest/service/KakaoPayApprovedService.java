package com.mall.meongnyang.util.apiRequest.service;

import com.mall.meongnyang.client.shopping.vo.ClientOrderVO;
import com.mall.meongnyang.util.apiRequest.vo.KakaoPayApprovedResponseVO;

public interface KakaoPayApprovedService
{
    public KakaoPayApprovedResponseVO kakaopayapproved(ClientOrderVO clientOrderVO);
}
