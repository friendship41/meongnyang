package com.mall.meongnyang.client.market.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ClientMarketController {

	@RequestMapping(value = "/market-form.do", method = RequestMethod.GET)
	public String marketForm() {
		return "market/market-form";
	}
	
	@RequestMapping(value = "/market-list.do")
	public String marketList() {
		return "market/market-list";
	}
}
