package com.mall.meongnyang.client.shopping.service;

import com.mall.meongnyang.client.shopping.dao.ClientShoppingDAO;
import com.mall.meongnyang.client.shopping.vo.ClientOrderVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("ClientUpdateSaleStateWhenZeroService")
public class ClientUpdateSaleStateWhenZeroServiceImpl implements ClientUpdateSaleStateWhenZeroService
{
    @Autowired
    private ClientShoppingDAO clientShoppingDAO;


    @Override
    public void updateSaleStateWhenZero(ClientOrderVO clientOrderVO)
    {
        clientShoppingDAO.updateProductStateWhenZero(clientOrderVO);
    }
}
