package com.mall.meongnyang.client.shopping.controller;

import com.mall.meongnyang.client.member.vo.ClientCustomerVO;
import com.mall.meongnyang.client.mypage.service.ClientSelectMyinfoAddressListService;
import com.mall.meongnyang.client.mypage.vo.ClientCmAddressVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class ClientCheckoutController
{
    @Autowired
    private ClientSelectMyinfoAddressListService clientSelectMyinfoAddressListService;

    @RequestMapping(value = "/checkout.do", method = RequestMethod.GET)
    public String goToCheckoutPage(HttpSession session, Model model)
    {
        ClientCustomerVO clientCustomerVO = (ClientCustomerVO) session.getAttribute("customer");

        if(clientCustomerVO.getCustomerTbPhone() == null || clientCustomerVO.getCustomerTbPhone().equals(""))
        {
            model.addAttribute("message", "전화번호를 입력해 주세요");
            return "mypage/message-and-go-myinfo";
        }

        ClientCmAddressVO clientCmAddressVO = new ClientCmAddressVO();
        clientCmAddressVO.setCustomerTbNo(clientCustomerVO.getCustomerTbNo());

        List<ClientCmAddressVO> addressList = clientSelectMyinfoAddressListService.selectMyinfoAddressList(clientCmAddressVO);

        model.addAttribute("addressList", addressList);

        return "shopping/checkout";

    }

}
