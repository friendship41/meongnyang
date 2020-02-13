package com.mall.meongnyang.client.mypage.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mall.meongnyang.client.mypage.service.ClientInsertMyinfoPhoneService;
import com.mall.meongnyang.client.mypage.service.ClientSelectMyinfoService;

import com.mall.meongnyang.client.mypage.vo.ClientCmAddressVO;

@Controller
public class ClientMyinfoController {

	@Autowired
	private ClientSelectMyinfoService clientSelectMyinfoService;
	
	@Autowired
	private ClientInsertMyinfoPhoneService clientInsertMyinfoPhoneService;
	
	
	@RequestMapping(value = "/myinfo.do", method = RequestMethod.GET)
	public String myinfo(ClientCmAddressVO clientCmAddressVO, Model model) {
		ClientCmAddressVO tempVO = clientSelectMyinfoService.selectMyinfo(clientCmAddressVO);
		
		model.addAttribute("clientMyinfoVO", tempVO);
		
		return "mypage/myinfo";
	}
	
	@RequestMapping(value = "/myinfo-insert-phone.do", method = RequestMethod.GET)
	public String InsertmyinfoPhoneProc(ClientCmAddressVO clientCmAddressVO, Model model) {
		ClientCmAddressVO tempVO = clientInsertMyinfoPhoneService.insertMyinfoPhone(clientCmAddressVO);
		
		model.addAttribute("customerNo", tempVO.getCustomerTbNo());
		clientInsertMyinfoPhoneService.insertMyinfoPhone(clientCmAddressVO);
		return "redirect:/myinfo.do";
	}
	
	
	
	
	
	
}
