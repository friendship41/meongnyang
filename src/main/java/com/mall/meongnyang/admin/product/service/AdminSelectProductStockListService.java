package com.mall.meongnyang.admin.product.service;

import com.mall.meongnyang.admin.product.vo.AdminProductSaleVO;

import java.util.List;

public interface AdminSelectProductStockListService
{
    public List<AdminProductSaleVO> selectProductStockList(AdminProductSaleVO adminProductSaleVO);
}
