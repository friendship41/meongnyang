package com.mall.meongnyang.client.member.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mall.meongnyang.client.member.service.ClientLogoutService;
import com.mall.meongnyang.client.member.service.ClientSelectLoginService;
import com.mall.meongnyang.client.member.vo.ClientCustomerVO;

@Controller
public class ClientLoginController {
	
	@Autowired
	private ClientSelectLoginService clientSelectLoginService;
	
	@Autowired
	private ClientLogoutService clientLogoutService;
	
	
	//로그인처리
	@RequestMapping(value = "/index.do", method = RequestMethod.POST)
	public String loginProc(ClientCustomerVO clientCustomerVO, HttpSession session) {
		ClientCustomerVO tempVO = clientSelectLoginService.selectLoginCheck(clientCustomerVO);
		
		if(tempVO!=null && (tempVO.getCustomerTbPassword()).equals(clientCustomerVO.getCustomerTbPassword())) {
			session.setAttribute("clientId", tempVO.getCustomerTbNo());
			
			return "index";
		} else {
			return "index";
		}
	}
	
	@RequestMapping(value = "/logout.do", method = RequestMethod.POST)
	public String logoutProc(ClientCustomerVO clientCustomerVO, HttpSession session) {
		
		//session.invalidate();
		session.setAttribute("clientId", null);
		return "index";
	}
	
	
}
