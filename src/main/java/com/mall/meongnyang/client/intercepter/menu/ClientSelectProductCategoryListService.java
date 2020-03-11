package com.mall.meongnyang.client.intercepter.menu;

import com.mall.meongnyang.admin.product.vo.AdminProductCategoryVO;

import java.util.List;

public interface ClientSelectProductCategoryListService
{
    public MenuVO getMenu();
    public List<AdminProductCategoryVO> getAllCategory(AdminProductCategoryVO adminProductCategoryVO);
}
