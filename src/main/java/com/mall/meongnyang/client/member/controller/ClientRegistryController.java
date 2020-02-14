package com.mall.meongnyang.client.member.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mall.meongnyang.client.member.service.ClientInsertRegistryService;
import com.mall.meongnyang.client.member.service.ClientUpdateJoinDateService;
import com.mall.meongnyang.client.member.vo.ClientCustomerVO;

@Controller
public class ClientRegistryController {
	
	@Autowired
	private ClientInsertRegistryService clientInsertRegistryService;
	
	@Autowired
	private ClientUpdateJoinDateService clientUpdateJoinDateService;
	
	@RequestMapping(value = "/registry.do", method = RequestMethod.POST)
	public String registryProc(ClientCustomerVO clientCustomerVO) {
		
		int result = clientInsertRegistryService.insertRegistry(clientCustomerVO);
		if(result == 1) {
			
		} else {
			return "index";
		}
		// 나중에 오류 나는지 확인
		return "index";
	}
	
	
	
}
