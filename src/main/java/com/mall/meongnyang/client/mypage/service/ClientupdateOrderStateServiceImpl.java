package com.mall.meongnyang.client.mypage.service;

import com.mall.meongnyang.client.mypage.dao.ClientProductOrderDAO;
import com.mall.meongnyang.client.shopping.vo.ClientOrderVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("ClientupdateOrderStateService")
public class ClientupdateOrderStateServiceImpl implements ClientupdateOrderStateService
{
    @Autowired
    private ClientProductOrderDAO clientProductOrderDAO;

    @Override
    public void updateOrderState(ClientOrderVO clientOrderVO)
    {
        clientProductOrderDAO.updateOrderState(clientOrderVO);
    }
}
