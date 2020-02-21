package com.mall.meongnyang.client.shopping.controller;

import com.mall.meongnyang.client.member.vo.ClientCustomerVO;
import com.mall.meongnyang.client.shopping.vo.ClientOrderVO;
import com.mall.meongnyang.util.apiRequest.service.KakaoPayApprovedService;
import com.mall.meongnyang.util.apiRequest.service.KakaoPayReadyService;
import com.mall.meongnyang.util.apiRequest.vo.KakaoPayApprovedResponseVO;
import com.mall.meongnyang.util.apiRequest.vo.KakaoPayReadyResponseVO;
import com.mall.meongnyang.util.codeGen.GenerateCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Controller
public class ClientPaymentController
{
    @Autowired
    private KakaoPayReadyService kakaoPayReadyService;
    @Autowired
    private KakaoPayApprovedService kakaoPayApprovedService;


    @RequestMapping(value = "/payment.do", method = RequestMethod.GET)
    public String setPaymentReady()
    {
        return "shopping/payment";
    }

    @RequestMapping(value = "/paymentReady.do", method = RequestMethod.POST)
    public String readyRoPay(ClientOrderVO clientOrderVO, HttpSession session, Model model)
    {
        clientOrderVO.setPdOrderTbNo(new GenerateCode().generateOrderCode());
        ClientCustomerVO user = (ClientCustomerVO)session.getAttribute("customer");
        clientOrderVO.setCustomerTbNo(user.getCustomerTbNo());
        clientOrderVO.setPdOrderTbAdCity(clientOrderVO.getPdOrderTbAddress().split(" ")[0]);

        System.out.println(clientOrderVO);


        KakaoPayReadyResponseVO responseVO = kakaoPayReadyService.kakaoPayReady(clientOrderVO);
        session.setAttribute("ready", responseVO);

        clientOrderVO.setTid(responseVO.getTid());
        session.setAttribute("orderInfo", clientOrderVO);
        clientOrderVO.setPdOrderTbOrderDate(responseVO.getCreated_at());


        return "shopping/payment";
    }

    @RequestMapping(value = "/kakaoPayApproval.do", method = RequestMethod.GET)
    public String kakaoPayApprove(HttpSession session, @RequestParam("pg_token")String pg_token, HttpServletResponse response)
    {
        ClientOrderVO clientOrderVO = (ClientOrderVO)session.getAttribute("orderInfo");
        KakaoPayReadyResponseVO readyVO = (KakaoPayReadyResponseVO)session.getAttribute("ready");
        clientOrderVO.setPg_token(pg_token);
        KakaoPayApprovedResponseVO responseVO = kakaoPayApprovedService.kakaopayapproved(clientOrderVO);

        System.out.println(responseVO.getPartner_user_id());
        session.setAttribute("ready", null);
        session.setAttribute("orderInfo", null);


        return "shopping/payment-success";
    }
}
