package com.mall.meongnyang.client.mypage.service;

import com.mall.meongnyang.client.member.dao.ClientLoginDAO;
import com.mall.meongnyang.client.mypage.dao.ClientOrdersDetailDAO;
import com.mall.meongnyang.client.mypage.dao.ClientProductOrderDAO;
import com.mall.meongnyang.client.mypage.vo.ClientOrdersDetailVO;
import com.mall.meongnyang.client.mypage.vo.ClientProductOrderVO;
import com.mall.meongnyang.client.shopping.dao.ClientShoppingDAO;
import com.mall.meongnyang.client.shopping.vo.ClientOrderDetailVO;
import com.mall.meongnyang.client.shopping.vo.ClientOrderVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("ClientRollbackPointAndStockService")
public class ClientRollbackPointAndStockServiceImpl implements ClientRollbackPointAndStockService
{
    @Autowired
    private ClientOrdersDetailDAO clientOrdersDetailDAO;
    @Autowired
    private ClientProductOrderDAO clientProductOrderDAO;
    @Autowired
    private ClientLoginDAO clientLoginDAO;
    @Autowired
    private ClientShoppingDAO clientShoppingDAO;

    @Override
    public void ClientRollbackPointAndStockService(ClientOrderVO clientOrderVO)
    {
        ClientProductOrderVO clientProductOrderVO = new ClientProductOrderVO();
        clientProductOrderVO.setPdOrderTbNo(clientOrderVO.getPdOrderTbNo());
        ClientProductOrderVO order = clientProductOrderDAO.selectProductOrder(clientProductOrderVO);

        int payment = order.getPdOrderTbPayment();
        clientOrderVO.setCustomerTbNo(order.getCustomerTbNo());
        clientOrderVO.setPdOrderTbUsedPoint(((int)payment/100*(-1)));
        clientLoginDAO.updatePointRollback(clientOrderVO);
        clientOrderVO.setPdOrderTbUsedPoint(order.getPdOrderTbUsedPoint());
        clientLoginDAO.updatePointRollback(clientOrderVO);

        ClientOrdersDetailVO clientOrdersDetailVO = new ClientOrdersDetailVO();
        clientOrdersDetailVO.setPdOrderTbNo(clientOrderVO.getPdOrderTbNo());
        List<ClientOrdersDetailVO> detailList = clientOrdersDetailDAO.selectOrderDetail(clientOrdersDetailVO);

        ClientOrderDetailVO clientOrderDetailVO = new ClientOrderDetailVO();
        for(ClientOrdersDetailVO detail : detailList)
        {
            clientOrderDetailVO.setPdSaleTbNo(detail.getPdSaleTbNo());
            clientOrderDetailVO.setOrdersDetailTbAmount(detail.getOrdersDetailTbAmount());
            clientShoppingDAO.updateRollbackProductRemainCount(clientOrderDetailVO);
        }
    }
}
