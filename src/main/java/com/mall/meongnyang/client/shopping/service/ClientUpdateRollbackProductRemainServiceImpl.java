package com.mall.meongnyang.client.shopping.service;

import com.mall.meongnyang.client.shopping.dao.ClientShoppingDAO;
import com.mall.meongnyang.client.shopping.vo.ClientOrderDetailVO;
import com.mall.meongnyang.client.shopping.vo.ClientOrderVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("ClientUpdateRollbackProductRemainService")
public class ClientUpdateRollbackProductRemainServiceImpl implements ClientUpdateRollbackProductRemainService
{
    @Autowired
    private ClientShoppingDAO clientShoppingDAO;

    @Override
    public void ClientUpdateRollbackProductRemain(ClientOrderVO clientOrderVO)
    {
        List<ClientOrderDetailVO> detailList = clientOrderVO.getOrderDetailVOList();
        for(ClientOrderDetailVO detail : detailList)
        {
            clientShoppingDAO.updateRollbackProductRemainCount(detail);
        }
    }
}
