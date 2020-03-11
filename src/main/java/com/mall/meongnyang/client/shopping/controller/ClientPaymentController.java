package com.mall.meongnyang.client.shopping.controller;

import com.mall.meongnyang.client.member.vo.ClientCustomerVO;
import com.mall.meongnyang.client.shopping.service.*;
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
    @Autowired
    private ClientUpdateProductSaleRemainCountService clientUpdateProductSaleRemainCountService;
    @Autowired
    private ClientUpdateCustomerPointService clientUpdateCustomerPointService;
    @Autowired
    private ClientUpdateSaleStateWhenZeroService clientUpdateSaleStateWhenZeroService;
    @Autowired
    private ClientUpdateRollbackProductRemainService clientUpdateRollbackProductRemainService;
    @Autowired
    private ClientUpdateRollbackPointService clientUpdateRollbackPointService;
    @Autowired
    private ClientUpdatePointGetService clientUpdatePointGetService;


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


//        구매후 남은 수량 업데이트 (여기서 SQL에러뜨면 재고가 부족한 것)
        boolean remainCntResult = clientUpdateProductSaleRemainCountService.updateproductRemain(clientOrderVO);
        if(!remainCntResult)
        {
            model.addAttribute("message", "재고가 부족합니다... 확인후 다시 시도해 주새요");
            return "shopping/message-and-go-back";
        }


//        포인트 줄여주는 곳
        clientUpdateCustomerPointService.reducePoint(clientOrderVO);
        user.setCustomerTbPoint(user.getCustomerTbPoint()-clientOrderVO.getPdOrderTbUsedPoint());
        session.setAttribute("customer", user);


//        카카오로 결제준비 세팅해달라고 함 (URL등등을 받음)
        KakaoPayReadyResponseVO responseVO = kakaoPayReadyService.kakaoPayReady(clientOrderVO);
        session.setAttribute("ready", responseVO);


        clientOrderVO.setTid(responseVO.getTid());
        clientOrderVO.setPdOrderTbTid(responseVO.getTid());
        session.setAttribute("orderInfo", clientOrderVO);
        clientOrderVO.setPdOrderTbOrderDate(responseVO.getCreated_at());


//        System.out.println(clientOrderVO);
        clientInsertOrderService.insertOrderAndDetail(clientOrderVO);



        return "shopping/payment";
    }

    @RequestMapping(value = "/kakaoPayApproval.do", method = RequestMethod.GET)
    public String kakaoPayApprove(HttpSession session, @RequestParam("pg_token")String pg_token, Model model)
    {
        ClientOrderVO clientOrderVO = (ClientOrderVO)session.getAttribute("orderInfo");
        clientOrderVO.setPg_token(pg_token);
        KakaoPayApprovedResponseVO responseVO = kakaoPayApprovedService.kakaopayapproved(clientOrderVO);

//        결제완료 상태로 업데이트
        clientUpdateOrderPayService.updateOrderPay(clientOrderVO);

//        재고가 0인 상품 상태 업데이트(상품내리기)
        clientUpdateSaleStateWhenZeroService.updateSaleStateWhenZero(clientOrderVO);

//        결제된 금액의 1%만큼 포인트
        clientUpdatePointGetService.updatePointGetService(clientOrderVO);



//        System.out.println(responseVO.getPartner_user_id());
        session.setAttribute("ready", null);
        session.setAttribute("orderInfo", null);
        session.setAttribute("cartList", null);


        model.addAttribute("message", "결제가 완료되엇습니다.");
        return "shopping/payment-success";
    }

    @RequestMapping(value = {"/kakaoPayCancel.do","/kakaoPayFail.do"})
    public String failToPay(HttpSession session, Model model)
    {
        ClientOrderVO orderInfo = (ClientOrderVO)session.getAttribute("orderInfo");

//        상품들 재고 내렸던거 돌려주기
        clientUpdateRollbackProductRemainService.ClientUpdateRollbackProductRemain(orderInfo);

//        포인트 깎았던거 롤백
        clientUpdateRollbackPointService.updatePointRollback(orderInfo);

//        주문넣었던것들 다 지우기
        clientDeleteOrderService.deleteOrder(orderInfo);
        session.setAttribute("ready", null);
        session.setAttribute("orderInfo", null);

        model.addAttribute("message", "처음부터 다시 해주세요.");
        return "shopping/payment-success";
    }
}
