package com.mall.meongnyang.client.shopping.dao;

import com.mall.meongnyang.admin.product.vo.AdminProductCategoryVO;

import java.util.List;

public interface ClientProductCategoryDAO
{
    public AdminProductCategoryVO selectCategory(AdminProductCategoryVO adminProductCategoryVO);
    public List<AdminProductCategoryVO> selectCategoryList(AdminProductCategoryVO adminProductCategoryVO);
}
