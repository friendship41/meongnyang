package com.mall.meongnyang.client.mypage.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mall.meongnyang.client.mypage.service.ClientSelectMyinfoService;
import com.mall.meongnyang.client.mypage.service.ClientUpdateMyinfoService;

@Controller
public class ClientMyinfoController {

	@Autowired
	private ClientSelectMyinfoService clientSelectMyinfoService;
	
	@Autowired
	private ClientUpdateMyinfoService clientUpdateMyinfoService;
	
	//단순 페이지 이동
	@RequestMapping(value = "/myinfo.do")
	public String myinfo() {
		
		return "mypage/myinfo";
	}
}
