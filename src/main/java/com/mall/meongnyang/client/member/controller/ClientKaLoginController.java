package com.mall.meongnyang.client.member.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mall.meongnyang.client.member.vo.ClientCustomerVO;

@Controller
public class ClientKaLoginController {

	@RequestMapping(value="/KLogin.do", method = {RequestMethod.GET, RequestMethod.POST})
	public String KakaoLogin(ClientCustomerVO clientCustomerVO, Model model) {
		
		
		
		return "index";
	}
	
}
