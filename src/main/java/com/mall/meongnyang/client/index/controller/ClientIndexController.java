package com.mall.meongnyang.client.index.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ClientIndexController {

	@RequestMapping("/index.do")
	public String indexPage()
	{
		return "index";
	}
}
