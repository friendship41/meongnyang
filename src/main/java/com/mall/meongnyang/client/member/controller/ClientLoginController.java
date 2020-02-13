package com.mall.meongnyang.client.member.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
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
	@RequestMapping(value = "/login.do", method = RequestMethod.POST)
	public String loginProc(ClientCustomerVO clientCustomerVO,  HttpSession session) {
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();		
		ClientCustomerVO tempVO = clientSelectLoginService.selectLoginCheck(clientCustomerVO);
		
		if(tempVO!=null && (encoder.matches(clientCustomerVO.getCustomerTbPassword(), tempVO.getCustomerTbPassword()))) {
			session.setAttribute("customer", tempVO);
			
			return "redirect:index.do";
		} else {
			System.out.println("로그인실패");
			return "redirect:index.do";
		}
	}
	
	//로그아웃처리
	@RequestMapping(value = "/logout.do", method = RequestMethod.GET)
	public String logoutProc(ClientCustomerVO clientCustomerVO, HttpSession session) {
		
		//session.invalidate();
		session.setAttribute("clientId", null);
		System.out.println(session.getAttribute("clientId"));
		return "index";
	}
	
	//로그인 후 세션있을시 모달클릭하면 myinfo 페이지로 이동하는 처리
	
	@RequestMapping(value = "/myinfo.do", method = RequestMethod.GET)
	public String loginModalProc() {
		
		return "mypage/myinfo";
	}
}
