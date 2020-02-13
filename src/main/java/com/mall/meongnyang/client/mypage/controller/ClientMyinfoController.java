package com.mall.meongnyang.client.mypage.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mall.meongnyang.client.mypage.service.ClientSelectMyinfoService;
import com.mall.meongnyang.client.mypage.service.ClientUpdateMyinfoService;
import com.mall.meongnyang.client.mypage.vo.ClientCmAddressVO;

@Controller
public class ClientMyinfoController {

	@Autowired
	private ClientSelectMyinfoService clientSelectMyinfoService;
	
	@Autowired
	private ClientUpdateMyinfoService clientUpdateMyinfoService;
	
	
	@RequestMapping(value = "/myinfo.do", method = RequestMethod.GET)
	public String myinfo(ClientCmAddressVO clientCmAddressVO, Model model) {
		ClientCmAddressVO tempVO = clientSelectMyinfoService.selectMyinfo(clientCmAddressVO);
		
		model.addAttribute("adminMyinfoVO", tempVO);
		
		return "mypage/myinfo";
	}
	
	
	
	
	
	
	
	
}
