package com.mall.meongnyang.admin.product.service;

import com.mall.meongnyang.admin.product.vo.AdminProductCategoryVO;

import java.util.List;

public interface AdminSelectProductCategoryListService
{
    public List<AdminProductCategoryVO> selectCategoryList(AdminProductCategoryVO adminProductCategoryVO);
}
