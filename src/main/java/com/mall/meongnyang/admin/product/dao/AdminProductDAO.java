package com.mall.meongnyang.admin.product.dao;

import com.mall.meongnyang.admin.product.vo.AdminProductVO;

import java.util.List;

public interface AdminProductDAO
{
    public void insertProduct(AdminProductVO adminProductVO);
    public void deleteProduct(AdminProductVO adminProductVO);
    public List<AdminProductVO> selectProductList(AdminProductVO adminProductVO);
    public AdminProductVO selectProduct(AdminProductVO adminProductVO);
    public void updateProduct(AdminProductVO adminProductVO);
    public List<AdminProductVO> selectProductOverviewList(AdminProductVO adminProductVO);
    public void updateProductBannerState(AdminProductVO adminProductVO);
    public List<AdminProductVO> selectPopularProductList(AdminProductVO adminProductVO);
    public List<AdminProductVO> selectReadcountSaleRateList(AdminProductVO adminProductVO);
}
