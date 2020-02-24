package com.mall.meongnyang.client.shopping.service;

import com.mall.meongnyang.client.mypage.dao.ClientOrdersDetailDAO;
import com.mall.meongnyang.client.mypage.dao.ClientProductOrderDAO;
import com.mall.meongnyang.client.shopping.vo.ClientOrderVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("ClientInsertOrderService")
public class ClientInsertOrderServiceImpl implements ClientInsertOrderService
{
    @Autowired
    private ClientProductOrderDAO clientProductOrderDAO;
    @Autowired
    private ClientOrdersDetailDAO clientOrdersDetailDAO;

    @Override
    public void insertOrderAndDetail(ClientOrderVO clientOrderVO)
    {
        String orderNum = clientOrderVO.getPdOrderTbNo();

        clientProductOrderDAO.insertProductOrder(clientOrderVO);

        for(int i=0; i<clientOrderVO.getOrderDetailVOList().size(); i++)
        {
            clientOrderVO.getOrderDetailVOList().get(i).setPdOrderTbNo(orderNum);
            clientOrdersDetailDAO.insertOrderDetail(clientOrderVO.getOrderDetailVOList().get(i));
        }
    }
}
