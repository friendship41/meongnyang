package com.mall.meongnyang.client.member.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mall.meongnyang.client.member.service.ClientInsertRegistryService;

import com.mall.meongnyang.client.member.service.ClientSelectLoginService;
import com.mall.meongnyang.client.member.vo.ClientCustomerVO;
import com.mall.meongnyang.util.mail.MailService;
import com.mall.meongnyang.util.mail.MailVO;



@Controller
public class ClientRegistryController {
	
	@Autowired
	private ClientInsertRegistryService clientInsertRegistryService;
	
	
	@Autowired
	private ClientSelectLoginService clientSelectLoginService;
	
	

	
	
	
	
	@RequestMapping(value = "/registry.do", method = RequestMethod.POST)
	public String registryProc(ClientCustomerVO clientCustomerVO, Model model) {
			
		clientInsertRegistryService.insertRegistry(clientCustomerVO);
		 
		
		
		// ���߿� ���� ������ Ȯ��
		return "index";
	}
	
	@RequestMapping(value = "/loginAjaxSingle.do")
	@ResponseBody
	public int idCheck(Model model, ClientCustomerVO clientCustomerVO) {
		int result=0;
		ClientCustomerVO tempVO = clientSelectLoginService.selectLoginCheck(clientCustomerVO);
		if(tempVO != null) {
			
			result = 1;
			return result;
		} else {
			
			return result;
		}
		
	}
		
}
