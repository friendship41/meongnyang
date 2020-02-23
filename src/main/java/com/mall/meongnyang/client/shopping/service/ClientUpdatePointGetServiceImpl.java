package com.mall.meongnyang.client.shopping.service;

import com.mall.meongnyang.client.member.dao.ClientLoginDAO;
import com.mall.meongnyang.client.shopping.vo.ClientOrderVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("ClientUpdatPointGetService")
public class ClientUpdatePointGetServiceImpl implements ClientUpdatePointGetService
{
    @Autowired
    private ClientLoginDAO clientLoginDAO;

    @Override
    public void updatePointGetService(ClientOrderVO clientOrderVO)
    {
        clientLoginDAO.updatePointPlus(clientOrderVO);
    }
}
