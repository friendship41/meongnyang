package com.mall.meongnyang.admin.product.dao;

import com.mall.meongnyang.admin.product.vo.AdminProductSaleVO;

import java.util.List;

public interface AdminProductStockDAO
{
    public List<AdminProductSaleVO> selectProductStockList(AdminProductSaleVO adminProductSaleVO);
}
