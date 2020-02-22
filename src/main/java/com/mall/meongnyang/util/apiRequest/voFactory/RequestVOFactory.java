package com.mall.meongnyang.util.apiRequest.voFactory;

import com.mall.meongnyang.client.shopping.vo.ClientOrderVO;
import com.mall.meongnyang.util.apiRequest.vo.RequestRestVO;

public interface RequestVOFactory
{
    public RequestRestVO getKakaoPayReadyRequestVO(ClientOrderVO clientOrderVO);
    public RequestRestVO getKakaoPayApprovedRequestVO(ClientOrderVO clientOrderVO);
}
