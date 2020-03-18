package com.mall.meongnyang.admin.product.service;

import com.mall.meongnyang.client.mypage.vo.ClientOrdersDetailVO;

import java.util.Map;

public interface AdminSelectOrderDetailService
{
    public Map<String, Object> selectOrderDetail(ClientOrdersDetailVO clientOrdersDetailVO);
}
