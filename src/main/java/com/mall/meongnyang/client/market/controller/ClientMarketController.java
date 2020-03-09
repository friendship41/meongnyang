package com.mall.meongnyang.client.market.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.mall.meongnyang.client.market.service.ClientDeleteMarketService;
import com.mall.meongnyang.client.market.service.ClientInsertMarketService;
import com.mall.meongnyang.client.market.service.ClientSelectMarketListService;
import com.mall.meongnyang.client.market.service.ClientSelectMarketService;
import com.mall.meongnyang.client.market.service.ClientUpdateMarketService;
import com.mall.meongnyang.client.market.vo.ClientMarketVO;
import com.mall.meongnyang.client.market.vo.MarketListPaging;
import com.mall.meongnyang.client.member.vo.ClientCustomerVO;
import com.mall.meongnyang.client.mypage.service.ClientSelectMyinfoAddressListService;
import com.mall.meongnyang.client.mypage.vo.ClientCmAddressVO;

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
	
	@Autowired
	private ClientSelectMyinfoAddressListService addressListService;
	
	@RequestMapping(value = "/market-form.do", method = RequestMethod.GET)
	public String marketForm(HttpSession session, Model model) {
		
		ClientCustomerVO vo = (ClientCustomerVO) session.getAttribute("customer");
		
		ClientCmAddressVO clientCmAddressVO = new ClientCmAddressVO();
		clientCmAddressVO.setCustomerTbNo(vo.getCustomerTbNo());		
		
		model.addAttribute("addressList", addressListService.selectMyinfoAddressList(clientCmAddressVO));
		
		return "market/market-form";
	}
	
	@RequestMapping(value = "/market-form.do", method = RequestMethod.POST)
	public String insertMarket(ClientMarketVO clientMarketVO, HttpServletRequest request) {
		
		clientInsertMarketService.insertMarket(clientMarketVO, request);
		
		return "redirect: market-list.do";
	}
	
	@RequestMapping(value = "/market-list.do")
	public String selectMarketList(@RequestParam(defaultValue = "1") int currentPage, ClientMarketVO clientMarketVO, Model model) {
		
		MarketListPaging paging = new MarketListPaging(currentPage);
		paging.createPaging(clientSelectMarketListService.selectCountMarket(clientMarketVO));
		
		clientMarketVO.setStartRow(paging.getStartRow());
		clientMarketVO.setEndRow(paging.getEndRow());
		
		List<ClientMarketVO> marketList = clientSelectMarketListService.selectMarketList(clientMarketVO);
		
		model.addAttribute("marketList", marketList);
		model.addAttribute("paging", paging);
		model.addAttribute("selector", clientMarketVO.getMarketTbSellOrBuy());
		return "market/market-list";
	}
	
	@RequestMapping(value = "/market-update.do", method = RequestMethod.GET)
	public String updateFormMarket(ClientMarketVO clientMarketVO, Model model) {
		
		ClientMarketVO clientMarket = clientSelectMarketService.selectMarket(clientMarketVO);
		
		model.addAttribute("market", clientMarket);
		return "market/market-update";
	}
	
	@RequestMapping(value = "/market-update.do", method = RequestMethod.POST)
	public String updateMarket(ClientMarketVO clientMarketVO, HttpServletRequest request) {
		
		ClientUpdateMarketService.updateMarket(clientMarketVO, request);
		
		return "redirect: market-read.do?marketTbNo=" + clientMarketVO.getMarketTbNo();
	}
	
	@RequestMapping("/market-delete.do")
	public String marketDelete(ClientMarketVO clientMarketVO) {
		
		clientDeleteMarketService.deleteMarket(clientMarketVO);
		
		return "redirect: market-list.do";
	}
}
