package com.mall.meongnyang.client.mypage.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ClientMyinfoController {

	//단순 페이지 이동
	@RequestMapping(value = "/myinfo.do")
	public String myinfo() {
		
		return "mypage/myinfo";
	}
}
