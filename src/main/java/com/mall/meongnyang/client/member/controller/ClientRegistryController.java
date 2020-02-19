package com.mall.meongnyang.client.member.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mall.meongnyang.client.member.service.ClientInsertRegistryService;
import com.mall.meongnyang.client.member.service.ClientSelectLoginService;
import com.mall.meongnyang.client.member.vo.ClientCustomerVO;



@Controller
public class ClientRegistryController {
	
	@Autowired
	private ClientInsertRegistryService clientInsertRegistryService;
	
	
	@Autowired
	private ClientSelectLoginService clientSelectLoginService;
//	@Autowired
//	private MailService mailService;
//	MailVO mailVO = new MailVO();
//	mailVO.setFrom("Admin (관리자)");
//	mailVO.setTo(clientCustomerVO.getCustomerTbEmail());
//	mailVO.setSubject("인증메일 요청입니다 ( 오늘 뭐멍냥 )");
//	mailVO.setContent("link");
//	mailService.sendMail(mailVO);
//	
//	model.addAttribute("mailSubmit", false);
	
	
	@RequestMapping(value = "/registry.do", method = RequestMethod.POST)
	public String registryProc(ClientCustomerVO clientCustomerVO, Model model) {
		
		
		int result = clientInsertRegistryService.insertRegistry(clientCustomerVO);
		 
		
		
		// 나중에 오류 나는지 확인
		return "index";
	}
	
	@ResponseBody
	@RequestMapping(value = "/loginAjaxSingle.do")
	public String idCheck(Model model, ClientCustomerVO clientCustomerVO) {
		
		ClientCustomerVO tempVO = clientSelectLoginService.selectLoginCheck(clientCustomerVO);
		if(tempVO != null) {
			System.out.println("아이디 사용불가");
			model.addAttribute("registryCheck", 0);
			
		} else {
			System.out.println("아이디 사용가능");
			model.addAttribute("registryCheck", 1);
		}
		return "index";
	}
		
}
