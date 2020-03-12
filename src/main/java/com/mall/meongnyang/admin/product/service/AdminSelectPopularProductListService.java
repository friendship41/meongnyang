package com.mall.meongnyang.admin.product.service;

import com.mall.meongnyang.admin.product.vo.AdminProductVO;

import java.util.List;

public interface AdminSelectPopularProductListService
{
    public List<AdminProductVO> getPopularProductList(AdminProductVO adminProductVO);
}
