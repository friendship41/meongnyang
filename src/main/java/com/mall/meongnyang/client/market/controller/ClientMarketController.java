package com.mall.meongnyang.client.market.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.aspectj.apache.bcel.generic.InstructionConstants.Clinit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mall.meongnyang.client.market.service.ClientDeleteMarketService;
import com.mall.meongnyang.client.market.service.ClientInsertMarketService;
import com.mall.meongnyang.client.market.service.ClientSelectMarketListService;
import com.mall.meongnyang.client.market.service.ClientSelectMarketService;
import com.mall.meongnyang.client.market.service.ClientUpdateMarketService;
import com.mall.meongnyang.client.market.vo.ClientMarketVO;

@Controller
public class ClientMarketController {

	@Autowired
	private ClientInsertMarketService clientInsertMarketService;

	@Autowired
	private ClientSelectMarketListService clientSelectMarketListService;
	
	@Autowired
	private ClientSelectMarketService clientSelectMarketService;
	
	@Autowired
	private ClientDeleteMarketService clientDeleteMarketService;
	
	@Autowired
	private ClientUpdateMarketService ClientUpdateMarketService;
	
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
	public String marketList(Model model) {
		
		List<ClientMarketVO> marketList = clientSelectMarketListService.selectMarketList();
		model.addAttribute("marketList", marketList);
		
		return "market/market-list";
	}
	
	@RequestMapping(value = "/market-update.do", method = RequestMethod.GET)
	public String updateFormMarket(int marketTbNo, Model model) {
		
		ClientMarketVO clientMarketVO = clientSelectMarketService.selectMarket(marketTbNo);
		
		model.addAttribute("market", clientMarketVO);
		return "market/market-update";
	}
	
	@RequestMapping(value = "/market-update.do", method = RequestMethod.POST)
	public String updateMarket(ClientMarketVO clientMarketVO, HttpServletRequest request) {
		
		ClientUpdateMarketService.updateMarket(clientMarketVO, request);
		
		return "redirect: market-read.do?marketTbNo=" + clientMarketVO.getMarketTbNo();
	}
	
	@RequestMapping("/market-delete.do")
	public String marketDelete(int marketTbNo) {
		
		clientDeleteMarketService.deleteMarket(marketTbNo);
		
		return "redirect: market-list.do";
	}
}
