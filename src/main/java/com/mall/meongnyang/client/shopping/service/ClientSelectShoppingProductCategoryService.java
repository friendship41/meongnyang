package com.mall.meongnyang.client.shopping.service;

import com.mall.meongnyang.admin.product.vo.AdminProductCategoryVO;

import java.util.List;

public interface ClientSelectShoppingProductCategoryService
{
    public List<AdminProductCategoryVO> getSelectedProductCategory(AdminProductCategoryVO adminProductCategoryVO);
}
