package com.mall.meongnyang.util.apiRequest.service;

import com.mall.meongnyang.client.shopping.vo.ClientOrderVO;
import com.mall.meongnyang.util.apiRequest.vo.KakaoPayReadyResponseVO;

public interface KakaoPayReadyService
{
    public KakaoPayReadyResponseVO kakaoPayReady(ClientOrderVO clientOrderVO);
}
