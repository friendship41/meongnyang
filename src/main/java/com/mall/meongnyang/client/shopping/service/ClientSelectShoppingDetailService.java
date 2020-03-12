package com.mall.meongnyang.client.shopping.service;

import com.mall.meongnyang.admin.product.vo.AdminProductVO;

import java.util.Map;

public interface ClientSelectShoppingDetailService
{
    public Map<String, Object> selectProductDetail(AdminProductVO adminProductVO);
}
