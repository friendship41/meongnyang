package com.mall.meongnyang.client.member.controller;

import com.mall.meongnyang.client.member.service.GoogleLoginProcService;
import com.mall.meongnyang.client.member.service.GoogleLoginService;
import com.mall.meongnyang.client.member.vo.ClientCustomerVO;
import com.mall.meongnyang.client.member.vo.GoogleCustomerVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;

@Controller
public class ClientGoogleLoginController
{
    @Autowired
    private GoogleLoginService googleLoginService;
    @Autowired
    private GoogleLoginProcService googleLoginProcService;

    @RequestMapping(value = "/googleLogin.do")
    public String googleLoginProc(@RequestParam("code") String code, HttpSession session)
    {
        GoogleCustomerVO googleCustomerVO = googleLoginService.googleLogin(code);
        ClientCustomerVO customer = googleLoginProcService.googleLoginProc(googleCustomerVO);
        session.setAttribute("customer", customer);

        return "redirect:index.do";
    }
}
