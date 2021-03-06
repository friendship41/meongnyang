package com.mall.meongnyang.client.shopping.service;

import com.mall.meongnyang.client.mypage.dao.ClientOrdersDetailDAO;
import com.mall.meongnyang.client.mypage.dao.ClientProductOrderDAO;
import com.mall.meongnyang.client.shopping.vo.ClientOrderVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("ClientDeleteOrderService")
public class ClientDeleteOrderServiceImpl implements ClientDeleteOrderService
{
    @Autowired
    private ClientOrdersDetailDAO clientOrdersDetailDAO;
    @Autowired
    private ClientProductOrderDAO clientProductOrderDAO;

    @Override
    @Transactional
    public void deleteOrder(ClientOrderVO clientOrderVO)
    {
        clientOrdersDetailDAO.deleteOrderDetailByNo(clientOrderVO);
        clientProductOrderDAO.deleteProductOrder(clientOrderVO);
    }
}
