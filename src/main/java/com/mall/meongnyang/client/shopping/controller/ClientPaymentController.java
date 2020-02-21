package com.mall.meongnyang.client.shopping.controller;

import com.mall.meongnyang.client.member.vo.ClientCustomerVO;
import com.mall.meongnyang.client.shopping.service.ClientDeleteOrderService;
import com.mall.meongnyang.client.shopping.service.ClientInsertOrderService;
import com.mall.meongnyang.client.shopping.service.ClientUpdateOrderPayService;
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
    @Autowired
    private ClientInsertOrderService clientInsertOrderService;
    @Autowired
    private ClientUpdateOrderPayService clientUpdateOrderPayService;
    @Autowired
    private ClientDeleteOrderService clientDeleteOrderService;


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


        KakaoPayReadyResponseVO responseVO = kakaoPayReadyService.kakaoPayReady(clientOrderVO);
        session.setAttribute("ready", responseVO);


        clientOrderVO.setTid(responseVO.getTid());
        session.setAttribute("orderInfo", clientOrderVO);
        clientOrderVO.setPdOrderTbOrderDate(responseVO.getCreated_at());


        System.out.println(clientOrderVO);
        clientInsertOrderService.insertOrderAndDetail(clientOrderVO);

        System.out.println("결제대기 완료");
        return "shopping/payment";
    }

    @RequestMapping(value = "/kakaoPayApproval.do", method = RequestMethod.GET)
    public String kakaoPayApprove(HttpSession session, @RequestParam("pg_token")String pg_token, HttpServletResponse response)
    {
        ClientOrderVO clientOrderVO = (ClientOrderVO)session.getAttribute("orderInfo");
        clientOrderVO.setPg_token(pg_token);
        KakaoPayApprovedResponseVO responseVO = kakaoPayApprovedService.kakaopayapproved(clientOrderVO);


        clientUpdateOrderPayService.updateOrderPay(clientOrderVO);


        System.out.println(responseVO.getPartner_user_id());
        session.setAttribute("ready", null);
        session.setAttribute("orderInfo", null);

        System.out.println("결제성공");
        return "shopping/payment-success";
    }

    @RequestMapping(value = "/kakaoPayFail.do")
    public String failToPay(HttpSession session)
    {
        clientDeleteOrderService.deleteOrder((ClientOrderVO)session.getAttribute("orderInfo"));
        session.setAttribute("ready", null);
        session.setAttribute("orderInfo", null);

        System.out.println("결제실패");
        return "redirect:index.do";
    }
}
