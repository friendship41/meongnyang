package com.mall.meongnyang.client.shopping.service;

import com.mall.meongnyang.client.mypage.dao.ClientProductOrderDAO;
import com.mall.meongnyang.client.shopping.vo.ClientOrderVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("ClientUpdateOrderPayService")
public class ClientUpdateOrderPayServiceImpl implements ClientUpdateOrderPayService
{
    @Autowired
    private ClientProductOrderDAO clientProductOrderDAO;

    @Override
    public void updateOrderPay(ClientOrderVO clientOrderVO)
    {
        clientProductOrderDAO.updateProductOrderPay(clientOrderVO);
    }
}
