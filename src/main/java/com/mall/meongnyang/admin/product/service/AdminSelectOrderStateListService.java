package com.mall.meongnyang.admin.product.service;

import com.mall.meongnyang.client.shopping.vo.ClientOrderVO;

import java.util.List;

public interface AdminSelectOrderStateListService
{
    public List<ClientOrderVO> selectOrderStateList();
}
