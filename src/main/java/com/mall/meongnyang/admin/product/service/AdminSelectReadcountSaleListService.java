package com.mall.meongnyang.admin.product.service;

import com.mall.meongnyang.admin.product.vo.AdminProductVO;

import java.util.List;

public interface AdminSelectReadcountSaleListService
{
    public List<AdminProductVO> getReadcountSaleList(AdminProductVO adminProductVO);
}
