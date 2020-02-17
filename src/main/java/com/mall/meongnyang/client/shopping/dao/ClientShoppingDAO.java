package com.mall.meongnyang.client.shopping.dao;

import com.mall.meongnyang.admin.product.vo.AdminProductVO;

import java.util.List;

public interface ClientShoppingDAO
{
    public int selectShoppingProductCount(AdminProductVO adminProductVO);
    public List<AdminProductVO> selectShoppingList(AdminProductVO adminProductVO);
}
