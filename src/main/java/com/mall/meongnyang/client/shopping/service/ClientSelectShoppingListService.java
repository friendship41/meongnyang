package com.mall.meongnyang.client.shopping.service;

import com.mall.meongnyang.admin.product.vo.AdminProductVO;

import java.util.List;

public interface ClientSelectShoppingListService
{
    public List<AdminProductVO> selectShoppingList(AdminProductVO adminProductVO);
}
