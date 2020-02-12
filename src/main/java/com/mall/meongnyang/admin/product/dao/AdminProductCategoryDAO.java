package com.mall.meongnyang.admin.product.dao;

import com.mall.meongnyang.admin.product.vo.AdminProductCategoryVO;

import java.util.List;

public interface AdminProductCategoryDAO
{
    public void insertProductCategory(AdminProductCategoryVO adminProductCategoryVO);
    public void updateProductCategory(AdminProductCategoryVO adminProductCategoryVO);
    public void deleteProductCategory(AdminProductCategoryVO adminProductCategoryVO);
    public List<AdminProductCategoryVO> selectProductCategoryList(AdminProductCategoryVO adminProductCategoryVO);
    public AdminProductCategoryVO selectProductCategory(AdminProductCategoryVO adminProductCategoryVO);
}
