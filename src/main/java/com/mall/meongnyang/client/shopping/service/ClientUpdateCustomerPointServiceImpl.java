package com.mall.meongnyang.client.shopping.service;

import com.mall.meongnyang.client.member.dao.ClientLoginDAO;
import com.mall.meongnyang.client.shopping.vo.ClientOrderVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("ClientUpdateCustomerPointService")
public class ClientUpdateCustomerPointServiceImpl implements ClientUpdateCustomerPointService
{
    @Autowired
    private ClientLoginDAO clientLoginDAO;

    @Override
    public void reducePoint(ClientOrderVO clientOrderVO)
    {
        clientLoginDAO.updatePointUse(clientOrderVO);
    }
}
