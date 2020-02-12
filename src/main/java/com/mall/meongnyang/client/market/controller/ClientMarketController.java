package com.mall.meongnyang.client.market.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mall.meongnyang.client.market.service.ClientDeleteMarketService;
import com.mall.meongnyang.client.market.service.ClientInsertMarketService;
import com.mall.meongnyang.client.market.service.ClientSelectMarketListService;
import com.mall.meongnyang.client.market.service.ClientUpdateMarketService;
import com.mall.meongnyang.client.market.vo.ClientMarketVO;

@Controller
public class ClientMarketController {

	@Autowired
	private ClientInsertMarketService clientInsertMarketService;

	@Autowired
	private ClientSelectMarketListService clientSelectMarketListService;
	
	@RequestMapping(value = "/market-form.do", method = RequestMethod.GET)
	public String marketForm() {
		return "market/market-form";
	}
	
	@RequestMapping(value = "/market-form.do", method = RequestMethod.POST)
	public String insertMarket(ClientMarketVO clientMarketVO, HttpServletRequest request) {
		
		clientInsertMarketService.insertMarket(clientMarketVO, request);
		
		return "redirect: market-list.do";
	}
	
	@RequestMapping(value = "/market-list.do")
	public String marketList() {
		
		clientSelectMarketListService.
		
		return "market/market-list";
	}
}
