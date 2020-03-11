package com.mall.meongnyang.client.mypage.service;

import com.mall.meongnyang.client.mypage.dao.ClientProductOrderDAO;
import com.mall.meongnyang.client.mypage.vo.ClientProductOrderVO;
import com.mall.meongnyang.client.shopping.vo.ClientOrderVO;
import com.mall.meongnyang.util.apiRequest.service.KakaoPayCancelService;
import com.mall.meongnyang.util.apiRequest.vo.KakaoPayCancelResponseVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("ClientupdateOrderStateService")
public class ClientupdateOrderStateServiceImpl implements ClientupdateOrderStateService
{
    @Autowired
    private ClientProductOrderDAO clientProductOrderDAO;
    @Autowired
    private KakaoPayCancelService kakaoPayCancelService;

    @Override
    public void updateOrderState(ClientOrderVO clientOrderVO)
    {
        ClientProductOrderVO clientProductOrderVO = new ClientProductOrderVO();
        clientProductOrderVO.setPdOrderTbNo(clientOrderVO.getPdOrderTbNo());
        ClientProductOrderVO orderDB = clientProductOrderDAO.selectProductOrder(clientProductOrderVO);
        clientOrderVO.setPdOrderTbTid(orderDB.getPdOrderTbTid());
        clientOrderVO.setPdOrderTbPayment(orderDB.getPdOrderTbPayment());

        KakaoPayCancelResponseVO kakaoPayCancelResponseVO = kakaoPayCancelService.kakaopaycancel(clientOrderVO);
//        System.out.println(kakaoPayCancelResponseVO);

        if(kakaoPayCancelResponseVO.getStatus().equals("CANCEL_PAYMENT"))
        {
            clientProductOrderDAO.updateOrderState(clientOrderVO);
        }
    }
}
