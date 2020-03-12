package com.mall.meongnyang.client.intercepter.menu;

import com.mall.meongnyang.admin.product.vo.AdminProductCategoryVO;

import java.util.List;

public interface ClientMenuDAO
{
    public List<AdminProductCategoryVO> selectProductCategoryList(AdminProductCategoryVO adminProductCategoryVO);
}
