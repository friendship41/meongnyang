package com.mall.meongnyang.admin.product.service;

import com.mall.meongnyang.admin.product.vo.AdminProductSaleVO;

import java.util.List;

public interface AdminSelectProductExpireDateService
{
    public List<AdminProductSaleVO> selectProductExpireDate(AdminProductSaleVO adminProductSaleVO);
}
