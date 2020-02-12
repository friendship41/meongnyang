package com.mall.meongnyang.client.market.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mall.meongnyang.client.market.service.ClientSelectMarketService;

@Controller
public class ClientSelectMarketController {

	@Autowired
	private ClientSelectMarketService clientSelectMarketService;
	
	@RequestMapping("/market-read.do")
	public String marketRead(int marketTbNo, Model model) {

		model.addAttribute("market", clientSelectMarketService.selectMarket(marketTbNo));
		return "market/market-read";
	}
}
