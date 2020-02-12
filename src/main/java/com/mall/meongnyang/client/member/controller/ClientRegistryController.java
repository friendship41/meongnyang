package com.mall.meongnyang.client.member.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mall.meongnyang.client.member.vo.ClientCustomerVO;

@Controller
public class ClientRegistryController {
	
	@RequestMapping(value = "/registry.do", method = RequestMethod.POST)
	public String registryProc(ClientCustomerVO clientCustomerVO) {
		
		
		// 나중에 오류 나는지 확인
		return "include/login-modal";
	}
	
	
}
