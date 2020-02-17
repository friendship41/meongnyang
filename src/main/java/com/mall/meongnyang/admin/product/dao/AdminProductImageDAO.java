package com.mall.meongnyang.admin.product.dao;

import com.mall.meongnyang.admin.product.vo.AdminProductImageVO;

import java.util.List;

public interface AdminProductImageDAO
{
    public void insertProductImage(AdminProductImageVO adminProductImageVO);
    public void deleteProductImage(AdminProductImageVO adminProductImageVO);
    public List<AdminProductImageVO> selectProductImages(AdminProductImageVO adminProductImageVO);
    public int selectProductImageCount(AdminProductImageVO adminProductImageVO);
    public AdminProductImageVO selectProductImageRepY(AdminProductImageVO adminProductImageVO);
    public void updateProductImageRep(AdminProductImageVO adminProductImageVO);
}
