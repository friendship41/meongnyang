package com.mall.meongnyang.client.member.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mall.meongnyang.client.member.service.ClientInsertRegistryService;
import com.mall.meongnyang.client.member.vo.ClientCustomerVO;
import com.mall.meongnyang.util.mail.MailService;
import com.mall.meongnyang.util.mail.MailVO;



@Controller
public class ClientRegistryController {
	
	@Autowired
	private ClientInsertRegistryService clientInsertRegistryService;
	

	
	
	
	@RequestMapping(value = "/registry.do", method = RequestMethod.POST)
	public String registryProc(ClientCustomerVO clientCustomerVO, Model model) {
		
		
		int result = clientInsertRegistryService.insertRegistry(clientCustomerVO);
		 
		// 나중에 오류 나는지 확인
		return "index";
	}
	
		
}
