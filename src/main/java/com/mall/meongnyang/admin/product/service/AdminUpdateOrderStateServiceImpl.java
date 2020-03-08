package com.mall.meongnyang.admin.product.service;

import com.mall.meongnyang.admin.product.dao.AdminProductOrderDAO;
import com.mall.meongnyang.client.shopping.vo.ClientOrderVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("AdminUpdateOrderStateService")
public class AdminUpdateOrderStateServiceImpl implements AdminUpdateOrderStateService
{
    @Autowired
    private AdminProductOrderDAO adminProductOrderDAO;

    @Override
    public void updateOrderState(ClientOrderVO clientOrderVO)
    {
        adminProductOrderDAO.updateOrderState(clientOrderVO);
    }
}
