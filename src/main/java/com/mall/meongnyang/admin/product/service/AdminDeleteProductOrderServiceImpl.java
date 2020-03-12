package com.mall.meongnyang.admin.product.service;

import com.mall.meongnyang.admin.product.dao.AdminProductOrderDAO;
import com.mall.meongnyang.client.shopping.vo.ClientOrderVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("AdminDeleteProductOrderService")
public class AdminDeleteProductOrderServiceImpl implements AdminDeleteProductOrderService
{
    @Autowired
    private AdminProductOrderDAO adminProductOrderDAO;

    @Override
    @Transactional
    public void deleteProductOrder(ClientOrderVO clientOrderVO)
    {
        adminProductOrderDAO.deleteProductOrder(clientOrderVO);
        adminProductOrderDAO.deleteOrderDetailByNo(clientOrderVO);
    }
}
