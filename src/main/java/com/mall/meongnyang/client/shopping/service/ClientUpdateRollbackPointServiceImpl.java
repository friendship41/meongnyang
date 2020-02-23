package com.mall.meongnyang.client.shopping.service;

import com.mall.meongnyang.client.member.dao.ClientLoginDAO;
import com.mall.meongnyang.client.shopping.vo.ClientOrderVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("ClientUpdateRollbackPointService")
public class ClientUpdateRollbackPointServiceImpl implements ClientUpdateRollbackPointService
{
    @Autowired
    private ClientLoginDAO clientLoginDAO;

    @Override
    public void updatePointRollback(ClientOrderVO clientOrderVO)
    {
        clientLoginDAO.updatePointRollback(clientOrderVO);
    }
}
