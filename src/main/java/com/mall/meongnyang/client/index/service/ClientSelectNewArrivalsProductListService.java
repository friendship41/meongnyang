package com.mall.meongnyang.client.index.service;

import com.mall.meongnyang.admin.product.vo.AdminProductVO;

import java.util.List;

public interface ClientSelectNewArrivalsProductListService
{
    public List<AdminProductVO> selectNewArrivalList(AdminProductVO adminProductVO);
}
