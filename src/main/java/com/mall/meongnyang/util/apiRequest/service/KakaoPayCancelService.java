package com.mall.meongnyang.util.apiRequest.service;

import com.mall.meongnyang.client.shopping.vo.ClientOrderVO;
import com.mall.meongnyang.util.apiRequest.vo.KakaoPayCancelResponseVO;

public interface KakaoPayCancelService
{
    public KakaoPayCancelResponseVO kakaopaycancel(ClientOrderVO clientOrderVO);
}
