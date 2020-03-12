package com.mall.meongnyang.admin.product.service;

import com.mall.meongnyang.admin.product.dao.AdminProductOrderDAO;
import com.mall.meongnyang.client.mypage.vo.ClientProductOrderVO;
import com.mall.meongnyang.client.shopping.vo.ClientOrderVO;
import com.mall.meongnyang.util.apiRequest.service.KakaoPayCancelService;
import com.mall.meongnyang.util.apiRequest.vo.KakaoPayCancelResponseVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("AdminUpdateOrderStateService")
public class AdminUpdateOrderStateServiceImpl implements AdminUpdateOrderStateService
{
    @Autowired
    private AdminProductOrderDAO adminProductOrderDAO;
    @Autowired
    private KakaoPayCancelService kakaoPayCancelService;

    @Override
    @Transactional
    public void updateOrderState(ClientOrderVO clientOrderVO)
    {
        if (clientOrderVO.getPdOrderTbState().equalsIgnoreCase("C"))
        {
            ClientProductOrderVO clientProductOrderVO = new ClientProductOrderVO();
            clientProductOrderVO.setPdOrderTbNo(clientOrderVO.getPdOrderTbNo());
            ClientProductOrderVO orderDB = adminProductOrderDAO.selectOrder(clientProductOrderVO);
            clientOrderVO.setPdOrderTbTid(orderDB.getPdOrderTbTid());
            clientOrderVO.setPdOrderTbPayment(orderDB.getPdOrderTbPayment());

            KakaoPayCancelResponseVO responseVO = kakaoPayCancelService.kakaopaycancel(clientOrderVO);
            if(responseVO.getStatus().equals("CANCEL_PAYMENT"))
            {
                adminProductOrderDAO.updateOrderState(clientOrderVO);
            }
        }
        else {
            adminProductOrderDAO.updateOrderState(clientOrderVO);
        }
    }
}
