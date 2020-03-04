package com.mall.meongnyang.admin.product.service;

import com.mall.meongnyang.admin.product.vo.AdminProductSaleVO;

import java.util.List;

public interface AdminSelectPromotionedProductSaleService
{
    public List<AdminProductSaleVO> selectPromotionedProductSale(AdminProductSaleVO adminProductSaleVO);
}
