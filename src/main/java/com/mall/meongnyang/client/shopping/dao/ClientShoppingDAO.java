package com.mall.meongnyang.client.shopping.dao;

import com.mall.meongnyang.admin.product.vo.AdminProductImageVO;
import com.mall.meongnyang.admin.product.vo.AdminProductSaleVO;
import com.mall.meongnyang.admin.product.vo.AdminProductVO;
import com.mall.meongnyang.client.shopping.vo.ClientOrderDetailVO;
import com.mall.meongnyang.client.shopping.vo.ClientOrderVO;

import java.util.List;

public interface ClientShoppingDAO
{
    public int selectShoppingProductCount(AdminProductVO adminProductVO);
    public List<AdminProductVO> selectShoppingList(AdminProductVO adminProductVO);
    public AdminProductVO selectProductDetail(AdminProductVO adminProductVO);
    public List<AdminProductImageVO> selectProductImages(AdminProductImageVO adminProductImageVO);
    public List<AdminProductSaleVO> selectSingleProductSaleList(AdminProductSaleVO adminProductSaleVO);
    public int updateProductRemainCount(ClientOrderDetailVO clientOrderDetailVO);
    public void updateProductStateWhenZero(ClientOrderVO clientOrderVO);
    public void updateRollbackProductRemainCount(ClientOrderDetailVO clientOrderDetailVO);
    public void updateProductSaleReadCount(AdminProductVO adminProductVO);
    public void updatePromotionEndProductSale(AdminProductSaleVO adminProductSaleVO);
}
